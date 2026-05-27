public class LongKSub{
    public static int longSub(String s,int k){
        int freq[] = new int[256];
        int left = 0;
        int dist = 0;
        int maxlen = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(freq[c]==0){
                dist++;
            }
            freq[c]++;
            while(dist>k){
                char ch = s.charAt(left);
                freq[ch]--;
                if(freq[ch]==0){
                    dist--;
                }
                left++;
            }
            maxlen = Math.max(maxlen, i-left+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println(longSub(s,k));
    }
}