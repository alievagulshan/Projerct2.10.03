public class Manager {
    private final String login = "gul";
    private final String password = "1234";

    public Manager() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
