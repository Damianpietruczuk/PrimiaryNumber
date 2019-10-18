public class Factorial {

    public int fiveFactorial(){
        return 1*2*3*4*5;
    }

    public long factorial(int number){
        long result = 1;
        if (number>0)
            result= number*factorial(number-1);
        return result;
    }
}
