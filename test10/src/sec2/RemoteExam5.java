package sec2;
//RemoteControl 으로 선언하여 RemomteControl,Screen,Television
// ,Audio로 형 변환 하여 활용해보아라
public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl a; //RemoteControl 객체 선언
		a = new RemoteControl() { //RemoteControl 로 형 변환
			int volume;
			public void turnOff() {
				System.out.println("전원 Off");		
			}
			public void turnOn() {
				System.out.println("전원 On");		
			}
			public void setVolume(int volume) {
				if(volume > Max) {
					this.volume = RemoteControl.Max;
				} else if(volume<Min) {
					this.volume = RemoteControl.Min;
				} else {
					this.volume = volume;			
				}		
			}		
		};	
		a.turnOn();
		a.setVolume(5);
		a.setMute(true);
		a.setMute(false);
		a.turnOff();
		
	}

}
