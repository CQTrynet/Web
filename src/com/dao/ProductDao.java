package com.dao;

import java.io.Serializable;
import java.util.List;

import com.bean.Product;

public interface ProductDao {
	public Product getById(String hql, Serializable... serializables);

	public List<Product> getByNameOfIndex(String hql, int firstResult,
			Serializable serializables);

	public List<Product> getByTypeOfIndex(String hql, int firstResult,
			Serializable... serializables);

	public List<Product> getBySeriesOfIndex(String hql, int firstResult,
			Serializable... serializables);

	public List<Product> getByEffectOfIndex(String hql, int firstResult,
			Serializable... serializables);
}
