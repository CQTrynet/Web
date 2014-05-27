package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductType;
import com.biz.ProductTypeBiz;
import com.biz.impl.ProductTypeBizImpl;

public class ProductTypeGet extends HttpServlet {

	private static final long serialVersionUID = 5487013248573028974L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ProductTypeBiz ptb = new ProductTypeBizImpl();
		List<ProductType> list = ptb.getAll();
		if (list != null) {
			request.setAttribute("types", list);
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		}
	}

}
