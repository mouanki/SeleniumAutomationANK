package string;

public class SortDaysofaWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr = {"Mon", "Tue", "Wed", "Fri"};

        // Perform bubble sort
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n -1; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    // Swap arr[i] and arr[i+1]
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        // Print the sorted array
        for (String str : arr) {
            System.out.println(str);
        }
    }

	}


