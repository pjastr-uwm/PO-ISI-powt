package interfejsy.zad5;

public class AdminAuthentication implements Authentication{
    @Override
    public boolean login(String username, String password) {
        return false;
    }

    @Override
    public void logout() {
        System.out.println("Admin wylogowany");
    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return oldPassword==null ? false : oldPassword.equals(newPassword);
    }
}
