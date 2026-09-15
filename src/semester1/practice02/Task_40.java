package semester1.practice02;
public class Task_40 {
    public static void main(String[] args) {
        double P = 10000.0;
        double r = 12.0;
        int t = 3;
        double S = P * Math.pow(1 + r / 100, t);
        double profit = S - P;
        System.out.println("+------------------------------------+");
        System.out.println("|        ДЕПОЗИТНИЙ КАЛЬКУЛЯТОР     |");
        System.out.println("+------------------------------------+");
        System.out.println("| Початкова сума: " + P + " грн");
        System.out.println("| Термін: " + t + " роки під " + r + "% річних");
        System.out.printf("| Підсумкова сума: %.2f грн%n", S);
        System.out.printf("| Чистий прибуток: %.2f грн%n", profit);
        System.out.println("+------------------------------------+");
    }
}