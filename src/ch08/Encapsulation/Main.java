package ch08.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Palyer player = new Palyer();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaininig health = " + player.healthRemaining());
//
//        player.health = 200;
//
//        player.loseHealth(11);
//        System.out.println("Remaininig health = " + player.healthRemaining());

        EnhancedPlayer time = new EnhancedPlayer("Time", 200, "Sword");
        System.out.println("Initial health is " + time.healthRemaining());

    }
}
