package sec2;

public class Television implements Screen {
	int volume;
	int lightness;
	int zoom;
	
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
	public int light() {
		System.out.println("밝게");
		if(this.lightness < 255 && this.lightness > 0) {
			this.lightness++;			
		}
		return this.lightness;
	}
	public int dark() {
		System.out.println("어둡게");
		if(this.lightness < 255 && this.lightness > 0) {
			this.lightness--;			
		}
		return this.lightness;
	}
	public int zoomim() {
		System.out.println("50%확대");
		if(zoom>= -500 && zoom<=500) {
			zoom+=50;
		}
		return zoom;
	}
	public int zoomout() {
		System.out.println("50%축소");
		if(zoom>= -500 && zoom<=500) {
			zoom-=50;
		}
		return zoom;	
	}	
}
