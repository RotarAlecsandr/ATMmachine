package ATM;

public class CatchingAnException extends Exception {

    public static void catchingAnExceptionNumber(){
        try{
            if (ATMMachine.banknotes != ATMMachine.number && ATMMachine.banknotes1 != ATMMachine.number && ATMMachine.banknotes2 != ATMMachine.number){
                throw new ArithmeticException("К сожалению отсутсвуют нужные купюры.");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void catchingAnExceptionBalance(){
        try {
            if (ATMMachine.sum1 > Card.balance){
                throw new ArithmeticException("У вас недостаточный баланс.");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
    public static void theOperationIsNotPossible(){
        try{
        if (ATMMachine.sum1 % ATMMachine.banknotes != 0 && ATMMachine.sum1 % ATMMachine.banknotes1 != 0 && ATMMachine.sum1 % ATMMachine.banknotes2 != 0){
            throw new ArithmeticException("Операция не возможна. К сожалению отсутсвуют нужные купюры.");
            }
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

