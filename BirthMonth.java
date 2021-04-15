import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
public class BirthMonth {
    public static void main(String[] args) {
        Scanner scammer = new Scanner(System.in);

        HashComparator hc = new HashComparator();
        HashController group1 = new HashController();
        HashController group2 = new HashController();
        HashController self = new HashController();
        // Group 1
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter birth month %d: ", i);
            group1.addMap(scammer.nextLine());
        }
        // Group 2
        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter birth month %d: ", i);
            group2.addMap(scammer.nextLine());
        }
        System.out.println("Group 1: " + group1.getItems());
        System.out.println("Group 2: " + group2.getItems());
        System.out.print("Enter your birth month: ");
        self.addMap(scammer.nextLine());
        System.out.println("Union: " + hc.union(group1.getItems(), group2.getItems()));
        System.out.println("Intersection: " + hc.intersection(group1.getItems(), group2.getItems()));
        System.out.println("Diff: " + hc.diff(group1.getItems(), group2.getItems()));
        if (hc.selfInTwoSets(group1.getItems(), group2.getItems(), self.getItems())) {
            System.out.println("You have the same birth month with one of your classmates.");
        } 

        scammer.close(); // so VSCode can stop telling me about resource leaks...
    }
 
}

class HashController {
    Set _hashSet;
    public HashController() {
        _hashSet = new HashSet();
    }
    public void addMap(String str) {
        _hashSet.add(str);
    }
    public Set getItems() {
        return _hashSet;
    }
}

class HashComparator {
    public HashComparator() {

    }
    // TEMPORARY Sets are made because these are destructive operations,
    // this is best practice.
    
    public Boolean selfInTwoSets(Set a, Set b, Set self) {
        Set _temp = new HashSet();
        _temp.addAll(a);
        _temp.addAll(b);
        return _temp.containsAll(self);
    }
    public Object union(Set a, Set b) {
        Set _temp = new HashSet();
        _temp.addAll(a);
        _temp.addAll(b);
        return _temp;
    }
    public Object intersection(Set a, Set b) {
        Set _tempA = new HashSet();
        Set _tempB = new HashSet();
        _tempA.addAll(a);
        _tempB.addAll(b);
        _tempA.retainAll(_tempB);
        return _tempA;
    }
    public Object diff(Set a, Set b) {
        Set _tempA = new HashSet();
        Set _tempB = new HashSet();
        _tempA.addAll(a);
        _tempB.addAll(b);
        _tempA.removeAll(_tempB);
        return _tempA;
    }
}