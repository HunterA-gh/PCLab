public class Main {



    public static void main(String[] args) {

        PC bargainPC = new PC(new Case("P400A", "Phanteks", "25W AC", new Dimension(20, 15, 10)), new Motherboard("Ryzen XT", "AMD", 1, 2, "Sometimes works"), new Monitor("EL2870U", "BenQ", new Resolution(1920, 1200)));

        bargainPC.description();

        bargainPC.powerUp();

    }
}
