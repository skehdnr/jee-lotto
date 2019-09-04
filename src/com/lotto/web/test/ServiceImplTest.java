//package com.lotto.web.test;
//
//import java.util.Random;
//
//import com.lotto.web.daos.LottoDAO;
//import com.lotto.web.daoimpls.LottoDAOImpl;
//import com.lotto.web.domains.LottoBean;
//import com.lotto.web.services.LottoService;
//
//public class ServiceImplTest implements LottoService {
//	private LottoDAO dao;
//	public ServiceImplTest() {
//		dao = new LottoDAOImpl();
//	}
//	@Override
//	public void createLotto(LottoBean param) {
//		String lottoSeq ="";
//		String [] lottoNum = new String[6];
//		Random ran = new Random();
//		
//		for(int i = 0;i<6;i++) {
//			if(i==0) {
//				lottoSeq = "No. ";
//			}else if (i==5) {
//				lottoSeq+= ran.nextInt(9999)+" / ";
//			}
//		}
//		System.out.println("바코드"+ lottoSeq);
//		
//		for (int j = 0; j < 6; j++) {
//			if (j != 5) {
//				lottoNum[j] += String.valueOf(ran.nextInt(45)+1)+(",");
//			} else {
//				lottoNum[j] += String.valueOf(ran.nextInt(45)+1);
//			}
//			param.setLotteryNum(lottoNum);
//		}
//		System.out.println(param.getLottoSeq()+param.getLotteryNum());
//		dao.insertLotto(param);
//
//	}
//	@Override
//	public String createLottoSeq() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public int createBall() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public String createLotteryNum() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	@Override
//	public boolean exist(int[] arr, int a) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//	@Override
//	public int[] bubbleSort(int[] arr, boolean flag) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}





