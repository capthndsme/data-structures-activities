import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MovieTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueManager snackQueue = new QueueManager();
        QueueManager movieQueue = new QueueManager();
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter movie %d of 3: ", i);
            movieQueue.addToQueue(sc.nextLine());
        }
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter snack %d of 3: ", i);
            snackQueue.addToQueue(sc.nextLine());
        }
        System.out.println("Movies to watch are: deque(" + movieQueue.getQueue() + ")");
        System.out.println("Snacks available are: deque(" + snackQueue.getQueue() + ")");
        System.out.println("Press S each available you finish a snack.");
 
        for (int i = 0; i < 3;) {
            String action = sc.nextLine();
            if (action.equals("S")) {
                snackQueue.pollQueue();
                if (snackQueue.isEmpty()){ 
                    System.out.println("No more snacks");
                } else {
                    System.out.println("deque(" + snackQueue.getQueue() + ")");
                }
                
                i++;
            }  
        }
 
    }
}

class QueueManager {
    Queue<String> _q;
    public QueueManager() {
        _q = new LinkedList<String>();
    }
    public void addToQueue(String s) {
        _q.offer(s);
    }
    public Object getQueue() {
        return _q;
    }
    public String pollQueue() {
        return _q.poll();
    }
    public Boolean isEmpty() {
        return _q.isEmpty();
    }
}
