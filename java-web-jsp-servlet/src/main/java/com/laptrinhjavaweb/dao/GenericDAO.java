package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.mapper.RowMapper;

public interface GenericDAO<T> {
	@SuppressWarnings("hiding")
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters); // function read
	
	void update(String sql, Object... parameters); // function update/ delete
	Long insert(String sql, Object... parameters); // function create
	int count(String sql, Object... parameters);
}
