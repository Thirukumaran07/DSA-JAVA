import java.util.*;
class MovingAvg{
    Queue<Integer> q;
    int size;
    double sum;
    public MovingAvg(int size){
        this.size=size;
        q=new LinkedList<>();
        sum=0;
    }
    public double next(int val){
        q.offer(val);
        sum=sum+val;
        if(q.size()>size){
            sum=sum-q.poll();
        }
        return sum/q.size();
    }
}
public class MovingAverage {
    public static void main(String[] args) {
        MovingAvg n=new MovingAvg(3);
        System.out.println(n.next(1));
        System.out.println(n.next(10));
        System.out.println(n.next(3));
        System.out.println(n.next(5));
    }
}