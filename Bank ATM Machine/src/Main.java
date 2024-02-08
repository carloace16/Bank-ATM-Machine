import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      int totalMoney = 100000;
      int withraw;
      int deposit;

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("================================================");
            System.out.println("----------Welcome to Bank ATM Machine-----------");
            System.out.println("----------Press 1 to Withraw--------------------");
            System.out.println("----------Press 2 to Deposit--------------------");
            System.out.println("----------Press 3 to Check your Balance---------");
            System.out.println("----------Press 4 to EXIT-----------------------");
            System.out.println("================================================");
            System.out.println();
            System.out.print("Press the number you want to perform: ");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter the amount of money you want to withraw: ");
                    withraw = scanner.nextInt();

                    if (totalMoney >= withraw){
                        totalMoney = totalMoney - withraw;
                        System.out.println("Please collect your money");
                        System.out.println("Your remaining Balance is: " + totalMoney);
                    }else {
                        System.out.println("You dont have enough balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter the money you want to deposit: ");
                    deposit = scanner.nextInt();
                    totalMoney = totalMoney + deposit;
                    System.out.println("Your money has been successfully deposited to your Bank Account");
                    System.out.println("Your total Balance is: " + totalMoney);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance: " + totalMoney);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}