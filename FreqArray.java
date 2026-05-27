public class FreqArray{
    public static void freq(int n){
        int freq[] = new int[10];
        while(n>0){
            int dig = n%10;
            freq[dig] += 1;
            n/=10;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
                System.out.println(i+" -> "+freq[i]);
            }
        }
    }
    public static void main(String args[]){
        int a=122334;
        freq(a);
    }
}