package Java_kiso03;

public class Vehicle {
	//�����o�ϐ������ꂼ��錾
	String vehicle;
	String maker;
	String purchaseDate;
	int coordinate;
	int fuel;
	int all;
		
	//�R���X�g���N�^���`�������o�ϐ��̒l��������
	Vehicle(String vehicle,String maker,String purchaseDate,int coordinate,int fuel,int all){
		this.vehicle = vehicle;
		this.maker = maker;
		this.purchaseDate = purchaseDate;
		this.coordinate = coordinate;
		this.fuel = fuel;
		this.all = all;
	}
	
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public int getCoordinate() {
		return coordinate;
	}
	public int getFuel() {
		return fuel;
	}
	
     //����\�����郁�\�b�h
	public void Get() {
		System.out.println("�����" + vehicle + "��");
		System.out.println("���[�J�[��" + maker + "�ł��B");
		System.out.println(purchaseDate + "�ɍw�����܂���");
		System.out.println("�������W��" + coordinate + "��");
		System.out.println("�c��R����" + fuel + "�ł��B");
		System.out.println();
	}
	public void run(int location) {
	    System.out.println("���݈ʒu��" + (location) + "�ړ�");
	    System.out.println("�c��R����" + this.fuel);
	}
}


