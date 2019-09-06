package com.lotto.web.daoimpls;

import java.io.File;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;

import com.lotto.web.daos.ConsumerDAO;
import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.pool.Constant;

public class ConsumerDAOImpl implements ConsumerDAO{
	@Override
	public void insertConsumer(ConsumerBean param) {
		try {
			File file = new File(Constant.FILE_PATH+"consumer20190906.txt");
			@SuppressWarnings("resource")
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,true));	
			writer.write(String.format("%s,%s", param.getCid(),param.getPass()));
			writer.newLine();
			writer.flush();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public ConsumerBean login(ConsumerBean param) {
		try {
		String msg="";
		File file = new File(Constant.FILE_PATH+"consumer20190906.txt");
		@SuppressWarnings("resource")
		BufferedReader reader = new BufferedReader (new FileReader(file));
		msg=reader.readLine();
		reader.close();
		String [] info = new String[2];
		info = msg.split(",");
		param.setCid(info[0]);
		param.setPass(info[1]);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return param;
	}
}
