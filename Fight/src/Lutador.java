public class Lutador {
    private String name, nationality, category;
    private int age, victories, losses, draws;
    private double height, weight;

    public Lutador(String nam, String nat, int a, double h, double w, int v, int l, int d) {
        this.name = nam;
        this.nationality = nat;
        this.age = a;
        this.height = h;
        this.setWeight(w);
        this.victories = v;
        this.losses = l;
        this.draws = d;
    }

    public void introduce() {
        System.out.println("###########################################");
        System.out.println("Welcome to " +this.getName()+ ", coming from " +this.getNationality());
        System.out.println("He's " +this.getAge());
        System.out.println("Weights " +this.getWeight()+ " and is " +this.getHeight());
    }

    public void status() {
        System.out.println(this.getCategory()+ " with a cartel of " +this.getVictories()+ "-" +this.getLosses()+ "-" +this.getDraws());
        System.out.println("###########################################");
    }

    public void winMatch() {
        this.setVictories(this.getVictories() + 1);
    }

    public void loseMatch() {
        this.setLosses(this.getLosses() + 1);
    }

    public void drawMatch() {
        this.setDraws(this.getDraws() + 1);
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }

    public int getVictories() {
        return victories;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.setCategory();
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    private void setCategory() {
        if (this.weight < 52.2) {
            this.category = "Too skinny";
        } else if (this.weight <= 70.3) {
            this.category = "Lightweight";
        } else if (this.weight <= 83.9) {
            this.category = "Middleweight";
        } else if (this.weight <= 102.9) {
            this.category = "Heavyweight";
        } else {
            this.category = "Too heavy";
        }



    }

}
