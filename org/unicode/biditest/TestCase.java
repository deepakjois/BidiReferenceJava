package org.unicode.biditest;

class TestCase {
    public byte[] codes;
    public byte[] pbTypes;
    public int[] pbValues;

    public TestCase(byte[] codes, byte[] pbTypes, int[] pbValues) {
        this.codes = codes;
        this.pbTypes = pbTypes;
        this.pbValues = pbValues;
    }

    public static TestCase[] generate() {
        return new TestCase[]{

        };
    }
}
