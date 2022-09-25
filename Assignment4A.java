import java.util.Scanner;
public class Assignment4A {
    public static void main(String args[]) {
        String answer = "";
        int italyNum = 0;
        int costaNum = 0;
        int paxNum = 0;
        int ghanaNum = 0;

        System.out.println("[CCSE Study Abroad Survey]");
        Scanner input = new Scanner(System.in);
        int counter = 1;
        do
        {
            System.out.println("Student #" + counter + ": Which country should we go to for our next study abroad program?");
            System.out.println("Italy\nCosta Rica\nPax Bisonica\nGhana\n(Type Quit to end the survey)");
            answer = input.next();
            System.out.println("Thank you!\n");

            if (answer.equalsIgnoreCase("Italy"))
            {
                italyNum++;
            }
            else if (answer.equalsIgnoreCase("Costa Rica"))
            {
                costaNum++;
            }
            else if (answer.equalsIgnoreCase("Pax Bisonica"))
            {
                paxNum++;
            }
            else if (answer.equalsIgnoreCase("Ghana"))
            {
                ghanaNum++;
            }

            counter++;
        } while (!answer.equalsIgnoreCase("Quit"));

        System.out.println("[Results]");
        System.out.println("Italy: " + italyNum);
        System.out.println("Costa Rica: " + costaNum);
        System.out.println("Pax Bisonica: " + paxNum);
        System.out.println("Ghana: " + ghanaNum);







    }
}