import java.util.ArrayList;

public class BookingRequestGenerator {
    ArrayList<BookingRequest> requests = new ArrayList<>();
    int requestCount;

    public BookingRequestGenerator(int requestCount) {
        this.requestCount = requestCount;
        for (int i = 0; i < requestCount; i++) {
            BookingRequest request = new BookingRequest();
            request.requestName = "Request "+ (i+1);
            requests.add(request);
        }
    }
}
