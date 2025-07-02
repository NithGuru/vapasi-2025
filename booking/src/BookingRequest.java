public class BookingRequest implements Runnable {
    String requestName;
    @Override
    public void run() {
        System.out.println("Booking received :: "+requestName+ " :: "+Thread.currentThread().getName());
        System.out.println("Payment processed :: "+requestName+ " :: "+Thread.currentThread().getName());
        System.out.println("Ticket confirmed :: "+requestName+ " :: "+Thread.currentThread().getName());
    }
}
