import java.util.Scanner;
public class MethodMadness {

    public static boolean isIncreasing(int[] values) {
        for (int i=0; i < values.length - 1; i++) {

            if (values[i] > values[i+1] || values[i] == values[i+1]) {
                return false;
            }
        // for loop checks every index and determines if current index is greater than the next index
        // if it is or current index and next index equal one another then it's not in increasing order and return false    
        }
        return true;
        // if loop iterates and doesn't return false, then it returns true
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[5];
        System.out.println("Please enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            int nums = input.nextInt();
            values[i] = nums;
        }
        // for loop is to ask user for 5 integers and then after each input that input equals that index in the array values
        // values would then be array with 5 integers that is with user inputs

        boolean numbers = isIncreasing(values);
        // calls the method isIncreasing and passes the array created (values) and will determine if the array is increasing or decreasing
        // if increasing, returns true, if decreasing returns false
        System.out.println();
        System.out.println();

        if (numbers == true) {
            System.out.println("The numbers are in increasing order");
        }
        else {
            System.out.println("The numbers are not in increasing order");
        }

    }
}
