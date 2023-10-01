import java.util.Scanner;

public class Arrays {

    public static void takeInput(int arr[]) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Value Of " + i + " th Index : ");
            arr[i] = s.nextInt();
        }
        s.close();
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println("-------------------------------------------");
            System.out.println("Value of " + i + " index of Array is " + arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Give The Length Of The Array : ");
        int n = s.nextInt();
        int arr[] = new int[n];
        int arr2[] = {1,2,3,4,5,6,7,8};

        // Adress
        // System.out.println(arr);
        // System.out.println(arr2);

        // Single Printing;
        // System.out.println(arr[1]);
        // System.out.println(arr2[1]);

        // takeInput(arr);
        printArray(arr);
        // printArray(arr2);
        s.close();
    }
}
