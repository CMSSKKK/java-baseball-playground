package domain;

public class BallNumber {
    private int number;

    public BallNumber(int number) {
        if(number < 1 || number >9) {
            throw new IllegalArgumentException("잘못된 숫자를 입력하였습니다.");
        }
        this.number = number;
    }

   public boolean isEqual(BallNumber ballNumber) {
        return number == ballNumber.number;
   }
}
