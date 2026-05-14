

public class Battle {
    public static int partyAttack(Character[] party, Character enemy) {
        int totalDamage = 0;
        for (Character member : party) {
            if (member != null) {
                totalDamage += member.attack(enemy);
            }
        }
        return totalDamage;
    }

    public static String describeParty(Character[] party) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < party.length; i++) {
            if (party[i] instanceof Warrior w) sb.append(w.describe());
            else if (party[i] instanceof Mage m) sb.append(m.describe());
            else if (party[i] instanceof Rogue r) sb.append(r.describe());

            if (i < party.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static int countMages(Character[] party) {
        int count = 0;
        for (Character c : party) {
            if (c instanceof Mage) {
                count++;
            }
        }
        return count;
    }
}