import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class HotelReservationService {

    public List<Hotel> hotelList=new ArrayList<Hotel>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
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
        hotelReservationService.findCheapestHotel("10 09 2020","11 09 2020");
    }
    public Result findCheapestHotel(String initialdateRange,String endDateRange){
        LocalDate intialDate = LocalDate.parse(initialdateRange, formatter);
        LocalDate endDate = LocalDate.parse(endDateRange, formatter);
        int numberOfDays=endDate.getDayOfMonth()-intialDate.getDayOfMonth()+1;
        Optional<Hotel> cheapestHotel=hotelList.stream().sorted(Comparator.comparing(Hotel::getRegularRate)).findFirst();
        Result result=new Result();
        result.setHotelName(cheapestHotel.get().getHotelName());
        result.setTotalRate(cheapestHotel.get().getRegularRate()*numberOfDays);
        System.out.println(result);
        return result;
    }
}
