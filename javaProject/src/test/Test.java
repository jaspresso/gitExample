package test;

public class Test {
	public static void main(String[] args) {
		//Character
		char[] data = {'H','e','l','l','o','1','2','3','4'};
		for(int i=0; i<data.length;i++) {
			if(Character.isUpperCase(data[i])) {
				System.out.println(data[i]+"는 대문자 입니다.");
			}else if(Character.isLowerCase(data[i])) {
				System.out.println(data[i]+"는 소문자 입니다.");
			}else if(Character.isDigit(data[i])) {
				System.out.println(data[i]+"는 숫자 입니다.");
			}
		}

		//Integer
		System.out.println("문자 " + Integer.toString(1234) + "입니다."); //정수를 문자열로 변환(toString)
		System.out.println("숫자 " + Integer.parseInt("1234") + "입니다."); //문자열 "1234"을 10진수로 변환(숫자열)
		System.out.println("숫자 1234 + 2는 " + Integer.sum(1234, 2) + " 입니다.");
	}
}
