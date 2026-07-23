package Algorithms_DataStructures.Exercise2_EcommerceSearch;

import java.util.Arrays;

public class EcommerceSearch {

    public static void main(String[] args) {

        String[] products = {
                "Laptop",
                "Mobile",
                "Keyboard",
                "Mouse",
                "Monitor",
                "Speaker"
        };

        String searchItem = "Mouse";

        // Linear Search
        int linearResult = linearSearch(products, searchItem);

        if (linearResult != -1) {
            System.out.println("Linear Search:");
            System.out.println(searchItem + " found at index " + linearResult);
        } else {
            System.out.println(searchItem + " not found");
        }

        // Binary Search
        Arrays.sort(products);

        int binaryResult = binarySearch(products, searchItem);

        if (binaryResult != -1) {
            System.out.println("\nBinary Search:");
            System.out.println(searchItem + " found at index " + binaryResult);
        } else {
            System.out.println(searchItem + " not found");
        }
    }

    public static int linearSearch(String[] products, String key) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(String[] products, String key) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = products[mid].compareToIgnoreCase(key);

            if (compare == 0)
                return mid;

            if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}