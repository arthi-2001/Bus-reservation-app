package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String PassengerName;
    int BusNo;
    Date date;
    
    Booking(){    //constructor
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your name: ");
    	PassengerName=sc.next();
    	System.out.println("Enter Bus No: ");
    	BusNo=sc.nextInt();
    	System.out.println("Enter date(dd-mm-yyyy): ");
    	String dateInput=sc.next();
    	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MM-yyyy");
    	try {
			date= dateformat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
    	int capacity=0;
    	for(Bus bus:buses) {
    		if(bus.getBusNo() == BusNo)
    		{
    			capacity=bus.getCapacity();
    		}
    	}
    	
    	int booked=0;
    	for(Booking b:bookings)
    	{
    		if(b.BusNo== BusNo && b.date.equals(date))
    		{
    			booked++;
    		}
    	}
    	return booked<capacity?true:false;
    }
}
