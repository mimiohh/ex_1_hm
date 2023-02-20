package lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoEx {
	
	public static void main(String[] args) {
		//��ȣ����
		int [] lotto = new int [6];
		Random random = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			//�ߺ�����
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					System.out.println("�ߺ� ����" + lotto[i]);
					i--;
					break;
				}
			}
		}
		//�������� ���� �ڵ�
		for(int i = 0; i < lotto.length; i++) {//�� ��ü
			for(int j = i+1; j < lotto.length; j++) {//�� ���
				if(lotto[i]>lotto[j]) {//�� ��ü�� �� ��󺸴� Ŭ ���, ���� �ٲ��ֶ�� �ǹ�
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}