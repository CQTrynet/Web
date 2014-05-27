package com.biz.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.Series;
import com.biz.SeriesBiz;
import com.dao.SeriesDao;
import com.dao.impl.SeriesDaoImpl;

public class SeriesBizImpl implements SeriesBiz {

	private SeriesDao sd = new SeriesDaoImpl();

	@Override
	public List<Series> getAll(Serializable... serializables) {
		String hql = "from Series";
		List<Series> list = sd.getAll(hql, serializables);
		return list;
	}

}
