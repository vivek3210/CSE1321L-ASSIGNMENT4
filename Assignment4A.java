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

        while (!answer.equalsIgnoreCase("Quit"))
        {
            System.out.println("Student #" + counter + ": Which country should we go to for our next study abroad program?");
            System.out.println("Italy\nCosta Rica\nPax Bisonica\nGhana\n(Type Quit to end the survey)\n");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("Italy"))
            {
                italyNum++;
                System.out.println("Thank you!\n");
            }
            if (answer.equalsIgnoreCase("Costa Rica"))
            {
                costaNum++;
                System.out.println("Thank you!\n");
            }
            if (answer.equalsIgnoreCase("Pax Bisonica"))
            {
                paxNum++;
                System.out.println("Thank you!\n");
            }
            if (answer.equalsIgnoreCase("Ghana"))
            {
                ghanaNum++;
                System.out.println("Thank you!\n");
            }

            counter++;
        }

        System.out.println("[Results]");
        System.out.println("Italy: " + italyNum);
        System.out.println("Costa Rica: " + costaNum);
        System.out.println("Pax Bisonica: " + paxNum);
        System.out.println("Ghana: " + ghanaNum);

        int max = Math.max(italyNum, Math.max(costaNum, Math.max(paxNum, ghanaNum)));

        if (max == italyNum)
        {
            System.out.println("Next year’s study abroad program will take place in Italy.");
        }
        if (max == costaNum)
        {
            System.out.println("Next year’s study abroad program will take place in Costa Rica.");
        }
        if (max == paxNum)
        {
            System.out.println("Next year’s study abroad program will take place in Pax Bisonica.");
        }
        if (max == ghanaNum)
        {
            System.out.println("Next year’s study abroad program will take place in Ghana.");
        }




    }
}