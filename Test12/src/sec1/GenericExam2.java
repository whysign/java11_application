package sec1;

class StudentMap<K, V> {
    private K key;
    private V value;

    public StudentMap() {
    }

    public StudentMap(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class GenericExam2 {
    public static void main(String[] args) {
        StudentMap<Integer, String> s1 = new StudentMap<>(1, "박은성");
        StudentMap<Integer, String> s2 = new StudentMap<>(2, "김지훈");
        StudentMap<Integer, String> s3 = new StudentMap<>(3, "이수훈");
        StudentMap<Integer, String> s4 = new StudentMap<>(4, "이시현");
    }
}