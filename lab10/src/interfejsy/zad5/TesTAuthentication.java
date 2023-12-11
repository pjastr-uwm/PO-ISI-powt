package interfejsy.zad5;

public class TesTAuthentication {

    public static void main(String[] args) {
        UserAuthentication u1 = new UserAuthentication();
        System.out.println(u1.login("user1", "pass1"));
        AdminAuthentication a1 = new AdminAuthentication();
        a1.logout();
    }
}
