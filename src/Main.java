public class Main {
    public static void main(String[] args) {
        //System.out.println(Calculator.div(4L, 5L));
        //System.out.println(Calculator.sub(4L, 5L));
        //System.out.println(Calculator.mult(4L, 5L));
        //}

        FootballClub footballclub1 = new FootballClub("Karpin");
        FootballClub.getInfo();
        FootballClub footballclub2 = new FootballClub("Spartak", 1922, "Karpin");
        footballclub2.getInfo();

    }
}
