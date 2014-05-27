package com.biz.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.ProductType;
import com.biz.ProductTypeBiz;
import com.dao.ProductTypeDao;
import com.dao.impl.ProductTypeDaoImpl;

public class ProductTypeBizImpl implements ProductTypeBiz {

	private ProductTypeDao ptd = new ProductTypeDaoImpl();

	@Override
	public List<ProductType> getAll(Serializable... serializables) {
		String hql = "from ProductType";
		List<ProductType> list = ptd.getAll(hql, serializables);
		return list;
	}

}
