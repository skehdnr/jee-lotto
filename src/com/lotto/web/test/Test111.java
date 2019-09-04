package com.lotto.web.test;

import java.util.Arrays;
import java.util.Random;

public class Test111 {

	public static void main(String[] args) {
		String lottoSeq ="";
		String [] lottoNum = new String[6];
		Random ran = new Random();
		
		for(int i = 0;i<6;i++) {
			if(i==0) {
				lottoSeq = "No. ";
			}else if (i==5) {
				lottoSeq+= ran.nextInt(9999)+" / ";
			}
		}
		System.out.println("바코드"+ lottoSeq);
		
		for (int j = 0; j < 7; j++) {
			if (j != 6) {
				lottoNum[j] = Integer.toString(ran.nextInt(45)+1);
//				System.out.println(Arrays.toString(lottoNum));
			}
		}
		System.out.println(lottoSeq+Arrays.toString(lottoNum));

	}

}
