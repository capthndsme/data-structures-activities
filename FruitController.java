 
import java.util.Stack;
public class FruitController {
    private Stack<String> mStack;
    public FruitController() {
        mStack = new Stack<String>();
    } 
    public void catchFruits(String fruitName) {
        mStack.add(fruitName);
    }
    public int getFruitSize() {
        return mStack.size();
    }
    public void eatFruit() {
        mStack.pop();    
    }
    public Object getContents() {
        return mStack;
    }
    public Boolean isEmpty() {
        return mStack.isEmpty();
    }
}
