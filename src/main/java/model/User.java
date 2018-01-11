package model;

public class User extends AbstractBaseEntity {

    private String role;

    private String email;

    private String password;

    public User(){

    }

    public User(Integer id, String name, String role, String email, String password) {
        super(id, name);
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
