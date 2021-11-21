package ver2;

public class Referee {
    public boolean playingGame;

    Referee() {
        this.playingGame = true;
    }

    void printAnswer(Judgement judgement) {

        if(judgement.answer) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            return;
        }

        StringBuilder sb = new StringBuilder();

        if(judgement.ball > 0) {
            sb.append(judgement.ball).append("볼 ");
        }

        if(judgement.strike > 0) {
           sb.append(judgement.strike).append("스트라이크");
        }

        if(judgement.count == 0) {
            sb.append("아웃");
        }
        sb.append('\n').append("숫자를 입력해 주세요 : ");
        System.out.println(sb.toString());

    }

    void retryOrNot(String command) {
        if(command.equals("2")) {
            this.playingGame = false;
        }
    }

    void printOrder() {
        System.out.print("숫자를 입력해 주세요 : ");
    }
}
