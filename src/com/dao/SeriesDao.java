package com.dao;

import java.io.Serializable;
import java.util.List;

import com.bean.Series;

public interface SeriesDao {
	public List<Series> getAll(String hql, Serializable... serializables);
}
