package semester1.practice02;
public class Task_18 {
    public static void main(String[] args) {
        int totalSeconds = 385;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        System.out.println("385 секунд = " + minutes + " хв " + seconds + " сек");
    }
}