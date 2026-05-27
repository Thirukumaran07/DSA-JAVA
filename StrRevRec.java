public class StrRevRec{
    public static void rev(String s){
        if(s.length()==0){
            return;
        }
        rev(s.substring(1));
        System.out.print(s.charAt(0));
    }
    public static void main(String args[]){
        String s = "Hellloo";
        rev(s);
    }
}