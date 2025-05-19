package n_14_book_my_show;

import jdk.jfr.Category;
import n_14_book_my_show.enums.City;
import n_14_book_my_show.enums.SeatCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyShow {

    MovieController movieController;
    TheatreController theatreController;

   BookMyShow() {
        this.movieController = new MovieController();
        this.theatreController = new TheatreController();
    }

    public static void main(String[] args) {
        BookMyShow bookMyShow = new BookMyShow();

        bookMyShow.initialize();

        //user1
        bookMyShow.createBooking(City.Bangalore, "BAHUBALI");
        //user2
        bookMyShow.createBooking(City.Bangalore, "BAHUBALI");

    }

    private void createBooking(City userCity, String movieName) {
       //1. search movies by my location
        List<Movie> movies = movieController.getMoviesByCity(userCity);

        //2. select the movie which you want to see
        Movie interstedMovie = null;

        for (Movie movie : movies) {
            if (movie.getMovieName().equals(movieName)) {
                interstedMovie = movie;
                break;
            }
        }

        //3. get all shows which are present for the movie in user city
        Map<Theatre, List<Show>> showsTheatreWise = theatreController.getAllShow(interstedMovie, userCity);

        //4. select the particular show user is interested in
        Map.Entry<Theatre,List<Show>> entry = showsTheatreWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.getFirst();

        //5. select the seat
        int seatNumber = 30;
        List<Integer> bookedSeats = interestedShow.getBookedSeatIds();

        if (!bookedSeats.contains(seatNumber)) {
            bookedSeats.add(seatNumber);

            //start payment
            Booking booking = new Booking();
            List<Seat> myBookedSeats = new ArrayList<>();
            for(Seat screenSeat : interestedShow.getScreen().getSeats()) {
                if(screenSeat.getSeatId() == seatNumber) {
                    myBookedSeats.add(screenSeat);
                }
            }
            booking.setBookingSeats(myBookedSeats);
            booking.setShow(interestedShow);


        } else {
            //throw exception
            System.out.println("seat already booked, try again");
            return;
        }
        System.out.println("BOOKING SUCCESSFUL");
    }

    private void initialize() {
        createMovies();
        createTheatre();
    }

    private void createTheatre() {
        Movie avengers = movieController.getMovieByName("AVENGERS");
        Movie bahubali = movieController.getMovieByName("BAHUBALI");

        Theatre inoxTheatre = new Theatre();
        inoxTheatre.setTheatreId(1);
        inoxTheatre.setCity(City.Bangalore);
        inoxTheatre.setScreens(createScreen());
        List<Show> inoxShows = new ArrayList<>();
        Show inoxMorningShow = createShows(1, inoxTheatre.getScreens().get(0),avengers, 8 );
        Show inoxEveningShow = createShows(1, inoxTheatre.getScreens().get(0),bahubali, 4 );
        inoxShows.add(inoxMorningShow);
        inoxShows.add(inoxEveningShow);

        inoxTheatre.setShows(inoxShows);

        Theatre pvrTheatre = new Theatre();
        pvrTheatre.setTheatreId(2);
        pvrTheatre.setCity(City.Delhi);
        pvrTheatre.setScreens(createScreen());
        List<Show> pvrShows = new ArrayList<>();
        Show pvrMorningShow = createShows(1, pvrTheatre.getScreens().get(0),avengers, 8 );
        Show pvrEveningShow = createShows(1, pvrTheatre.getScreens().get(0),bahubali, 4 );
        pvrShows.add(pvrMorningShow);
        pvrShows.add(pvrEveningShow);

        pvrTheatre.setShows(inoxShows);

        theatreController.addTheatre(inoxTheatre, City.Bangalore);
        theatreController.addTheatre(pvrTheatre, City.Delhi);

    }

    private List<Screen> createScreen() {
        List<Screen> screens = new ArrayList<>();
        Screen screen = new Screen();
        screen.setScreenId(1);
        screen.setSeats(createSeats());
        screens.add(screen);
        return screens;
    }

    private Show createShows(int showId, Screen screen, Movie movie, int showStartTime) {

        Show show = new Show();
        show.setShowId(showId);
        show.setScreen(screen);
        show.setMovie(movie);
        show.setShowStartTime(showStartTime); //24 hrs time ex: 14 means 2pm and 8 means 8AM
        return show;
    }


    private List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();

        for (int  i = 0; i < 40; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.GOLD);
            seats.add(seat);
        }

        for (int  i = 40; i < 70; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.SILVER);
            seats.add(seat);
        }

        for (int  i = 70; i < 100; i++) {
            Seat seat = new Seat();
            seat.setSeatId(i);
            seat.setSeatCategory(SeatCategory.PLATINUM);
            seats.add(seat);
        }
        return seats;
    }


    private void createMovies() {
        Movie avengers = new Movie();
        avengers.setMovieId(1);
        avengers.setMovieName("AVENGERS");
        avengers.setMovieDurationInMinutes(180);

        Movie bahubali = new Movie();
        bahubali.setMovieId(2);
        bahubali.setMovieName("BAHUBALI");
        bahubali.setMovieDurationInMinutes(128);

        movieController.addMovie(avengers, City.Delhi);
        movieController.addMovie(avengers, City.Bangalore);
        movieController.addMovie(bahubali, City.Delhi);
        movieController.addMovie(bahubali, City.Bangalore);

    }

    }
