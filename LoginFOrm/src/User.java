public class User {
    private final String username;
    private final String password;

    public User(String username, String Password) {
        this.username = username;
        this.password = Password;
    }

    public static User toUser(String line) {
        String[] parts = line.split(",");

        System.out.println(parts[0] + " " + parts[1]);
        return new User(parts[0], parts[1]);
    }

    public String getUsername() {return username;}
    public String getPassword() {return password;}

}
