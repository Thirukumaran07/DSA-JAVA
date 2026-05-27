public class Multiply{
    public static void mul(int a, int b){
        int ans = 0;
        for(int i=0;i<a;i++){
            ans+=b;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        mul(a,b);
    }
}