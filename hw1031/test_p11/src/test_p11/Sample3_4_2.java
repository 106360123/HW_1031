package test_p11;

public class Sample3_4_2 {
	public static void main(String[]args) {
		Car car1;
		car1=new Car();
		car1.num=1234;
		car1.gas=20.5;
		car1.show();
		car1.show();
	}
}
class Car{
	int num;
	double gas;
	void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}