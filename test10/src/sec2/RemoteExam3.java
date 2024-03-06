package sec2;

public class RemoteExam3 {

	public static void main(String[] args) {
		Television tel = new Television();
		
		RemoteControl.changeBattery();
		tel.setVolume(20);
		tel.setMute(true);
		tel.setMute(false);
		tel.light();
		tel.dark();
		tel.zoomim();
		tel.zoomout();
		tel.turnOff();

	}

}
