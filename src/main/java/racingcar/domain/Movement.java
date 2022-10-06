package racingcar.domain;

public class Movement {
    public static final int MOVE_MIN_VALUE = 4;
    public static final int CHECK_MAX_VALUE = 9;
    private int distance = 0;

    public void moving(int value) {
        if(value >= MOVE_MIN_VALUE && value <= CHECK_MAX_VALUE){
            this.distance++;
        }
    }

    public int getDistance() {
        return this.distance;
    }
}
