package AdventureGame;

import java.util.Scanner;

public class Game {
    Player player;
    Location location;

    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Macera Oyununa Hoş Geldiniz!");
        System.out.println("Oyuna başlamadan önce isminizi giriniz : ");
        // nextLine string ifadeleri tutuyor.
        String playerName = scan.nextLine();
        // Yeni bir oyuncu nesnesi oluşturuyoruz.
        player = new Player(playerName);
        player.selectCha();
        start();

    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("=============================================");
        System.out.println(" ");
        System.out.println("Eylem gerçekleştirmek için bir yer seçiniz : ");
        System.out.println("1. Güvenli Ev -> Sizin için güvenli bir mekan, düşman yok  ");
        System.out.println("2. Mağara -> Karşınıza zombi çıkabilir ");
        System.out.println("3. Orman -> Karşınıza vampir çıkabilir ");
        System.out.println("4. Nehir -> Karşınıza ayı çıkabilir ");
        System.out.println("5. Mağaza -> Silah ve zırh alabilirsiniz ");
        int selLoc = scan.nextInt();
        while (selLoc < 1 || selLoc > 5) {
            System.out.println("Seçiminizi kontrol ediniz ");
            selLoc = scan.nextInt();
        }
        switch (selLoc) {
        case 1:
            location = new SafeHouse(player);
            break;
        case 5:
            location = new ToolStore(player);
            break;
        default:
            location = new SafeHouse(player);
            break;
        }
        if (!location.getLocation()) {
            System.out.println("Oyun Bitti !");
        }
    }

}
