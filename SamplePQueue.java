import java.util.*;
import java.util.PriorityQueue;
public class SamplePQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(7);
        pq.offer(6);
        pq.offer(8);
        pq.offer(9);
        pq.alopaskda();
        while (!pq.isEmpty()) {
            System.out.print(pq.remove() + "\t");
        }
    }
   
}