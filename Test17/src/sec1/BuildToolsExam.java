package sec1;
//Ant : 자바 프로젝트 빌드 도구 시초  (사용 x)
//Maven : Springframework 의 빌드 도구 (사용o) 
//Gradle : Spring boot 의 빌드 도구 (사용o)
public class BuildToolsExam {
	public static void main(String[] args) {
		String build1 = "Ant : 자바 프로젝트 빌드 도구 시초  (사용 x)";
		String build2 = "Maven : Springframework 의 빌드 도구 (사용o)-> pom.xml ";
		String build3 = "Gradle : Spring boot 의 빌드 도구 (사용o)->build.gradle";
		System.out.println("자바의 빌드 도구  : ");
		System.out.println("빌드(build) 도구 : 프로젝트에 필요한 구조를 만들어 주는 도구");
		System.out.println("빌드 방식 1 : "+build1);
		System.out.println("빌드 방식 2 : "+build2);
		System.out.println("빌드 방식 3 : "+build3);
	}
}
