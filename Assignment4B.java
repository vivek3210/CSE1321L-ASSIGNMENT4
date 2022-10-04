import java.util.Scanner;
public class Assignment4B {
    public static void main(String[] args) {
        float num;
        int choice = 0;
        System.out.println("Welcome!");
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a number: ");

        num = input.nextFloat();
        while (choice != 4) {
            if (num == 0) {
                System.out.println("What would you like to do to this number:");
                System.out.println("-1- Re-enter the number");
                System.out.println("0- Get the additive inverse of the number");
                System.out.println("2- Square the number");
                System.out.println("3- Cube the number");
                System.out.println("4- Exit the program\n");
                choice = input.nextInt();
                while (choice < -1 || choice > 4)
                {
                    System.out.println("\nPlease enter a valid number between -1 and 4: ");
                    choice = input.nextInt();
                }
                switch (choice) {
                    case -1:
                        System.out.println("Please input a number: ");
                        num = input.nextFloat();
                        break;
                    case 0:
                        System.out.println("\nThe additive inverse of " + num + " is " + -(num));
                        num = -(num);
                        break;

                    case 1:
                        System.out.println("\nThe reciprocal of " + num + " is " + (1 / num));
                        num = (1 / num);
                        break;

                    case 2:
                        System.out.println("\nThe square of " + num + " is " + (num * num));
                        num = (num * num);
                        break;

                    case 3:
                        System.out.println("\nThe cube of " + num + " is " + (num * num * num));
                        num = (num * num * num);
                        break;

                    case 4:
                        System.out.println("\nThank you, goodbye!");
                        break;

                    default:
                        System.out.println("\nPlease enter a valid number between -1 and 4: ");
                        break;
                }
            }
            if (num != 0) {
                System.out.println("What would you like to do to this number:");
                System.out.println("-1- Re-enter the number");
                System.out.println("0- Get the additive inverse of the number");
                System.out.println("1- Get the reciprocal of the number");
                System.out.println("2- Square the number");
                System.out.println("3- Cube the number");
                System.out.println("4- Exit the program\n");

                choice = input.nextInt();
                while (choice < -1 || choice > 4)
                {
                    System.out.println("\nPlease enter a valid number between -1 and 4: ");
                    choice = input.nextInt();
                }
                switch (choice) {
                    case -1:
                        System.out.println("Please input a number: ");
                        num = input.nextFloat();
                        break;
                    case 0:
                        System.out.println("\nThe additive inverse of " + num + " is " + -(num));
                        num = -(num);
                        break;

                    case 1:
                        System.out.println("\nThe reciprocal of " + num + " is " + (1 / num));
                        num = (1 / num);
                        break;

                    case 2:
                        System.out.println("\nThe square of " + num + " is " + (num * num));
                        num = (num * num);
                        break;

                    case 3:
                        System.out.println("\nThe cube of " + num + " is " + (num * num * num));
                        num = (num * num * num);
                        break;

                    case 4:
                        System.out.println("\nThank you, goodbye!");
                        break;

                    default:
                        System.out.println("\nPlease enter a valid number between -1 and 4: ");
                        choice = input.nextInt();
                        break;


                }
            }
        }
    }
}


