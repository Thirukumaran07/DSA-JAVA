public class Chocolate{
    public static void noOfChoco(int a[]){
        int x=a[0],y=a[1],z=a[2];
        int coco = x/y;
        int wrap = coco;
        while(wrap>=z){
            int extra = wrap/z;
            coco+=extra;
            wrap=extra+(wrap%z);
        }
        System.out.println(coco);
    }
    public static void main(String args[]){
        int n = 3;
        int a[][] = {{10,2,5},{12,4,4},{6,2,2}};
        for(int i=0;i<n;i++){
            noOfChoco(a[i]);
        }
    }
}