import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String[] a = {"eat","tea","tan","ate","nat","bat"};
        int n = a.length;
        String[] b = new String[n];
        boolean[] c = new boolean[n];
        for(int i = 0; i < n; i++){
            char[] d = a[i].toCharArray();
            Arrays.sort(d);
            b[i] = new String(d);
        }
        for(int i = 0; i < n; i++){
            if(c[i]) continue;
            System.out.print("[" + a[i]);
            c[i] = true;
            for(int j = i + 1; j < n; j++){
                if(b[i].equals(b[j])){
                    System.out.print(", " + a[j]);
                    c[j] = true;
                }
            }
            System.out.println("]");
        }
    }
}