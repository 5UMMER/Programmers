package level1;

public class P_y {

	public static void main(String[] args) {
		String s = "pPoooyY";

		// ���ڿ� s�� toUpperCase�� �̿��� ��� �빮�ڷ� ��ȯ
		s = s.toUpperCase();
		
		// ���ڿ� ���� P�� Y�� ���� �������� ��������
		int pCount = 0, yCount = 0;
		

		// ���ڿ� s�� ���̸�ŭ for���� �����ְ� ���ڿ�s�� charAt���� �ϳ��� ���� ��
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == 'Y'){
				pCount++;
			}else if(s.charAt(i) == 'P'){
				yCount++;
			}
		}
		// ���׿����ڷ� true, false ���
		System.out.println((pCount == yCount) ? true : false );
	}
	
}
