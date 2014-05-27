package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Product;
import com.biz.ProductBiz;
import com.biz.impl.ProductBizImpl;

public class ProductIdGet extends HttpServlet {

	private static final long serialVersionUID = -3075172975510374161L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ProductBiz pb = new ProductBizImpl();
		Product product = pb.getById(1);
		if (product != null) {
			request.setAttribute("product", product);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
