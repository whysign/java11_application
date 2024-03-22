
package section;
//����
public class Account {	
	private int accId;		//���¹�ȣ(5�ڸ�)
	private String name;	//������
	private String bankName;	//�������
	private int balance;	//�ܾ�
	public Account() {}
	public Account(int accId, String name, String bankName, int balance) {
		this.accId = accId;
		this.name = name;
		this.bankName = bankName;
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [���¹�ȣ:" + accId + ", ������=" + name + ", ���������=" + bankName + ", �ܾ�=" + balance + "]";
	}
}
