package ch08.Encapsulation;

public class EnhancedPlayer {
    public String fullName;
    public int healthPercentage;
    public String weapon;

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        if (healthPercentage <= 0 ) this.healthPercentage = 1;
        else if (healthPercentage >= 100) this.healthPercentage = 100;
        else this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sowrd");
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Palyer.restore to 100%");
            healthPercentage = 100;
        }
    }
}
