import java.util.Random;

public class Luta {
    private Lutador challenged;
    private Lutador challenger;
    private int rounds;
    private boolean approved;

    public void setMatch(Lutador l1, Lutador l2) {
        if (l1.getCategory().equals(l2.getCategory()) && l1 != l2) {
            this.approved = true;
            this.challenger = l1;
            this.challenged = l2;
        } else {
            this.approved = false;
            this.challenger = null;
            this.challenged = null;
        }
    }

    public void fight() {
        if (this.approved) {
            System.out.println(this.getChallenger().getName()+ " VS " +this.getChallenged().getName());
            System.out.println("#########################################");
            challenger.introduce();
            challenger.status();
            System.out.println("#########################################");
            challenged.introduce();
            challenged.status();
            System.out.println("#########################################");

            Random random = new Random();
            int winner = random.nextInt(3);

            switch (winner){
                case 0:
                    System.out.println("It's a tie");
                    this.challenged.drawMatch();
                    this.challenger.drawMatch();
                    break;

                case 1:
                    System.out.println(this.getChallenger().getName()+ " won.");
                    this.challenger.winMatch();
                    this.challenged.loseMatch();
                    break;

                case 2:
                    System.out.println(this.getChallenged().getName()+" won.");
                    this.challenged.winMatch();
                    this.challenger.loseMatch();
                    break;
            }

        } else {
            System.out.printf("Erro");
        }
    }

    public Lutador getChallenged() {
        return challenged;
    }

    public Lutador getChallenger() {
        return challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setChallenged(Lutador challenged) {
        this.challenged = challenged;
    }

    public void setChallenger(Lutador challenger) {
        this.challenger = challenger;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }





}
