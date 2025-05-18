package n_14_book_my_show;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Booking {

    Show show;
    List<Seat> bookingSeats = new ArrayList<>();
    Payment payment;

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public List<Seat> getBookingSeats() {
        return bookingSeats;
    }

    public void setBookingSeats(List<Seat> bookingSeats) {
        this.bookingSeats = bookingSeats;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }


}
