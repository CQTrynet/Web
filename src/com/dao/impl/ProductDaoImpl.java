package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;
import com.util.HibernateUtil;

@SuppressWarnings("unchecked")
public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getByEffectOfIndex(String hql, int firstResult,
			Serializable... serializables) {
		List<Product> list = HibernateUtil.getQueryByIndex(firstResult, 8, hql,
				serializables);
		return list;
	}

	@Override
	public Product getById(String hql, Serializable... serializables) {
		Product product = (Product) HibernateUtil.getOne(hql, serializables);
		return product;
	}

	@Override
	public List<Product> getByNameOfIndex(String hql, int firstResult,
			Serializable serializables) {
		List<Product> list = HibernateUtil.getQueryByIndex(firstResult, 8, hql,
				serializables);
		return list;
	}

	@Override
	public List<Product> getBySeriesOfIndex(String hql, int firstResult,
			Serializable... serializables) {
		List<Product> list = HibernateUtil.getQueryByIndex(firstResult, 8, hql,
				serializables);
		return list;
	}

	@Override
	public List<Product> getByTypeOfIndex(String hql, int firstResult,
			Serializable... serializables) {
		List<Product> list = HibernateUtil.getQueryByIndex(firstResult, 8, hql,
				serializables);
		return list;
	}

}
