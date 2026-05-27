public class KaprekarNum{
    public static void kapNum(int n){
        int a = n*n;
        int dig = String.valueOf(n).length();
        int div = (int)Math.pow(10,dig);
        if(a%div + a/div == n){
            System.out.println(n + " is a Kaprekar number");
        }
        else{
            System.out.println("Not a Kaprekar number");
        }
    }
    public static void main(String args[]){
        int n = 45;
        kapNum(n);
    }
}