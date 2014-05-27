package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Series;
import com.biz.SeriesBiz;
import com.biz.impl.SeriesBizImpl;

public class SeriesGet extends HttpServlet {

	private static final long serialVersionUID = 8717221159341264403L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		SeriesBiz sb = new SeriesBizImpl();
		List<Series> seriesList = sb.getAll();
		if (seriesList != null) {
			request.setAttribute("series", seriesList);
			request.getRequestDispatcher("index.jsp")
					.forward(request, response);
		}
	}
}
