import java.util.Arrays;

public class TaskMethods {


 * AIT-TR, Java Basic, Cohort42.1, Homework #9
 * @author Vitalij Shevchuk
 * @version 05.02.24
 */


    // Task 1
    public static void printTask(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("Task" + i);
        }
    }

    // Task 2
    public static void printReversedArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Task 3
    public static void printArray(int[] arr, boolean reverse) {
        if (reverse) {
            printReversedArray(arr);
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }

    // Task 4
    public static double[] getMinMaxAverage(int[] arr) {
        double min = arr[0];
        double max = arr[0];
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
            sum += arr[i];
        }

        double average = sum / arr.length;
        return new double[]{min, max, average};
    }

    // Task 5
    public static String[] tokenizeExpression(String expression) {
        return expression.split("((?<=[-+])|(?=[-+]))");
    }

    public static int evaluateExpression(String[] tokens) {
        int result = Integer.parseInt(tokens[0]);
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            int operand = Integer.parseInt(tokens[i + 1]);
            if (operator.equals("+")) {
                result += operand;
            } else if (operator.equals("-")) {
                result -= operand;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Example method calls
        printTask(3);

        int[] arr = {1, 4, 3, 6, 7};
        printReversedArray(arr);
        printArray(arr, true);
        printArray(arr, false);

        double[] stats = getMinMaxAverage(arr);
        System.out.println("Min: " + stats[0] + ", Max: " + stats[1] + ", Average: " + stats[2]);

        String expression = "11+3-6+8";
        String[] tokens = tokenizeExpression(expression);
        System.out.println(Arrays.toString(tokens));
        int result = evaluateExpression(tokens);
        System.out.println("Result: " + result);
    }
}
