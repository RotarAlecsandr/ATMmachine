package ATM;

import java.io.IOException;
import java.util.Scanner;
import static ATM.Card.balance;

public class ATMMachine extends CatchingAnException {
    public static int number;
    static Scanner scanner = new Scanner(System.in);
    static int banknotes = 20;
    static int availability_of_banknotes = 100000;
    static int banknotes1 = 50;
    static int availability_of_banknotes1 = 100;
    static int banknotes2 = 100;
    static int availability_of_banknotes2 = 100;
    static int sum1;

    public static void cashWithdrawal() throws IOException { // снятие наличных.
        System.out.println("Введите сумму, которую хотите снять. Или нажмите 1 для возврата в главное меню.");
        sum1 = scanner.nextInt();
        while (true) {
            if (sum1 < banknotes) {
                Card.minimum_amount();
                System.out.println("Попробуйте еще раз...");
                break;
            }
            if (sum1 > balance) {
                CatchingAnException.catchingAnExceptionBalance();
                System.out.println("Попробуйте еще раз...");
                break;
            }
            if (sum1 % 10 == 0) {
                System.out.println("Ведите номинал купюр которые хотите получить \n (на данный момент в банкомате имеются " +
                        " купюры наминало 10, 50, 100 рублей). Или нажмите 1 для возврата в главное меню.");
                int number = scanner.nextInt();
                int remains;
                int count = 1;
                if (number == banknotes) {
                    balance = balance - sum1;
                    remains = sum1 / number;
                    availability_of_banknotes = availability_of_banknotes - remains;
                    println();
                    System.out.println("Остаток купюр номиналом  10 рублей в банкомате составляет " + availability_of_banknotes + " банкнот");
                }
                if (banknotes1 == number) {
                    balance = balance - sum1;
                    remains = sum1 / number;
                    availability_of_banknotes1 = availability_of_banknotes1 - remains;
                    println();
                    System.out.println("Остаток купюр номиналом  50 рублей в банкомате составляет " + availability_of_banknotes1 + " банкнот");
                }
                if (banknotes2 == number) {
                    balance = balance - sum1;
                    remains = sum1 / number;
                    availability_of_banknotes2 = availability_of_banknotes2 - remains;
                    println();
                    System.out.println("Остаток купюр номиналом  100 рублей в банкомате составляет " + availability_of_banknotes2 + " банкнот");
                }
                if (number == count) {
                    break;
                }
            } else {
                    CatchingAnException.catchingAnExceptionNumber();
                    System.out.println("Попробуйте еще раз...");
                    break;
                }



        }
    }



    public static void replenishment_of_the_balance() {
        while (true) {
            System.out.println("Вставьте купюру которую хотите зачислить на карт счет. Или нажмите 1 для возврата в главное меню.");
            int count = scanner.nextInt();
            int count1 = 1;
            if (count == banknotes) {
                balance = balance + count;
                availability_of_banknotes = availability_of_banknotes + count1;
                System.out.println("Вы внесли банкноту " + count + " рублей, ваш баланс составляет " + balance + " рублей.");
            } else if (count == banknotes1) {
                balance = balance + count;
                availability_of_banknotes1 = availability_of_banknotes1 + count1;
                System.out.println("Вы внесли банкноту " + count + " рублей, ваш баланс составляет " + balance + " рублей.");
            } else if (count == banknotes2) {
                balance = balance + count;
                availability_of_banknotes2 = availability_of_banknotes2 + count1;
                System.out.println("Вы внесли банкноту " + count + " рублей, ваш баланс составляет " + balance + " рублей.");
            } else if (count == 1) {
                break;
            }
        }
    }
    public static void println(){
        System.out.println("Операция выполнена успешна. Заберите деньги. \n Остаток на вашей карте составляет " + balance + " рублей");
    }
    public static void return_to_the_main_menu(){
        System.out.println("На данный момент в банкомате имеются имеются купюры следующим номиналом");
        System.out.println(banknotes + " рублей в количестве " + availability_of_banknotes + " купюр.");
        System.out.println(banknotes1 + " рублей в количестве " + availability_of_banknotes1 + " купюр.");
        System.out.println(banknotes2 + " рублей в количестве " + availability_of_banknotes2 + " купюр.");
    }
}




