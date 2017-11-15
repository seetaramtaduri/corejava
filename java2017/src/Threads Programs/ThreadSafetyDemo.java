

public class ThreadSafetyDemo{
	public static void main(String[] args){
	BusReservation br = new BusReservation();
	PassengerThread pt1 = new PassengerThread(2,br,"SAM");
	PassengerThread pt2 = new PassengerThread(2, br,"JACK");
	pt1.start();
	pt2.start();
	}
}