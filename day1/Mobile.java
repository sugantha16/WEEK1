package week1.day1;

public class Mobile {

//className objectName= new className();
	public void makeCall() {
		String mobileModel = "OnePlus 9 Pro";
		float mobileWeight = 1.98f;
		System.out.println("Mobile model name: " +mobileModel);
		System.out.println("Mobile weight: " +mobileWeight);
	}

	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost = 20000;
		System.out.println("Is mobile charge is full: " +isFullCharged);
		System.out.println("Price : " +mobileCost);

	}

	public static void main(String[] args) {
		System.out.println("This is My mobile");
		Mobile c = new Mobile();
		c.makeCall();
		c.sendMsg();
	}
}
