import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter characters (enter \"stop\" if you want to exit)") ;

        do {
            String enteredLine = userInput.nextLine().replaceAll("\\s+", "");
            Alphapet alphapet = new Alphapet();
            alphapet.printVauesOfAlphapet(enteredLine);
            System.out.println();
        } while (!userInput.hasNext("stop"));

    }
}

