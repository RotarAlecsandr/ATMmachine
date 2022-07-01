package ATM;

public class Card {

        static int balance = 1000;
        public Card(int n) {
            balance = n;
        }

        public static void maximum_amount() {
            int max = 1000000;
            System.out.println("Максимальная сумма снятия составляет " + max + " рублей.");
        }
        public static void minimum_amount(){
            int min = 10;
            System.out.println("Минимальная сумма снятия составляет " + min + " рублей.");
        }
    }

