public class Main {
    public static void main(String[] args) {
        int min = 10;
        int max = 100;
        System.out.println(numInRange(min, max, 290));
    }

    public static boolean numInRange(int min, int max, int comparsionNum) {
        if(comparsionNum >= min && comparsionNum <= max) {
            return true;
        } else {
            throw new ArithmeticException("Errore");
        }
    }
}
