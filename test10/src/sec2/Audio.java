package sec2;

public class Audio implements RemoteControl{
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
	
	
	
}
