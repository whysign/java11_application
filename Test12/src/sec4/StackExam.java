package sec4;

import java.util.Stack;

//스택 : 탑 같이 입력할때는 쌓아올려지고 ,반대로 출력을 반대로하면 마지막에 입력한 가장위에 입력됨
//LIFO(Last In First Out) => 후입선출
public class StackExam {

	public static void main(String[] args) {
		Stack<String> stack =new Stack();
		
		//요소추가
		stack.push("수");
		stack.push("발");
		stack.push("간");
		stack.push("신");
		stack.push("바");
		stack.push("강");
		//한꺼번에출력
		System.out.println(stack);
		
		System.out.println(stack.peek()); //반환
		System.out.println(stack.peek());
		System.out.println(stack.pop());  //반환후 제거
		System.out.println(stack.peek());
		System.out.println(stack);
		
		

	}

}
