//1.	;create multilevel inheritance for
//Vehicle
//Four_wheeler
//Petrol_Four_Wheeler
//FiveSeater_Petrol_Four_Wheeler
//Baleno_FiveSeater_Petrol_Four_Wheeler

package day4_Assignment;
class vehicle{
	void name(String name)
	{
		System.out.println("Name of the vehicle - "+name);
	}
}
class four_wheeler extends vehicle{
	void enginemodel(String name)
	{
		System.out.println("EngineModel of the vehicle - "+name);
	}
}
class five_seater_petrol_vehicle extends four_wheeler{
	void seatavailability(int n)
	{
		System.out.println("SeatAvailability of the vehicle - "+n);
	}
}
class baleno_five_seater_petrol_vehicle extends five_seater_petrol_vehicle{
	void vehicletype(String name) 
	{
		System.out.println("Type of the vehicle - "+name);
	}
}
public class example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baleno_five_seater_petrol_vehicle bmw=new baleno_five_seater_petrol_vehicle();
		System.out.println("**************BMW FEATURES***************");
		bmw.name("BMW");
		bmw.enginemodel("inline-3");
		bmw.seatavailability(7);
		bmw.vehicletype("diesel vehicle");
		baleno_five_seater_petrol_vehicle benz=new baleno_five_seater_petrol_vehicle();
		System.out.println("**************BENZ FEATURES***************");
		benz.name("BENZ");
		benz.enginemodel("v10");
		benz.seatavailability(5);
		benz.vehicletype("diesel vehicle");
		baleno_five_seater_petrol_vehicle innova=new baleno_five_seater_petrol_vehicle();
		System.out.println("**************INNOVA FEATURES***************");
		innova.name("INNOVA");
		innova.enginemodel("tata i10");
		innova.seatavailability(9);
		innova.vehicletype("diesel vehicle");
	}

}
//**************BMW FEATURES***************
//Name of the vehicle - BMW
//EngineModel of the vehicle - inline-3
//SeatAvailability of the vehicle - 7
//Type of the vehicle - diesel vehicle
//**************BENZ FEATURES***************
//Name of the vehicle - BENZ
//EngineModel of the vehicle - v10
//SeatAvailability of the vehicle - 5
//Type of the vehicle - diesel vehicle
//**************INNOVA FEATURES***************
//Name of the vehicle - INNOVA
//EngineModel of the vehicle - tata i10
//SeatAvailability of the vehicle - 9
//Type of the vehicle - diesel vehicle
