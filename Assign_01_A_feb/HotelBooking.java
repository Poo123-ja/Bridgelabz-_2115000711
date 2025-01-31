public class HotelBooking{
private String guestName;
private String roomType;
private int nights;
public HotelBooking(){
guestName="";
roomType="";
nights=0;
}
public HotelBooking(String guestName, String roomType, int nights){
this.guestName=guestName;
this. roomType=roomType;
this.nights=nights;
}
public HotelBooking(HotelBooking h){
this.guestName=h.guestName;
this. roomType=h.roomType;
this.nights=h.nights;
}
public void Display(){
System.out.println("Guestname: "+guestName);
System.out.println("roomType: "+roomType);
System.out.println("nights: "+nights);
}
public static void main(String [] args){
HotelBooking h1=new HotelBooking();
HotelBooking h2=new HotelBooking("Arun","delux",1);
HotelBooking h3=new HotelBooking(h2);
h1.Display();
h2.Display();
h3.Display();
}
}
