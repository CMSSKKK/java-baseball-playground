package domain;

public class BallNumber {
    private static final int MIN = 1;
    private static final int MAX = 9;
    private int number;

    public BallNumber(int number) {
        if(number < MIN || number >MAX) {
            throw new IllegalArgumentException("잘못된 숫자를 입력하였습니다.");
        }
        this.number = number;
    }

   public boolean isEqual(BallNumber ballNumber) {
        return number == ballNumber.number;
   }
}
