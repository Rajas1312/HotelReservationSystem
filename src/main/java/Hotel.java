public class Hotel {
    String hotelName;
    int regularRate;

    public Hotel(String hotelName,int regularRate) {
        this.hotelName = hotelName;
        this.regularRate = regularRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularRate() {
        return regularRate;
    }

    public void setRegularRate(int regularRate) {
        this.regularRate = regularRate;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", regularRate='" + regularRate + '\'' +
                '}';
    }
}
