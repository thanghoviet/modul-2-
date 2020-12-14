package CleancodeOOP;

public class User {
    private String name;
    private int monney;

    public User(){}

    public User(String name, int money) {
        this.name = name;
        this.monney = money;
    }

    public  int getMoney() {
        return monney;
    }

    public void setMoney(int money) {
        this.monney = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + monney +
                '}';
    }
}