import java.util.Queue;
import java.util.LinkedList;

public class QueueController {
    private Queue _q;
    private int _queueSize;
    public void clear() {
        _q.clear();
    }
    public String peek() { 
        if (_q.isEmpty()) {
            return "Empty queue";
        } else {
            return "Peek: " + _q.peek();
        }
    }
    // Returns removed item if successful, if not, error string.
    public String poll() {
        if (_q.isEmpty()) {
            return "The queue is empty.";
        } else {
            return "Removed item: " + _q.poll();
        }
        
    }
   
    public Boolean offer(String offering) {
        if (_q.size() < _queueSize) {
            _q.offer(offering);
            return true;
        } else {
            return false;
        }
        
    }
    public Object getItems() {
        return _q;
    }
    public int getQueueSize() {
        return _q.size();
    }
    public int getMaxQueueSize() {
        return _queueSize;
    }
    public QueueController(int queueSize) {
        _q = new LinkedList();
        _queueSize = queueSize;
    }
}