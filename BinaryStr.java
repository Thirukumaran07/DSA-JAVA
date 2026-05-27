public class BinaryStr{
    public static void gene(String s, int n){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        gene(s+"0",n);
        gene(s+"1",n);
    }
    public static void main(String[] args) {
        int n = 2;
        gene("",n);
    }
}