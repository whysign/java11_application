
package section;

public class Computer {
	private int selNum;			//��ǰ��ȣ
	private int bit;			//��Ʈ��
	private String name;		//��ǻ���̸�
	private String modelNum;	//�𵨸�
	private String maker;		//������
	private int memory;			//�޸� �뷮
	public Computer() {}
	public Computer(int selNum, int bit, String name, String modelNum, String maker, int memory) {
		this.selNum = selNum;
		this.bit = bit;
		this.name = name;
		this.modelNum = modelNum;
		this.maker = maker;
		this.memory = memory;
	}
	public int getSelNum() {
		return selNum;
	}
	public void setSelNum(int selNum) {
		this.selNum = selNum;
	}
	public int getBit() {
		return bit;
	}
	public void setBit(int bit) {
		this.bit = bit;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModelNum() {
		return modelNum;
	}
	public void setModelNum(String modelNum) {
		this.modelNum = modelNum;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Computer [selNum=" + selNum + ", bit=" + bit + ", name=" + name + ", modelNum=" + modelNum + ", maker="
				+ maker + ", memory=" + memory + "]";
	}
}
