package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.Series;
import com.dao.SeriesDao;
import com.util.HibernateUtil;

@SuppressWarnings("unchecked")
public class SeriesDaoImpl implements SeriesDao {

	@Override
	public List<Series> getAll(String hql, Serializable... serializables) {
		List<Series> list = HibernateUtil.getQuery(hql, serializables);
		return list;
	}

}
