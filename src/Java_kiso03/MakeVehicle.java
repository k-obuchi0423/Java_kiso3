package Java_kiso03;

public class MakeVehicle {
	public static void main(String[] args) {
		//vehicleとしてVehicleをインスタンス化
		Car vehicle = new Car("車","VW","2020/03/17",0,100,0);
		
		
		//Vehicleクラスのメソッドを表示
		vehicle.Get();
		System.out.println(vehicle.getPurchaseDate());
		System.out.println(vehicle.getCoordinate());
		System.out.println(vehicle.getFuel());
		System.out.println();
		
		vehicle.run(30);
		vehicle.run(-50);
		vehicle.run(-80);
		vehicle.run(30);
		
		
	}
}
		
		