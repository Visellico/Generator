package com.visellico.sudaily;

/**
 * Created by Henry on 1/15/2018.
 */
public class MathUtil {

    private MathUtil() {}

    public static int clamp(int val, int min, int max) {
        int result = val;
        if (val < min) result = min;
        else if (val > max) result = max;

        return result;
    }

}
