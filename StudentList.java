import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class StudentList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentListController slc = new StudentListController();
        for (int i = 1 ; i <=3 ; i++ )  {
            String key;
            String value;
            System.out.printf("Enter student number %d: ", i);
            key = s.nextLine();
            System.out.printf("Enter first name %d: ", i);
            value = s.nextLine();
            slc.put(key,value);
        }
        System.out.println("Student List:");
        slc.printList();
        s.close(); // so VSCode can stop telling me about resource leaks...
    }
}
class StudentListController {
    HashMap<String,String> _hm;
    public StudentListController() {
        _hm = new HashMap<String, String>();
    }
    public void put(String key, String value) {
        _hm.put(key, value);
    }
    public void printList() {
        for (Map.Entry e : _hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }

}