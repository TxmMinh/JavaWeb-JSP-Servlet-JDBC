package com.laptrinhjavaweb.service;

import java.util.List;

import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.Pageable;

public interface INewsService {

	List<NewsModel> findByCategoryId(Long categoryId); // Function Read
	
	NewsModel save(NewsModel newsModel); // Function Create
	
	NewsModel update(NewsModel updateNews); // Function Update
	
	void delete(long[] ids);
	
	List<NewsModel> findAll(Pageable pageable);
	
	int getTotalItem();
}
