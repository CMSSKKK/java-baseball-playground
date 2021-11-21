package ver2;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberGenerater numberGenerater = new NumberGenerater();
        numberGenerater.setList();

        Referee referee = new Referee();

        Judgement judgement;
        referee.printOrder();
        while(referee.playingGame) {

            String userInput = scanner.next();

            if(userInput.equals("2")) {
                referee.retryOrNot(userInput);
                continue;
            }

            if(userInput.equals("1")) {
                numberGenerater.setList();
                referee.printOrder();
                continue;
            }

            List<Integer> userNumbers = numberGenerater.StringToList(userInput);

            judgement = new Judgement();

            judgement.checkStrikeAndBall(numberGenerater.getList(), userNumbers);

            referee.printAnswer(judgement);


        }

    }
}
