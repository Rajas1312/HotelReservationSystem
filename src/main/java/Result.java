public class Result {
    String hotelName;
    int totalRate;
    public void setHotelName(String hotelName) {
        this.hotelName=hotelName;
    }

    public void setTotalRate(int totalRate) {
        this.totalRate=totalRate;
    }

    @Override
    public String toString() {
        return "Result{" +
                "hotelName='" + hotelName + '\'' +
                ", totalRate=" + totalRate +
                '}';
    }
}
