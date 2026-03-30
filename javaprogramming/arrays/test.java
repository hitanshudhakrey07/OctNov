package javaprogramming.arrays;

import java.util.Scanner;

public class test {

    // global variable: parent
    public static Scanner sc = new Scanner(System.in);
    public static int size;
    public static int[] array;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Choose option");
            displayOption();

            System.out.print("Enter option (1-7): ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    evenCount();
                    break;
                case 2:
                    oddCount();
                    break;
                case 3:
                    maximumElement();
                    break;
                case 4:
                    minimumElement();
                    break;
                case 5:
                    insertElementAtGivenPosition();
                    break;
                case 6:
                    deleteElementAtGivenPosition();
                    break;
                // case 7:
                //     newMethod();
                //     break;
                case 7:
                    System.out.println("Thankyou! for using our service. See you soon...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input. Please enter option from 1-7 only.");
            }
        }
    }

    public static void displayOption() {
        System.out.println("1. Even count in an given array");
        System.out.println("2. Odd count in an given array");
        System.out.println("3. Maximum element in an given array");
        System.out.println("4. Minimum element in the given array");
        System.out.println("5. Insert one element in an given array");
        System.out.println("6. Delete one element in an given array");
        //System.out.println("7. new problem statement");
        System.out.println("7. exit the menu");
    }

    // program: even count
    public static void evenCount() {
        intializeArray();
        if (array.length == 0) {
            System.out.println("Atlest one element in array we need to calculate the even number");
            return;
        }
        int evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Total even number in a given array: " + evenCount);
        System.out.println();
    }

    // program: odd count
    public static void oddCount() {
        intializeArray();
        if (array.length == 0) {
            System.out.println("Atleast one element in an array we need to calculate the odd number.");
            return;
        }
        int oddCount = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Total odd number in an given array: " + oddCount);
        System.out.println();
    }

    // program: Maximum element
    public static void maximumElement() {
        intializeArray();
        if (array.length == 0) {
            System.out.println("Atleast one element in an array we need to calculate the odd number.");
            return;
        }

        int max = Integer.MIN_VALUE;
        for (int num : array) {
            max = Math.max(max, num);
        }
        System.out.println("Maximum element in the given array: " + max);
        System.out.println();
    }

    // program: Minimum element
    public static void minimumElement() {
        intializeArray();
        if (array.length == 0) {
            System.out.println("Atleast one element in an array we need to calculate the odd number.");
            return;
        }

        int min = Integer.MAX_VALUE;
        for (int num : array) {
            min = Math.min(min, num);
        }
        System.out.println("Minimum element in the given array: " + min);
        System.out.println();
    }

    // Program: Insert
    public static void insertElementAtGivenPosition() {
        intializeArray();
        System.out.print("Enter the position you want to insert: ");
        int pos = sc.nextInt();
        System.out.print("Enter the value of that position: ");
        int value = sc.nextInt();

        int[] brr = new int[array.length + 1];
        for (int i = 0; i < brr.length; i++) {
            if (i < pos) {
                brr[i] = array[i];
            } else if (i == pos) {
                brr[i] = value;
            } else {
                brr[i] = array[i - 1];
            }
        }

        printArray(brr);
    }

    // program: Delete element
    public static void deleteElementAtGivenPosition() {
        intializeArray();
        if (array.length == 0) {
            System.out.println("Atleast one element in an array we need to calculate the odd number.");
            return;
        }

        System.out.print("Enter the position you want to delete in the given array: ");
        int pos = sc.nextInt();

        int[] brr = new int[size - 1];
        for (int i = 0; i < brr.length; i++) {
            if (i < pos) {
                brr[i] = array[i];
            } else if (i == pos) {
                brr[i] = array[i + 1];
            } else {
                brr[i] = array[i + 1];
            }
        }

        printArray(brr);
        System.out.println();
    }

    public static void printArray(int[] brr) {
        for (int ele : brr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void intializeArray() {
        System.out.print("Enter the size of the array: ");
        size = sc.nextInt();

        array = new int[size];

        System.out.println("Enter " + size + " element");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i+1) + " elemnt: ");
            array[i] = sc.nextInt();
        }
    }

    /*
        new method prototype
        // problem: problem name
        public static void methodName() {
            // initalize array if need
            perform acction whatever question aksked
        }
     */

}
