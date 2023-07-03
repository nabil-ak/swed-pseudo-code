package libary;

public class User {
    private String name;
    private String email;
    private String password;
    private boolean activated;


    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.activated = true;
    }

    public void activateUser(){
        this.activated = true;
    };
    public void deactivateUser(){
        this.activated = false;
    };
}
