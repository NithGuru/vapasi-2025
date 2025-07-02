import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BookingRequestExecutor {
    int threadCount;
    ExecutorService service;

    public BookingRequestExecutor(int threadCount) {
        this.threadCount = threadCount;
        this.service = Executors.newFixedThreadPool(threadCount);
    }

    public void executeRequest(ArrayList<BookingRequest> requests) {
        for (BookingRequest request : requests) {
            service.execute(request);
        }
        service.shutdown();
    }

    public void closeExecutor() {
        service.shutdown();
    }


}
