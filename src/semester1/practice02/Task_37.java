package semester1.practice02;
public class Task_37 {
    public static void main(String[] args) {
        double a1 = 1.0;
        double b1 = -7.0;
        double c1 = 10.0;
        double d1 = Math.pow(b1, 2) - 4 * a1 * c1;
        double x1 = (-b1 + Math.sqrt(d1)) / (2 * a1);
        double x2 = (-b1 - Math.sqrt(d1)) / (2 * a1);
        System.out.println("Дискримінант D = " + d1);
        System.out.println("Корінь x1 = " + x1);
        System.out.println("Корінь x2 = " + x2);
    }
}