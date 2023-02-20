package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoEx {
	
	public static void main(String[] args) {
		//번호생성
		int [] lotto = new int [6];
		Random random = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			//중복제거
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("중복 숫자" + lotto[i]);
					i--;
					break;
				}
			}
		}
		//오름차순 정렬 코드
		for(int i = 0; i < lotto.length; i++) {//비교 주체
			for(int j = i+1; j < lotto.length; j++) {//비교 대상
				if(lotto[i]>lotto[j]) {//비교 주체가 비교 대상보다 클 경우, 값을 바꿔주라는 의미
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}