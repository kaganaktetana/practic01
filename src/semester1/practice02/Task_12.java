package semester1.practice02;
public class Task_12 {
    public static void main(String[] args) {
        String login = "ivan.petrenko ";
        String domain = "gmail.com";
        String role = "student";
        String email = login + "@" + domain;
        System.out.println("Користувач " + login + "(роль:" + role + ") має пошту:");
        System.out.println(email);
    }
}