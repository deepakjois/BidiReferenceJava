package org.unicode.biditest;


import org.unicode.bidi.BidiReference;

import java.util.Arrays;

public class BidiTest {

    public static void main(String[] args) {
        final byte[] codes = new byte[]{1,3,18,3,7,2,18};
        byte[] pbTypes     = new byte[]{2,2,0,2,2,2,1};
        int[]pbValues      = new int[]{0,0,40,0,0,0,40};

        final BidiReference bidi = new BidiReference(codes, pbTypes, pbValues, (byte)1);
        System.out.println("Final result levels:");
        System.out.println(Arrays.toString(bidi.getLevels(new int[]{codes.length})));
        System.out.println("Final Reordering");
        System.out.println(Arrays.toString(bidi.getReordering(new int[]{codes.length})));
    }
}
