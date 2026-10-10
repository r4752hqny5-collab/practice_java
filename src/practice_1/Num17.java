package practice_1;

public class Num17 {
    public static long factorial(int n) {
        long result = 1;

        for ( int i = 2; i<= n; i++ ){
            result *= i;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
        System.out.println("0! = " + factorial(0));
        System.out.println("1! = " + factorial(1));
    }
}
