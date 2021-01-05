import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {

    public List<Hotel> hotelList=new ArrayList<Hotel>();
    public static void main(String [] args){
        System.out.println("welcome to hotel reservation system");
        HotelReservationService hotelReservationService =new HotelReservationService();
        Hotel lakewood=new Hotel("Lakewood",110);
        hotelReservationService.hotelList.add(lakewood);
        Hotel bridgewood=new Hotel("Bridgewood",160);
        hotelReservationService.hotelList.add(bridgewood);
        Hotel ridgewood=new Hotel("Ridgewod",220);
        hotelReservationService.hotelList.add(ridgewood);
        System.out.println(hotelReservationService.hotelList);

    }
}
