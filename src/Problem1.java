import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = input.nextInt();

            boolean isDivisible = (number % 5 == 0);

            System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        }
    }
}