package Java_kiso03;

public class MakeVehicle {
	public static void main(String[] args) {
		//vehicle�Ƃ���Vehicle���C���X�^���X��
		Car vehicle = new Car("��","VW","2020/03/17",0,100,0);
		
		
		//Vehicle�N���X�̃��\�b�h��\��
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
		
		