public class IsPrimary {
    public static boolean isPrimary(double number){
        int count=0;
        for (double i =1; i<=Math.sqrt(number); i++){
            if (count>1 || number<2){
                return Boolean.FALSE;
            }
            if (number%i==0)
                count++;
        }
        return Boolean.TRUE;
    }
}
