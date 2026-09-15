package semester1.practice02;
public class Task_35 {
    public static void main(String[] args) {
        double dayTemp = 18.5;
        double nightTemp = -3.2;
        double difference = Math.abs(dayTemp - nightTemp);
        double maxTemp = Math.max(dayTemp, nightTemp);
        double minTemp = Math.min(dayTemp, nightTemp);
        System.out.println("Перепад температури: " + difference);
        System.out.println("Максимальна температура: " + maxTemp);
        System.out.println("Мінімальна температура: " + minTemp);
    }
}