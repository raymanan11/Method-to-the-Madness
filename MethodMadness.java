import java.util.Scanner;
public class MethodMadness {

    public static boolean isIncreasing(int[] values) {
        for (int i=0; i < values.length - 1; i++) {

            if (values[i] > values[i+1] || values[i] == values[i+1]) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int[5];
        System.out.println("Please enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            int nums = input.nextInt();
            values[i] = nums;
        }

        boolean numbers = isIncreasing(values);

        if (numbers == true) {
            System.out.println("The numbers are in increasing order");
        }
        else {
            System.out.println("The numbers are not in increasing order");
        }

    }
}
