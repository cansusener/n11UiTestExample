package user;

public class UsersPool {
    public static User getUser1() {
        return new User("xyx@gmail.com", "123456");
    }

    public static User getUser2() {
        return new User("zyz@hotmail.com", "123456");
    }

}
