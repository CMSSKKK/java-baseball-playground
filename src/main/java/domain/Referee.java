package domain;

import java.security.PublicKey;

public class Referee {

    public boolean continueGame;
    private static String ball = "볼 ";
    private static String strike = "스트라이크";
    private static String nothing ="낫싱";

    public Referee() {
        this.continueGame = true;
    }

    public void basicOrder() {
        System.out.print("숫자를 입력해 주세요 : ");
    }

    private void afterCorrectAnswer() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public String reportResult(PlayResult playResult) {

        if(playResult.isNothing()) {
            return nothing;
        }

        if(playResult.correctAnswer()) {
            this.continueGame = false;
            return "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        }

        if(playResult.noBall()) {
            return playResult.getStrike()+strike;
        }

        if(playResult.noStrike()) {
            return playResult.getBall()+ball;
        }

        return playResult.getBall()+ball+playResult.getStrike()+strike;
    }

    public void printReport(PlayResult playResult) {
        System.out.println(reportResult(playResult));

        if(playResult.correctAnswer()) {
            afterCorrectAnswer();
        }
        else {
            basicOrder();
        }
    }

    public boolean goOrStop(String input) {

        if(input.equals("1")) {
            this.continueGame = true;
            return true;
        }

        if(input.equals("2")) {
            return false;
        }

        throw new IllegalArgumentException("숫자를 잘못 입력하셨습니다.");
    }

    public boolean nextSign() {
        return this.continueGame;
    }
}
