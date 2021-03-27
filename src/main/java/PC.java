public class PC {
    private Case pcCase;
    private Motherboard pcMotherboard;
    private Monitor pcMonitor;

    public PC(Case pcCase, Motherboard pcMotherboard, Monitor pcMonitor) {
        this.pcCase = pcCase;
        this.pcMotherboard = pcMotherboard;
        this.pcMonitor = pcMonitor;
    }

    private void drawLogo(){
        this.pcMonitor.drawPixel(500, 500, "black");
    }

    public void description(){
        System.out.println("Welcome to Hunter's Bargain PCs below is the description of the PC on sale today:");
        System.out.println("MONITOR:");
        System.out.println("Manufacturer - " + this.pcMonitor.getManufacturer());
        System.out.println("Model - " + this.pcMonitor.getModel());
        System.out.println("Resolution - " + this.pcMonitor.getRes().getWidth() + "x" + this.pcMonitor.getRes().getHeight());
        System.out.println("MOTHERBOARD:");
        System.out.println("Manufacturer - " + this.pcMotherboard.getManufacturer());
        System.out.println("Model - " + this.pcMotherboard.getModel());
        System.out.println("Ram Slots - " + this.pcMotherboard.getRamSlots());
        System.out.println("Card Slots - " + this.pcMotherboard.getCardSlots());
        System.out.println("BIOS - " + this.pcMotherboard.getBios());
        System.out.println("CASE:");
        System.out.println("Model - " + this.pcCase.getModel());
        System.out.println("Manufacturer - " + this.pcCase.getManufacturer());
        System.out.println("Power Supply - " + this.pcCase.getPowerSupply());
        System.out.println("Dimensions - " + this.pcCase.getDimensions().getWidth() + "INx" + this.pcCase.getDimensions().getHeight() + "INx" + this.pcCase.getDimensions().getDepth() + "IN");
    }

    public void powerUp(){
        this.pcCase.pressPowerButton();
        this.drawLogo();
        this.pcMotherboard.loadProgram("Large amounts of malware and viruses");
    }

    @Override
    public String toString() {
        return "PC{" +
                "pcCase=" + pcCase +
                ", pcMotherboard=" + pcMotherboard +
                ", pcMonitor=" + pcMonitor +
                '}';
    }
}
