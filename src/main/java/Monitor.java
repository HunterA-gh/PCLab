public class Monitor{
    private String model;
    private String manufacturer;
    private Resolution res;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getRes() {
        return res;
    }

    public Monitor(String model, String manufacturer, Resolution res) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.res = res;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }


}
