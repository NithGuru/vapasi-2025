public class Processor {
    int ghz;
    String gen;

    public Processor(int ghz, String gen) {
        this.ghz = ghz;
        this.gen = gen;
    }

    public Processor() {

    }

    public int getGhz() {
        return ghz;
    }

    public void setGhz(int ghz) {
        this.ghz = ghz;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "ghz=" + ghz +
                ", gen='" + gen + '\'' +
                '}';
    }
}
