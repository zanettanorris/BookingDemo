package romaniancoder.booking;

public class HotelBooking {
    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking(){}

    public HotelBooking(String hotelName, double pricePerNight, int nbOfNights){
        this.hotelName = hotelName;
        this.pricePerNight = pricePerNight;
        this.nbOfNights = nbOfNights;

    }


    public int getNbOfNights() {
        return nbOfNights;
    }

    public String getHotelName() {
        return hotelName;
    }

    public double getPricePerNight(){
        return pricePerNight;
    }
    public double getTotalPrice(){
        return pricePerNight * nbOfNights;
    }


}
