package surendran01;
class car{
	String brand;
	String model;
	int year;
	public void setcar(String brand,String model,int year) {
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	public void displayinfo() {
		System.out.println("brand"+brand+"model"+model+"year"+year);
	}
}
public class prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car car1=new car();
car car2=new car();
car1.setcar("toyato","camry",2020);
car1.displayinfo();
car2.setcar("honda","accord",2021);
car2.displayinfo();
}

}
