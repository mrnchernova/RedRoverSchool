package slack.codewars;

public class TempCodewars {
    public static void main(String[] args) {

        Fighter Lew = new Fighter("Lew", 10, 2);
        Fighter Harry = new Fighter("Harry", 5, 4);

        System.out.println(declareWinner(Lew, Harry, "Harry"));
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (fighter1.name.equals(firstAttacker)) {
            while (fighter2.health > 0) {
                if (fighter2.health - fighter1.damagePerAttack > 0) {
                    fighter2.health -= fighter1.damagePerAttack;
                } else {
                    return fighter1.name; //winner
                }
                if (fighter1.health - fighter2.damagePerAttack > 0) {
                    fighter1.health -= fighter2.damagePerAttack;
                } else {
                    return fighter2.name; //winner
                }
            }


        } else {
            while (fighter1.health > 0) {
                if (fighter1.health - fighter2.damagePerAttack > 0) {
                    fighter1.health -= fighter2.damagePerAttack;
                } else {
                    return fighter2.name; //winner
                }
                if (fighter2.health - fighter1.damagePerAttack > 0) {
                    fighter2.health -= fighter1.damagePerAttack;
                } else {
                    return fighter1.name; //winner
                }
            }
        }
        return "error";
    }


}

