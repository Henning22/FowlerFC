class Rental {
    Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

    double getCharge () {
        return movie.getCharge(getDaysRented());
     }

    int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
}
