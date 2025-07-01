public class Laptop {
    private String logo = "default";
    private Processor processor;
    private RAM ram;
    private HDD hdd;

    @Override
    public String toString() {
        return "Laptop{" +
                "logo='" + logo + '\'' +
                ", " + processor +
                ", " + ram +
                ", " + hdd +
                '}';
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setProcessor(int ghz, String gen){
        Processor processor1 = new Processor();
        processor1.setGen(gen);
        processor1.setGhz(ghz);
        this.processor = processor1;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public void setRam(int size, String gen){
        RAM ram1 = new RAM();
        ram1.setGen(gen);
        ram1.setSize(size);
        this.ram = ram1;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public void setHdd(int size, String type) {
        HDD hdd = new HDD();
        hdd.size = size;
        hdd.type = type;
        this.hdd = hdd;
    }


}
