package level1;

public class P_y {

	public static void main(String[] args) {
		String s = "pPoooyY";

		// 문자열 s를 toUpperCase를 이용해 모두 대문자로 변환
		s = s.toUpperCase();
		
		// 문자열 내에 P와 Y의 수를 세기위한 변수생성
		int pCount = 0, yCount = 0;
		

		// 문자열 s의 길이만큼 for문을 돌려주고 문자열s를 charAt으로 하나씩 꺼내 비교
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'Y'){
				pCount++;
			}else if(s.charAt(i) == 'P'){
				yCount++;
			}
		}
		// 삼항연산자로 true, false 출력
		System.out.println((pCount == yCount) ? true : false );
	}
	
}
