package sec1;

class Outer2 { // 외부클래스
    private int num = 10;
    private static int snum = 20;

    static class Inner { // 정적 내부클래스
        int inNum = 1000;
        static int sInNum = 2000;

        static void inMethod() {
            // 정적 메서드에서는 외부 클래스의 인스턴스 멤버에 직접 접근할 수 없습니다.
            // System.out.println("내부클래스에서 외부클래스의 멤버 변수 : inNum " + inNum);
            System.out.println("내부클래스에서 외부클래스의 정적 멤버 : sInNum " + sInNum);
        }
    }

    static void outMethod() { // 메서드 이름 수정
        System.out.println("외부에서 내부 클래스의 정적 멤버 변수 sInNum = " + Inner.sInNum);
        System.out.println("외부에서 외부 클래스의 정적 멤버 변수 snum = " + snum);
    }
}

public class StaticInnerClassExam {
    public static void main(String[] args) {
        Outer2 out = new Outer2(); // 외부클래스의 인스턴스
        Outer2.outMethod();
        Outer2.Inner inner =new Outer2.Inner(); // 정적 내부 클래스의 메서드 호출
        inner.inMethod();
        //외부 클래스에서는 외부 메소드는 모두 실행 가능하면 , 내부메소드 및 멤버 변수의 접근 및 실행이 불가능
        //정적내부클래스에서는            및 메버 변수의 접근 및 실행이 가능
        
        
   }
}  