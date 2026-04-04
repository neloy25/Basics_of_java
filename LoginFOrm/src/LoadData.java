import java.io.*;
import java.util.ArrayList;

public class LoadData {
    private static File FILE_NAME = new File("user.txt");

    public static ArrayList<User> loadAll() {
        ArrayList<User> users = new ArrayList<>();

        // Read all users
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                User u = User.toUser(line);
                if (u != null) users.add(u);
            }
        } catch (IOException e) {
            System.out.println("File Path Error: " + e.getMessage());
        }

        return users;
    }
}