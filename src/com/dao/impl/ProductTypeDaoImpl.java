package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.ProductType;
import com.dao.ProductTypeDao;
import com.util.HibernateUtil;

@SuppressWarnings("unchecked")
public class ProductTypeDaoImpl implements ProductTypeDao {

	@Override
	public List<ProductType> getAll(String hql, Serializable... serializables) {
		List<ProductType> list = HibernateUtil.getQuery(hql, serializables);
		return list;
	}

}
