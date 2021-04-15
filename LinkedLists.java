import java.util.LinkedList;

    public class LinkedLists {
        public static void main (String[]args) {
            LinkedList <String> IceCreamFlavors = new LinkedList();

            IceCreamFlavors.add("Rocky Road");
            IceCreamFlavors.add("Vanilla");
            IceCreamFlavors.add("Mango");
            IceCreamFlavors.add("Cookies and Cream");

            System.out.println("List of Ice Cream Flavors");
            System.out.println("=========================");

            for(String listContent: IceCreamFlavors) {
                System.out.println(listContent);
            }
        }
    }