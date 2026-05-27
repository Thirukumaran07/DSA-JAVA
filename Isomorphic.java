public class Isomorphic{
    public static boolean isIsomorphic(String s1,String s2){
        if(s1.length()!=s2.length())
            return false;
        int a1[] = new int[256];
        int a2[] = new int[256];
        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(a1[c1]==0 && a2[c2]==0){
                a1[c1]=c2;
                a2[c2]=c1;
            }
            else if(a1[c1]!=c2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}