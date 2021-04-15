import java.util.Stack;
public class StackController {
    Stack<String> _data;
    int stackSize;
    public StackController(int stackSizeL) {
        _data = new Stack();
        stackSize = stackSizeL;
    }
    public void push(String item) {
        if (_data.size() < stackSize) {
            _data.push(item);
            System.out.println("Stack push success.");
            getItems();
        } else {
            System.out.println("Stack size limit exceeded!");
            System.out.println("Maximum stack size: " + stackSize + " Current stack size: " + _data.size());
        }
    }
    public void pop() {
        if (_data.isEmpty()) {
            System.out.println("Cannot pop with an empty list. Please add data to stack first");
        } else {
            System.out.println("Stack pop success.");
            System.out.println("Element removed: " + _data.peek());
            getItems();
        }
        
    }
    public void peek() {
        if (_data.isEmpty()) {
            System.out.println("Cannot peek with an empty list. Please add data to stack first");
        } else {
        System.out.println("Top of Stack: " + _data.peek());
        }
    }
    public void getItems() {
        System.out.println("Maximum stack size: " + stackSize + " Current stack size: " + _data.size());
        System.out.println("Stack Items: ");
        System.out.println(_data);
    }
 

}