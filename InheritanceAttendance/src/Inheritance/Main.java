package Inheritance;

public class Main {
	
	public static void main(String[] args) {
		
        //Create a subclass of Car class and name it Toyota-VIOS, which has the following properties and methods (tire type and method drive());
		
		// Instance of Car class
		ToyotaVIOS ToyotaVIOS = new ToyotaVIOS();
		
		ToyotaVIOS.speed = 140;
		ToyotaVIOS.color = "Black";
		ToyotaVIOS.price = 1500000 ;
		System.out.println("TOYOTA VIOS");
		System.out.println(ToyotaVIOS.speed + "km/h");
		System.out.println(ToyotaVIOS.color);
		System.out.println("Php "+ToyotaVIOS.price);
		System.out.println(ToyotaVIOS.tireType);
		
		ToyotaVIOS.drive();
		ToyotaVIOS.stop();
		
		System.out.println("=================================================================================");
		
        //Create a subclass of Plane class and name it U-2 Spy Plane, which has the following properties and methods (wing span and method fly());
		// Instance of Plane class
		U_2SpyPlane U2_SpyPlane = new U_2SpyPlane();
		
		U2_SpyPlane.speed = 850;
		U2_SpyPlane.color = "White";
		U2_SpyPlane.price = 40000000;
		System.out.println("U_2 SPY PLANE");
		System.out.println(U2_SpyPlane.speed + "km/h");
		System.out.println(U2_SpyPlane.color);
		System.out.println("Php "+U2_SpyPlane.price);
		System.out.println(U2_SpyPlane.wingspan+ " ft");
		
		U2_SpyPlane.fly();
		U2_SpyPlane.stop();
		
		System.out.println("=================================================================================");
		
        //Create a subclass of Boat class and name it Fandango Yacht, which has the following properties and methods (MainSail color and method float());
		// Instance of Boat class
		FandagoYacht FandagoYacht = new FandagoYacht();
		
		FandagoYacht.speed = 60;
		FandagoYacht.color = "Gray";
		FandagoYacht.price = 50000000;
		System.out.println("FANDAGO YACHT");
		System.out.println(FandagoYacht.speed + "km/h");
		System.out.println(FandagoYacht.color);
		System.out.println("Php " + FandagoYacht.price);
		System.out.println(FandagoYacht.mainsailColor);
		
		FandagoYacht.Float();
		FandagoYacht.stop();
		
	}

}
