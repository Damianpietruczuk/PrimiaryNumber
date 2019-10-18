public class Factorial {

    public int fiveFactorial() {
        return 1 * 2 * 3 * 4 * 5;
    }

    public static long factorial(int number) {
        long result;
        if (number > 1)
            return number * factorial(number - 1);
        else if (number==1 || number ==0)
            return 1;
        else
            return 0;
    }
}
