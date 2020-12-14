package Cleancode2OOP;

import java.util.ArrayList;

public class BankAccount {
    ArrayList<String> lichSu = new ArrayList<>();
    private String name;
    private int monney;

    public BankAccount() {}

    public BankAccount(String name, int monney) {
        this.name = name;
        this.monney = monney;

    }

    public int getMoney() {
        return monney;
    }

    public void setMoneyadd(int naptien) {
        this.monney += naptien;
        lichSu.add("Nap tien: " + naptien);
    }

    public void setMoneyclear(int ruttien) {
        this.monney -= ruttien;
        lichSu.add("Nap tien: " + ruttien);
    }

    public ArrayList<String> historyAccount() {
        int limit = Math.max(lichSu.size() - 3, 0);
        ArrayList<String> result = new ArrayList<>();
        for (int i = lichSu.size() - 1; i >= limit; i--) {
            result.add(lichSu.get(i));
        }
        return result;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", money=" + monney +
                '}';
    }
}

