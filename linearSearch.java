public class linearSearch {
    public static Object findStringInList(String[] array, String searchTerm) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(searchTerm)) {
                System.out.println("Match found! ArrayIndex: " + i);
                return searchTerm;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String[] recursions = {"Linear", "Tail", "Binary", "Mutual"};
        System.out.println(findStringInList(recursions, "Tail"));
    }
}
