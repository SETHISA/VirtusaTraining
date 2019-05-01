package kasunTest;

public class Parent {

	private int money;
	
	public int getMoney() {
		return money/2;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void run() {
		System.out.println("parent Run");
	}
}
