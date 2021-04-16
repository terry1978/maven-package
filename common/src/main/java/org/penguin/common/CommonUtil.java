package org.penguin.common;

import org.apache.commons.lang3.math.Fraction;
public class CommonUtil {

    public static final String getSystemName() {
        return String.format("Windows 10 %s", Fraction.getFraction(5.2));
    }
}
