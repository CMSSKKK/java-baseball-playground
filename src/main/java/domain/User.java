package domain;

public class User {

    private boolean playing;

    public User() {
        this.playing = true;
    }

    public boolean restart(String input) {
        if(input.equals("2")) {
            return this.playing = false;
        }
        if(input.equals("1")) {
            return this.playing = true;
        }
        throw new IllegalArgumentException("잘못된 숫자를 입력하셨습니다. 게임을 종료합니다.");
    }

    public boolean playingGame() {
        return this.playing;
    }
}
