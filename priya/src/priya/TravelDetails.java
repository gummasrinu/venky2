package priya;

public class TravelDetails {
	public static void Travel(String bustype,String source,String destination) {
		System.out.println("bus details");
		System.out.println("--------------");
		System.out.println("bus type="+bustype);
		System.out.println("pickup place="+source);
		System.out.println("droping place="+destination);
		System.out.println(" ");
	}
	public static void Travel(String traintype,String destination,int platform) {
		System.out.println("train details");
		System.out.println("--------------");
		System.out.println("train type="+traintype);
		System.out.println("droping place="+destination);
		System.out.println("platform no:"+platform);
		System.out.println(" ");

	}
	public static void Travel(String flightname,String destination,String typeofticket,int price) {
		System.out.println("flight details");
		System.out.println("--------------");
		System.out.println("flight name="+flightname);
		System.out.println("dropping place="+destination);
		System.out.println("ticket type="+typeofticket);
		System.out.println("ticket price="+price);
		System.out.println(" ");
	}
	public static void main(String args[]) {
		Travel("Ac bus","Hydrabad","Guntur");
		Travel("Superfast Express","vijayawada",2);
		Travel("KingFisher","London","Business Class",30000);


	}


}
