package semester1.practice02;
public class Task_31 {
    public static void main(String[] args) {
        boolean hasPassword = true;
        boolean hasSmsCode = true;
        boolean isAccountBlocked = false;
        boolean canLogin = hasPassword && hasSmsCode && !isAccountBlocked;
        System.out.println("Чи можна увійти в систему: " + canLogin);
    }
}