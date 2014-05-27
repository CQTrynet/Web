package com.biz;

import java.io.Serializable;
import java.util.List;

import com.bean.Series;

public interface SeriesBiz {
	public List<Series> getAll(Serializable... serializables);
}
