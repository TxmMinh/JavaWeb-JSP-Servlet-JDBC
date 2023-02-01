package com.laptrinhjavaweb.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.print.attribute.standard.PageRanges;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjavaweb.constant.SystemConstant;
import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.PageRequest;
import com.laptrinhjavaweb.paging.Pageable;
import com.laptrinhjavaweb.service.INewsService;
import com.laptrinhjavaweb.sort.Sorter;
import com.laptrinhjavaweb.utils.FormUtil;

@WebServlet(urlPatterns = {"/admin-news"})
public class NewsController extends HttpServlet{

	private static final long serialVersionUID = -4420657226835614281L;

	@Inject
	private INewsService newsService;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * NewsModel model = new NewsModel(); 
		 * String pageStr = request.getParameter("page"); // get value name page from url String
		 * if (pageStr != null) {
		 * 	   model.setPage(Integer.parseInt(pageStr));
		 * } else { model.setPage(1); } 
		 */
		NewsModel model = FormUtil.toModel(NewsModel.class, request); // get parameters from url and map they with field in model		
		
		Pageable pageable = new PageRequest(model.getPage(), model.getMaxPageItem(),
											new Sorter(model.getSortName(), model.getSortBy()));
		model.setListResult(newsService.findAll(pageable));
		model.setTotalItem(newsService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getMaxPageItem()));
		request.setAttribute(SystemConstant.MODEL, model);
		RequestDispatcher rd = request.getRequestDispatcher("/views/admin/news/list.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
