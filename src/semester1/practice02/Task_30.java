package semester1.practice02;
public class Task_30 {
    public static void main(String[] args) {
        int number = 30;
        boolean isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("Число " + number + " ділиться на 3 і 5: " + isDivisibleByBoth);
        number = 25;
        isDivisibleByBoth = (number % 3 == 0) && (number % 5 == 0);
        System.out.println("Число " + number + " ділиться на 3 і 5: " + isDivisibleByBoth);
    }
}