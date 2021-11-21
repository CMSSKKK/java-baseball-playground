import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    private ArrayList<Integer> list;

    Computer(int a, int b, int c) {
        list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
    }

    Computer() {
        list = new ArrayList<>();
        while (list.size() < 3) {
            int number = new Random().nextInt(9) + 1;
            if (list.contains(number)) {
                continue;
            }
            list.add(number);
        }
    }
    int validNumberCheck(String userNumber) {
        if(userNumber.length() !=3) {
            throw new IllegalArgumentException();
        }
        return Integer.parseInt(userNumber);
    }

    List<Integer> numberToArray(String userNumber) {
        List<Integer> userList = new ArrayList<>();
        int target = validNumberCheck(userNumber);

        userList.add(target/100);
        target %= 100;
        userList.add(target/10);
        target %= 10;
        userList.add(target);

        return userList;
    }


    void correctCheck(List<Integer> userList) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i<3; i++) {
            int target = userList.get(i);
            for (int j = 0; j<3; j++) {
                if(target == list.get(j) && i == j) {
                    strike++;
                } else if(target == list.get(j)) {
                    ball++;
                }
            }
        }

        if(strike == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                           "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
            return;
        }
        if(ball>0 && strike>0) {
            System.out.println(ball+"볼 "+strike+"스트라이크");
            System.out.print("숫자를 입력해주세요 : ");
            return;
        }

        if(strike == 0 && ball == 0) {
            System.out.println("nothing");
            System.out.print("숫자를 입력해주세요 : ");
            return;
        }

        if(strike == 0) {
            System.out.println(ball+"볼");
            System.out.print("숫자를 입력해주세요 : ");
            return;
        }

        if(ball == 0) {
            System.out.println(strike+"스트라이크");
            System.out.print("숫자를 입력해주세요 : ");
            return;
        }
    }
}

