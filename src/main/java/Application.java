import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Computer computer = new Computer();

        System.out.print("숫자를 입력해주세요 : ");

        Command currentCommand = Command.GO;

        while(currentCommand == Command.GO) {
            String userInput = scanner.next();

            if(userInput.equals("2")) {
                currentCommand = Command.END;
                continue;
            }

            if(userInput.equals("1")) {
                computer = new Computer();
                System.out.print("숫자를 입력해주세요 : ");
                continue;
            }

            computer.correctCheck(computer.numberToArray(userInput));
        }



    }
}
