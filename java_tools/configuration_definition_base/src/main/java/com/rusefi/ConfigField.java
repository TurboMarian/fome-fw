package com.rusefi;

import com.rusefi.core.Pair;
import com.rusefi.output.ConfigStructure;

public interface ConfigField {
    ConfigField VOID = new ConfigField() {
        @Override
        public ConfigStructure getStructureType() {
            return null;
        }

        @Override
        public boolean isArray() {
            return false;
        }

        @Override
        public String getArraySizeVariableName() {
            return null;
        }

        @Override
        public String getTrueName() {
            return null;
        }

        @Override
        public String getFalseName() {
            return null;
        }

        @Override
        public boolean isBit() {
            return false;
        }

        @Override
        public boolean isDirective() {
            return false;
        }

        @Override
        public int getSize(ConfigField next) {
            return 0;
        }

        @Override
        public int[] getArraySizes() {
            return new int[0];
        }

        @Override
        public String getComment() {
            return null;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public String getType() {
            return null;
        }

        @Override
        public int getElementSize() {
            return 0;
        }

        @Override
        public boolean isIterate() {
            return false;
        }

        @Override
        public boolean isHasAutoscale() {
            return false;
        }

        @Override
        public ReaderState getState() {
            return null;
        }

        @Override
        public String getTsInfo() {
            return null;
        }

        @Override
        public boolean isFsioVisible() {
            return false;
        }

        @Override
        public String autoscaleSpec() {
            return null;
        }

        @Override
        public double autoscaleSpecNumber() {
            return 0;
        }

        @Override
        public Pair<Integer, Integer> autoscaleSpecPair() {
            return null;
        }

        @Override
        public String getUnits() {
            return null;
        }

        @Override
        public double getMin() {
            return 0;
        }

        @Override
        public double getMax() {
            return 0;
        }

        @Override
        public int getDigits() {
            return 0;
        }

        @Override
        public String getIterateOriginalName() {
            return null;
        }

        @Override
        public int getIterateIndex() {
            return 0;
        }

        @Override
        public boolean isFromIterate() {
            return false;
        }

        @Override
        public String getCommentTemplated() {
            return null;
        }
    };

    ConfigStructure getStructureType();

    boolean isArray();

    String getArraySizeVariableName();

    String getTrueName();

    String getFalseName();

    boolean isBit();

    boolean isDirective();

    int getSize(ConfigField next);

    int[] getArraySizes();

    String getComment();

    String getName();

    String getType();

    int getElementSize();

    boolean isIterate();

    boolean isHasAutoscale();

    ReaderState getState();

    String getTsInfo();

    boolean isFsioVisible();

    String autoscaleSpec();

    double autoscaleSpecNumber();

    Pair<Integer, Integer> autoscaleSpecPair();

    String getUnits();

    double getMin();

    double getMax();

    int getDigits();

    String getIterateOriginalName();

    int getIterateIndex();

    boolean isFromIterate();

    String getCommentTemplated();
}
