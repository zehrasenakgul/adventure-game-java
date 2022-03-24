package AdventureGame;

import java.util.Scanner;

public class Player {
    private int damage, healthy, money, rHealthy;
    private String name, cName;
    private Inventory inventory;
    Scanner scan = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public int getTotalDamage() {
        return this.getDamage() + this.getInventory().getDamage();
    }

    public void selectCha() {
        switch (ChaMenu()) {
        // Samuray Seçildi
        case 1:
            initPlay("Samuray", 5, 21, 15);
            break;
        case 2:
            initPlay("Okçu", 7, 18, 20);
            break;
        case 3:
            initPlay("Şovalye", 8, 24, 5);
            break;
        default:
            initPlay("Samuray", 5, 21, 15);
            break;
        }
        System.out.println("Karakteriniz Oluştu: " + getcName() + " Hasar: " + getDamage() + " Sağlık: " + getHealthy()
                + " Para: " + getMoney());

    }

    public void initPlay(String chaName, int damage, int healthy, int money) {
        setcName(chaName);
        setDamage(damage);
        setHealthy(healthy);
        setMoney(money);
        setrHealthy(healthy);
    }

    public int ChaMenu() {
        System.out.println("Oyuncu " + this.name + " lütfen bir karakter seçiniz");
        System.out.println("1- Samuray \t Hasar:5\t Sağlık:21\t Para:15");
        System.out.println("2- Okçu \t Hasar:7\t Sağlık:18\t Para:20");
        System.out.println("3- Şovalye \t Hasar:8\t Sağlık:24\t Para:5");
        System.out.println("Karakter Seçiminiz : ");
        int chaID = scan.nextInt();
        while (chaID < 1 || chaID > 3) {
            System.out.println("Seçiminizi kontrol ediniz ");
            chaID = scan.nextInt();
        }
        return chaID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }
}
