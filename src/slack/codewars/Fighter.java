package slack.codewars;

public class Fighter {
    String name;
    int health;
    int damagePerAttack;

    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damage;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", damage=" + damagePerAttack +
                '}';
    }
}

