package com.lotto.web.test;

import java.util.Random;

public class test {

	public static void main(String[] args) {
		String lottoSeq ="";
		String lottoNum = "";
		Random ran = new Random();
		
		for(int i = 0;i<6;i++) {
			if(i==0) {
				lottoSeq = "No. ";
			}else if (i==5) {
				lottoSeq+= ran.nextInt(9999)+" / ";
			}
		}
		for (int j = 0; j < 6; j++) {
			if (j != 5) {
				lottoNum += Integer.toString(ran.nextInt(45)+1)+",";
			}else {
				lottoNum += Integer.toString(ran.nextInt(45)+1);
			}
		}
		System.out.println(lottoSeq+lottoNum);
	}

}
