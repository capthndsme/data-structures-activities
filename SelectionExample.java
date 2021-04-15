public class SelectionExample {
	public static void selectionSort(int[] array){  
		for (int i = 0; i < array.length - 1; i++)  
		{  
			int arrIndex = i;  
			for (int j = i + 1; j < array.length; j++){  
				if (array[j] < array[arrIndex]){  
					arrIndex = j;
				}  
			}  
			int smallest = array[arrIndex];   
			array[arrIndex] = array[i];  
			array[i] = smallest;  
		}  
	}  
	public static void main(String[] args) {
        int[] unsorted = {11,6,2,7,1,3,0};
        System.out.println("UNSORTED: ");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
        selectionSort(unsorted);
        System.out.println("SORTED: ");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.println(unsorted[i]);
        }
    }
	
}