package com.lotto.web.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lotto.web.domains.ConsumerBean;
import com.lotto.web.pool.Constant;
import com.lotto.web.serviceimpl.ConsumerServiceImpl;
import com.lotto.web.services.ConsumerService;

@WebServlet("/consumer.do")
public class ConsumerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Consumer 로 들어옴 ");
		String cid = request.getParameter("cid");
		String pass = request.getParameter("pass");
		ConsumerBean param = new ConsumerBean();
		
		String dest = request.getParameter("desk");
		switch(request.getParameter("action")) {
		case "move" : 
			request.getRequestDispatcher
			(String.format(Constant.VIEW_PATH,"consumer",request.getParameter("dest")))
			.forward(request, response);
			System.out.println("확인");
			break;
		case "join" :
			System.out.println("확인2");
//			param.setCid(cid);
//			param.setPass(pass);
//			ConsumerService service = new ConsumerServiceImpl();
//			service.registerConsumer(param);
//			response.getWriter().append("Served at: ").append(request.getContextPath());
			request.getRequestDispatcher
			(String.format(Constant.VIEW_PATH,"consumer",request.getParameter("dest")))
			.forward(request, response);
			System.out.println("확인1");
			break;
		case "login" :
			System.out.println("rrk");
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
