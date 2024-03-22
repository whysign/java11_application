package behavioral.command;
//Command Pattern : ��û�� ĸ��ȭ�Ͽ� ���� ����� ������ �� �ִ� ����
public class CommandPattern {
	public static void main(String[] args) {
		
		Command com1 = new AlarmCommand(new Alarm());
		Button btn1 = new Button(com1);	//Button�� Alarm�� Lamp�� ����� ���� ������ �� �ְ� ����
		btn1.pressed(true);
		btn1.pressed(false);
		
		com1 = new LampCommand(new Lamp());
		btn1 = new Button(com1);
		btn1.pressed(true);
		btn1.pressed(false);
	}
}