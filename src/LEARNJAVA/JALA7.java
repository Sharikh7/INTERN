package LEARNJAVA;
//TO ADD ELEMENTS OF ARRAY
public class JALA7 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i : arr)
            sum += i;
        System.out.println("SUM=" + sum);
//TO FIND AVERAGE OF ARRAY
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / length;
        System.out.println("AVERAGE OF ARRAY=" + avg);
    }}