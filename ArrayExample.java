public class ArrayExample {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        // Let's prompt the user to enter values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        scanner.close();
}