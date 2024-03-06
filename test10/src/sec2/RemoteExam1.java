package sec2;

public class RemoteExam1 {

	public static void main(String[] args) {
		RemoteControl a1;
		
		
		//RemoteControl() 로 객체를 생성하려면, 구현 내용을 기술해야함
		a1= new RemoteControl() {
			int volume;
			public void turnOn() {
				System.out.println("전원 On");
				
			}
			@Override
			public void setVolume(int volume) {
				if(volume > Max) {
					this.volume = RemoteControl.Max;
				} else if(volume<Min) {
					this.volume = RemoteControl.Min;
				} else {
					this.volume = volume;			
				}				
			}
			@Override
			public void turnOff() {
				System.out.println("전원 off");
				
			}					
		};		
		RemoteControl.changeBattery();
		a1.turnOn();
		a1.setMute(true);
		a1.setMute(false);
		a1.setVolume(4);
		a1.turnOff();
	}
}
