public class OnlineShopping {
    public static void minPrice(int a1, int b1, int c1, int a2, int b2, int c2, int a3, int b3, int c3){
        int price1 = a1 - a1*b1/100 + c1;
        int price2 = a2 - a2*b2/100 + c2;
        int price3 = a3 - a3*b3/100 + c3;
        System.err.println("In flipkart : "+price1);
        System.err.println("In snapdeal : "+price2);
        System.err.println("In amazon : "+price3);
        if(price1<price2 && price1<price3){
            System.out.println("Flipkart");
        }
        else if(price2<price1 && price2<price3){
            System.out.println("Snapdeal");
        }
        else{
            System.out.println("Amazon");
        }
        
    }
    public static void main(String args[]){
        int a1 = 1000;
        int b1 = 50;
        int c1 = 50;
        int a2 = 900;
        int b2 = 50;
        int c2 = 70;
        int a3 = 800;
        int b3 = 10;
        int c3 = 200;
        minPrice(a1,b1,c1,a2,b2,c2,a3,b3,c3);
    }
}