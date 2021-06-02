package simpleclass.one;

import java.time.LocalDate;

public class PetTester {

	public static void main(String[] args) {
		Pet 구름이 = new Pet("구름이", 7.5, 
				LocalDate.now().minusMonths(6));
//		구름이 = null;
				
		String 개이름 = 구름이.petName();
		System.out.println("'" + 개이름 + "'는 우리 개");
		int result = 구름이.summation(100, 200);
		System.out.println("합은: " + result);
		return ;
	}
	

}
