public class SameDig{
    public static void digCheck(int n,int m){
        int freq1[] = new int[10];
        int freq2[] = new int[10];
        while(n>0){
            int dig = n%10;
            freq1[dig] += 1;
            n/=10;
        }
        while(m>0){
            int dig = m%10;
            freq2[dig] += 1;
            m/=10;
        }
        boolean same = true;
        for(int i=0;i<freq1.length;i++){
            if(freq1[i] != freq2[i]){
                same = false;
                break;                
            }
        }
        if(same){
            System.out.println("Same");
        }
        else{
            System.out.println("Diff");
        }
    }
    public static void main(String args[]){
        int a = 12345;
        int b = 54321;
        digCheck(a,b);
    }
}