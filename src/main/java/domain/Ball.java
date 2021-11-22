package domain;

public class Ball {
    private int ballNo;
    private int index;

    public Ball(int ballNo) {
        this.ballNo = ballNo;
        this.index = 0;
    }
    public Ball(int ballNo,int index) {
        this.ballNo = ballNo;
        this.index = index;
    }


    public boolean isValiNo() {

        if(this.ballNo <= 0 && this.ballNo > 9) {
            throw new IllegalArgumentException();
        }
         return true;
    }

    public Referee compareNo(Ball ball) {
       if(this.ballNo == ball.ballNo) {
           if (this.index != ball.index) {
               return Referee.BALL;
           }
           return Referee.STRIKE;
       }

       return Referee.NOTHING;
    }
}
