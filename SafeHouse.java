package AdventureGame;

public class SafeHouse extends NormalLoc {

    SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    public boolean getLocation() {
        player.setHealthy(player.getrHealthy());
        System.out.println("Sağlığınız iyileştirildi");
        System.out.println("Güvenli evdesiniz");
        return true;
    }

}
