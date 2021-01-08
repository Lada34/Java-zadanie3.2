public class Main<totalbonus> {
    public static void main(String[] args) {
        int balance = 1000;
        int amount = 5200;
        int tarif = 100;
        int bonus = amount / tarif;

        int limitMin = 1000;
        int limit = 0;
        if (amount < limitMin) {
            bonus = limit;
        }
        int totalBonus = balance + bonus;
        System.out.println(totalBonus);
    }
}