package domain;

public class Referee {

    private static String ball = "볼 ";
    private static String strike = "스트라이크";
    private static String nothing ="낫싱";

    public String basicOrder() {
        return "숫자를 입력해 주세요 : ";
    }

    public String reportResult(PlayResult playResult) {
        if(playResult.ballAndStrike()) {
            return playResult.getBall()+ball+playResult.getStrike()+strike;
        }

        if(playResult.isNothing()) {
            return nothing;
        }

        if(playResult.correctAnswer()) {
            return "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
        }

        if(playResult.noBall()) {
            return playResult.getStrike()+strike;
        }

        if(playResult.noStrike()) {
            return playResult.getBall()+ball;
        }

        return nothing;
    }
}
