package com.dao;

import java.io.Serializable;
import java.util.List;

import com.bean.ProductType;

public interface ProductTypeDao {
	public List<ProductType> getAll(String hql, Serializable... serializables);
}
