package com.rusefi.config.generated;

// this file was generated automatically by rusEfi tool ConfigDefinition.jar based on (unknown script) integration/pid_state.txt Sun Jun 28 14:07:46 UTC 2020

// by class com.rusefi.output.FileJavaFieldsConsumer
import com.rusefi.config.*;

public class PidState {
	public static final Field ITERM = Field.create("ITERM", 0, FieldType.FLOAT);
	public static final Field DTERM = Field.create("DTERM", 4, FieldType.FLOAT);
	public static final Field TARGET = Field.create("TARGET", 8, FieldType.FLOAT);
	public static final Field INPUT = Field.create("INPUT", 12, FieldType.FLOAT);
	public static final Field OUTPUT = Field.create("OUTPUT", 16, FieldType.FLOAT);
	public static final Field ERRORAMPLIFICATIONCOEF = Field.create("ERRORAMPLIFICATIONCOEF", 20, FieldType.FLOAT);
	public static final Field PREVIOUSERROR = Field.create("PREVIOUSERROR", 24, FieldType.FLOAT);
	public static final Field[] VALUES = {
	ITERM,
	DTERM,
	TARGET,
	INPUT,
	OUTPUT,
	ERRORAMPLIFICATIONCOEF,
	PREVIOUSERROR,
	};
}
