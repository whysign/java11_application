package sec3;

public class Account {
	private int accontN;
	private String name;
	private String bank;
	private int money;
	
	public void deposit(int accontN) {
		money += accontN;	
		System.out.println("입금 처리");
		System.out.println("남은잔액");
	}
	public void withdraw(int accontN) {
		if(money>=accontN) {
			money -= accontN;
		} else {
			System.out.println("출금 처리");
			System.out.println("남은 잔액");
		}	
	}
	public void check() {
		System.out.println("은행이름"+this.bank);
		System.out.println("예금주"+this.name);
		System.out.println("계좌번호"+this.accontN);
		System.out.println("잔액"+this.money);
		
	}
	
	public int getAccontN() {
		return accontN;
	}
	public void setAccontN(int accontN) {
		this.accontN = accontN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [accontN=" + accontN + ", name=" + name + ", bank=" + bank + ", money=" + money + "]";
	}
	public Account(int accontN, String name, String bank, int money) {
		super();
		this.accontN = accontN;
		this.name = name;
		this.bank = bank;
		this.money = money;
	}
	

	
}
