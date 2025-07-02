public class BookingMain {
    public static void main(String[] args) {
        BookingRequestGenerator generator = new BookingRequestGenerator(10);
        BookingRequestExecutor requestExecutor = new BookingRequestExecutor(5);
        requestExecutor.executeRequest(generator.requests);
    }
}
