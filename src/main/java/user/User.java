package user;

public class User {
    private String email;
    private String password;


    public User(String email, String password){
        this.email=email;
        this.password=password;
    }

    public String getEmailAdress(){
        return email;
    }

    public void setEmail(){
        this.email=email;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password=password;
    }
}
