package structural.bridge;
//Bridge Pattern : �߻�ȭ(abstraction)�� �������κ��� �и��Ͽ� ���� ���������� ��ȭ�� �� �ֵ��� �ϴ� ����
//�׷��Ƿ�, ��ɰ� ������ �и��Ͽ� ���������� ������ Ȯ���� �����ϵ��� ���յ��� ���� ����
//Bridge(Color)�� Ư�� �߻�ȭ Ŭ����(Shape)�� ����� ����ϰ�, ���� Ŭ����(Triangle, Pentagon)����
//�ش� ������ ��� ���� �ٸ� Ŭ������ �����Ͽ� ���� ���� �� ū ��ü�� ������ �� �ֵ��� �ϴ� ����
public class BridgePattern {
	public static void main(String[] args) {
		Shape triangle1 = new Triangle(new RedColor());
		Shape pentagon1 = new Pentagon(new GreenColor());
		Shape triangle2 = new Triangle(new GreenColor());
		Shape pentagon2 = new Pentagon(new RedColor());
		
		triangle1.applyColor();
		triangle2.applyColor();
		pentagon1.applyColor();
		pentagon2.applyColor();
	}
}