public class CocoTree{
    public static void isCoconut(int m, int n, int k){
        if(k<m || k%n == 1 || k%n==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String args[]){
        int m = 2;
        int n = 5;
        int k = 8;
        isCoconut(m,n,k);
    }
}