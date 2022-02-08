package LEARNJAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class jala8 {
    private static void check(int[] arr, int toCheckValue) {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        System.out.println("Is" + toCheckValue + "present in the array:" + test);
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10};
        int toCheckValue = 7;
        System.out.println("Array:" + Arrays.toString(arr));
        check(arr, toCheckValue);
    }

}

class jala8a {

    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array:" + Arrays.toString(arr));
        int index = 2;
        System.out.println("Index to be removed:" + index);

        arr = removeTheElement(arr, index);
        System.out.println("Resultant Array:" + Arrays.toString(arr));
    }
}

class jala8b {
    public static void main(String[] args) {
        int a[] = {1, 8, 3};
        int b[] = new int[a.length];
        b = a;
        b[0]++;
        System.out.println("Contents of a[] ");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println("\n\nContents of b[] ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");
    }
}

class jala8c {
    public static int[] insertX(int n, int arr[], int x, int pos) {
        int i;
        int newarr[] = new int[n + 1];
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public static void main(String[] args) {
        int n = 10;
        int i;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial Array:" + Arrays.toString(arr));
        int x = 50;
        int pos = 5;
        arr = insertX(n, arr, x, pos);
        System.out.println("Array with " + x + "inserted at position" + pos + ":" + Arrays.toString(arr));
    }
}

class jala8d {

    static int getMin(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.min(res, arr[i]);
        return res;
    }

    static int getMax(int arr[], int n) {
        int res = arr[0];
        for (int i = 1; i < n; i++)
            res = Math.max(res, arr[i]);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {12, 1234, 45, 67, 1};
        int n = arr.length;
        System.out.println("Minimum element" + "of array=" + getMin(arr, n));
        System.out.println("Maximum element" + "of array=" + getMax(arr, n));
    }
}

class jala8e {
    static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}

class jala8f {
    static void findDuplicates(
            int arr[], int len) {
        boolean ifPresent = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    if (al.contains(arr[i])) {
                        break;
                    } else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }

        if (ifPresent == true) {

            System.out.print(al + " ");
        } else {
            System.out.print("No duplicates present in arrays");
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 40, 12, 5, 6, 5, 12, 11};
        int n = arr.length;
        findDuplicates(arr, n);
    }
}

//TO FIND COMMON ELEMENTS BETWEEN TWO ARRAYS
class jala8g {
    private static void FindCommonElemet(String[] arr1,
                                         String[] arr2) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {

                    // add common elements
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        for (String i : set) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr1 = {"sharikh", "khan", "sharikh", "sk", "sharikh"};
        String[] arr2 = {"sharikh", "sk", "sharikh"};
        System.out.println("Array 1:" + Arrays.toString(arr1));
        System.out.println("Array 2:" + Arrays.toString(arr2));
        System.out.print("Common Elements: ");
        FindCommonElemet(arr1, arr2);
    }
}


class jala8h {
    public static int removeduplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }

    public static void main(String[] args) {
        int a[] = {1, 1, 2, 2, 2};
        int n = a.length;
        n = removeduplicates(a, n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}

class jala8i {
    public static int getSecondLargest(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 2];
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Second Largest:" + getSecondLargest(a, 6));
        System.out.println("Second Largest:" + getSecondLargest(b, 7));
    }
}

//EVEN ODD
class jala8j {
    public static void main(String args[]) {
        int a[] = {1, 2, 5, 6, 3, 2};
        System.out.println("Odd Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}

class jala8k {
    public static void main(String[] args) {
        int[] array_nums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int max_val = array_nums[0];
        int min = array_nums[0];
        for (int i = 1; i < array_nums.length; i++) {
            if (array_nums[i] > max_val)
                max_val = array_nums[i];
            else if (array_nums[i] < min)
                min = array_nums[i];
        }
        System.out.println("Difference between the largest and smallest values of the said array: " + (max_val - min));
    }
}

//17. Write a method to verify if the array contains two specified elements(12,23)
class jala8l {
    public static void main(String[] args) {
        int[] array_nums = {77, 77, 65, 65, 65, 77};
        System.out.println("Original Array: " + Arrays.toString(array_nums));
        int num1 = 77;
        int num2 = 65;
        System.out.println("Result: " + result(array_nums, num1, num2));
    }

    public static boolean result(int[] array_nums, int num1, int num2) {
        for (int number : array_nums) {
            boolean r = number != num1 && number != num2;
            if (r) {
                return false;
            }
        }
        return true;
    }
}

//18. Write a program to remove the duplicate elements and return the new array
class jala8m {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50};
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}

//19. Write a function to find the missing number of sorted array of 1 to 100
class jala8n {
    public static int
    findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6};
        System.out.println(findDisappearedNumbers(a));
    }
}