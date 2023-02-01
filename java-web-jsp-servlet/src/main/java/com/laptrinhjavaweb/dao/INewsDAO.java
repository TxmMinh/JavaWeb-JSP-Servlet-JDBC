package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.model.NewsModel;
import com.laptrinhjavaweb.paging.Pageable;

public interface INewsDAO extends GenericDAO<NewsModel> {
	NewsModel findOne(Long id);
	
	List<NewsModel> findByCategoryId(Long categoryId);

	Long save(NewsModel newsModel); // Function insert

	void update(NewsModel updateNews); // Function update
	
	void delete(long id); 
	
	List<NewsModel> findAll(Pageable pageable);
	
	int getTotalItem();

}
