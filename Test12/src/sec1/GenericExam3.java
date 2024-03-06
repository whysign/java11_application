package sec1;

interface Material {
    void doPrinting();
}

class Powder implements Material {
    @Override
    public void doPrinting() {
        System.out.println("파우더 재료로 출력합니다.");
    }

    @Override
    public String toString() {
        return "Powder";
    }
}

class Plastic implements Material {
    @Override
    public void doPrinting() {
        System.out.println("플라스틱 재료로 출력합니다.");
    }

    @Override
    public String toString() {
        return "Plastic";
    }
}

class GenericPrint<T extends Material> {
    private T material;

    public GenericPrint() {
    }

    public GenericPrint(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }
}

public class GenericExam3 {
    public static void main(String[] args) {
        Plastic p1 = new Plastic();
        p1.doPrinting();
        GenericPrint<Plastic> g1 = new GenericPrint<>(p1);

        Powder p2 = new Powder();
        p2.doPrinting();
        GenericPrint<Powder> g2 = new GenericPrint<>(p2);
    }
}