package com.biz;

import java.io.Serializable;
import java.util.List;

import com.bean.Product;

public interface ProductBiz {
	public Product getById(Serializable... serializables);

	public List<Product> getByNameOfIndex(int firstResult,
			Serializable serializables);

	public List<Product> getByTypeOfIndex(int firstResult,
			Serializable... serializables);

	public List<Product> getBySeriesOfIndex(int firstResult,
			Serializable... serializables);

	public List<Product> getByEffectOfIndex(int firstResult,
			Serializable... serializables);
}
