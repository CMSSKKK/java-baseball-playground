import domain.Balls;
import domain.NumberGenerater;
import domain.PlayResult;
import domain.Referee;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        NumberGenerater numberGenerater = new NumberGenerater();

        List<Integer> answerNumbers = numberGenerater.randomGenerate();
        Referee referee = new Referee();
        Balls answers = new Balls(answerNumbers);
        Scanner scanner = new Scanner(System.in);

        referee.basicOrder();
        while(true) {

            String input = scanner.next();

            if(!referee.nextSign()) {

                if(referee.goOrStop(input)) {
                    answers = new Balls(numberGenerater.randomGenerate());
                    referee.basicOrder();
                    continue;
                }

                break;
            }

            List<Integer> userNumbers = numberGenerater.userInputToList(input);

            PlayResult playResult = answers.play(userNumbers);
            referee.printReport(playResult);

        }
    }
}
