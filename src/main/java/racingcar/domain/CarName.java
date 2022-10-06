package racingcar.domain;

public class CarName {

    public static final int MIN_SIZE = 1;
    public static final int MAX_SIZE = 5;
    public static final String BLANK_PATTERN = " ";
    private final String name;

    public CarName(String name) {
        this.name = name;
        validateCarNameSize();
        validateBlankInCarName();
    }


    public void validateCarNameSize() {
        if(name.length() < MIN_SIZE || name.length() > MAX_SIZE){
            throw new IllegalArgumentException("이름은 " + MIN_SIZE + "자 이상 " + MAX_SIZE + "자 이하여야 합니다.");
        }
    }

    public void validateBlankInCarName() {
        if(this.name.contains(BLANK_PATTERN)){
            throw new IllegalArgumentException("이름에는 공백이 들어갈 수 없습니다.");
        }
    }
}
