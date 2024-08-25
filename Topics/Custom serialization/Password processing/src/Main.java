import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class UserProfile implements Serializable {
    private static final long serialVersionUID = 26292552485L;

    private String login;
    private String email;
    private transient String password;

    public UserProfile(String login, String email, String password) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    // implement readObject and writeObject properly
    private void writeObject(ObjectOutputStream out) throws IOException
    {
        out.writeUTF(login);
        out.writeUTF(email);
        out.writeUTF(encryptPassword(password));

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
    {
        this.login = in.readUTF();
        this.email = in.readUTF();
        this.password = decryptPassword(in.readUTF());
    }

    private String encryptPassword(String password) {
        var result = "";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            result += Character.toString(c +1);
        }
        return result;
    }

    private String decryptPassword(String password) {
        var result = "";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            result += Character.toString(c -1);
        }
        return result;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
