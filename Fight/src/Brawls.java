public class Brawls {
    public static void  main(String[] args) {
        Lutador l[] = new Lutador[3];
        l[0] = new Lutador("Muhammad Ali", "USA", 39, 1.91, 100 , 56, 5, 0);
        l[1] = new Lutador("Myke Tyson", "USA", 30, 1.78, 100, 50, 6, 0);
        l[2] = new Lutador("Popó", "Brazil", 28, 1.68, 84, 41, 2, 0);

        Luta UEC01 = new Luta();
        UEC01.setMatch(l[0], l[0]);
        UEC01.fight();

    }
}
