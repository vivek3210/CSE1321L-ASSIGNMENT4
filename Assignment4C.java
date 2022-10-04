import java.util.Scanner;
public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {
        String sentence = "";
        int backspace;
        System.out.println("[Backspace Animation]");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your sentence:");
        sentence = input.nextLine();
        System.out.println("How many letters do you want to backspace?");
        backspace = input.nextInt();
        System.out.print(sentence);
        for (int amountBackspaced = 0; amountBackspaced < backspace; amountBackspaced++)
        {
            Thread.sleep(500);
            System.out.print("\b");
        }
    }
}
