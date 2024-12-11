import java.util.LinkedList;
import java.util.Queue;

public class SumOfDigitsUsingQueue {
    public static int sumOfDigits(int number) {
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();

        // Add each digit of the number to the queue
        while (number > 0) {
            int digit = number % 10;
            queue.add(digit);
            number /= 10;
        }

        // Calculate the sum of digits
        int sumOfDigits = 0;
        while (!queue.isEmpty()) {
            sumOfDigits += queue.poll();
        }

        return sumOfDigits;
    }

    public static void main(String[] args) {
        // Input
        int number = 789;

        // Output
        int result = sumOfDigits(number);
        System.out.println("Sum of Digits: " + result);
    }
}