package racingcar.utils;

import java.util.regex.Pattern;

public class MovementUtils {
    public static int validateOnlyNumber(String input) {
        if(!Pattern.matches("^\\d*$", input)){
            throw new IllegalArgumentException("");
        }
        return Integer.parseInt(input);
    }
}
