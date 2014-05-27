package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Product;
import com.biz.ProductBiz;
import com.biz.impl.ProductBizImpl;

public class ProductByTypeId extends HttpServlet {

	private static final long serialVersionUID = -6149254831831377322L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ProductBiz pb = new ProductBizImpl();
		List<Product> list = pb.getByTypeOfIndex(1, 2);
		if (list != null) {
			request.setAttribute("products", list);
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		}
	}

}
