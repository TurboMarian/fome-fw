/*
 * @file test_on_demand_parameters.cpp
 *
 *  Created on: Jan 16, 2019
 * @author Andrey Belomutskiy, (c) 2012-2018
 */

#include <unordered_map>
#include "unit_test_framework.h"
using namespace std;

class TestParameters {
public:
	unordered_map<string, float> values;
	TestParameters* put(string key, float value);
	float get(string key) const;
};

TestParameters* TestParameters::put(string key, float value) {
	values[key] = value;
	return this;
}

float TestParameters::get(string key) const {
	// WAT? 'contains' method only defined in C++20?!
	std::unordered_map<std::string, float>::const_iterator got = values.find (key);
	if (got == values.end())
		throw "No value for this key: " + key;
	return values[key];
}

#undef METHOD_SIGNATURE
#define METHOD_SIGNATURE TestParameters *parameterValues

#define GET_VALUE(x) parameterValues->get(#x)

static float methodWeWantToTestWhichUsesKey1AndKey2(METHOD_SIGNATURE) {
	return GET_VALUE(key1) + GET_VALUE(key2);
}

static float methodWeWantToTestWhichUsesKey3(METHOD_SIGNATURE) {
	return GET_VALUE(key3);
}

TEST(util, readValues) {
	TestParameters* v = (new TestParameters())->put("key2", 20)->put("key1", 10);

	ASSERT_FLOAT_EQ(30, methodWeWantToTestWhichUsesKey1AndKey2(v));
}

TEST(util, checkForMissingParameterHandling) {
	TestParameters* v = (new TestParameters())->put("key2", 2);
	try {
		methodWeWantToTestWhichUsesKey3(v);
		FAIL() << "Expected 'missing key3' exception";
	} catch(string message) {
		// exception about missing value is expected
		ASSERT_TRUE(message.find("No value for this key") >= 0);
		ASSERT_TRUE(message.find("key3") >= 0);
	}
}


