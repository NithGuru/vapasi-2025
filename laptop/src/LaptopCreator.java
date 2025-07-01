public class LaptopCreator {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setLogo("Mac");
        l1.setHdd(new HDD(20, "SATA"));
        l1.setRam(new RAM(25, "Gen1"));
        l1.setProcessor(new Processor(200, "Gen3"));
        Laptop l2 = new Laptop();
        l2.setLogo("Win");
        l2.setHdd(30, "PATA");
        l2.setRam(35, "Gen2");
        l2.setProcessor(250, "Gen4");
        System.out.println("Laptop for user1 : " + l1.toString());
        System.out.println("Laptop for user2 : " + l2.toString());
    }
}
