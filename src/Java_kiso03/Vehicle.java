package Java_kiso03;

public class Vehicle {
	//メンバ変数をそれぞれ宣言
	String vehicle;
	String maker;
	String purchaseDate;
	int coordinate;
	int fuel;
	int all;
		
	//コンストラクタを定義しメンバ変数の値を初期化
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
	
     //情報を表示するメソッド
	public void Get() {
		System.out.println("これは" + vehicle + "で");
		System.out.println("メーカーは" + maker + "です。");
		System.out.println(purchaseDate + "に購入しました");
		System.out.println("初期座標は" + coordinate + "で");
		System.out.println("残り燃料は" + fuel + "です。");
		System.out.println();
	}
	public void run(int location) {
	    System.out.println("現在位置を" + (location) + "移動");
	    System.out.println("残り燃料は" + this.fuel);
	}
}


