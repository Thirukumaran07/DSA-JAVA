public class Cricket{
    public static void cric(int totalballs, int totalruns, int currentruns, int bowledballs){
        int totalovers = totalballs/6;

        int overs = bowledballs/6;
        int  balls = bowledballs%6;

        double overFinished = overs+balls/10.0;

        double curRunRate = currentruns/overFinished;

        double reqRunRate = (double)totalruns/totalovers;

        System.out.println(totalovers);
        System.out.println(overs+balls*0.1);
        System.out.printf("%.1f\n",curRunRate);
        System.out.println(reqRunRate);
        if(curRunRate>reqRunRate){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String args[]){
        int totalballs = 300;
        int totalruns = 375;
        int currentruns = 78;
        int bowledballs = 45;
        cric(totalballs,totalruns,currentruns,bowledballs);
    }
}