package ATM;

import java.io.IOException;
import java.util.Scanner;

import static ATM.Card.balance;

public class Test {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("""
                        Выберите операцию:\s
                        1 - Проверка баланса:\s
                        2 - Снятие наличных:\s
                        3 - Пополнение баланса: \s
                        4 - Просмотр максимальной суммы снятия наличных, и какими купюрами возможна выдача: \s
                        5 - Выйти из программы.""");
                int count = scanner.nextInt();
                switch (count) {
                    case 1:
                        System.out.println("Ваш баланс составляет " + balance + " рубля");
                        ATMMachine.return_to_the_main_menu();
                        break;
                    case 2:
                        ATMMachine.cashWithdrawal();
                        break;
                    case 3:
                        ATMMachine.replenishment_of_the_balance();
                        break;
                    case 4:
                        Card.maximum_amount();
                        ATMMachine.return_to_the_main_menu();
                    break;
                    case 5:
                        System.out.println("До новых встреч...");
                        return;
                    default:
                        break;
                }
            }
        }
    }
