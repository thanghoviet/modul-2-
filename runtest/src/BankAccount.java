public class BankAccount {
    private String name;
    private int money;

    public BankAccount(){}
    public BankAccount(String name, int monney){
        this.name=name;
        this.money=monney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
