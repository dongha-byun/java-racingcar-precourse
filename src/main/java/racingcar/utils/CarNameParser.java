package racingcar.utils;

public class CarNameParser {

    public static final String NAME_DELIMITER = ",";

    public static String[] parseCarName(String carNameStr) {
        return carNameStr.split(NAME_DELIMITER);
    }
}
