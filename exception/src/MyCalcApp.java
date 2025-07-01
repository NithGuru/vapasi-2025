public class MyCalcApp {
    public static void main(String[] args) {
        int num = 10;
        Calculator cal = new Calculator();

        cal.calDouble(num);
        cal.calDouble(0);
        cal.calDouble(-1);
    }
}
