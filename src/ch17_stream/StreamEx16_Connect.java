package ch17_stream;

import java.util.function.UnaryOperator;

public class StreamEx16_Connect {
	public static void main(String[] args) {
		UnaryOperator<Member2> operator = UnaryOperator.identity();
		Member2 member = operator.apply(new Member2("홍길동", "hong", null));
		System.out.println("이름: " + member.getName());
		System.out.println("아이디: " + member.getId());
	}
}
