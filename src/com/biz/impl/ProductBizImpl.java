package com.biz.impl;

import java.io.Serializable;
import java.util.List;

import com.bean.Product;
import com.biz.ProductBiz;
import com.dao.ProductDao;
import com.dao.impl.ProductDaoImpl;

public class ProductBizImpl implements ProductBiz {

	private ProductDao pd = new ProductDaoImpl();
	
	@Override
	public List<Product> getByEffectOfIndex(int firstResult,
			Serializable... serializables) {
		String hql = "from Product where effect.id = ?";
		List<Product> list = pd.getByEffectOfIndex(hql, firstResult, serializables); 
		return list;
	}

	@Override
	public Product getById(Serializable... serializables) {
		String hql = "from Product where id = ?";
		Product product = pd.getById(hql, serializables);
		return product;
	}

	@Override
	public List<Product> getByNameOfIndex(int firstResult,
			Serializable serializables) {
		String hql = "from Product where name like ?";
		List<Product> list = pd.getByEffectOfIndex(hql, firstResult, "%" + serializables + "%"); 
		return list;
	}

	@Override
	public List<Product> getBySeriesOfIndex(int firstResult,
			Serializable... serializables) {
		String hql = "from Product where series.id = ?";
		List<Product> list = pd.getBySeriesOfIndex(hql, firstResult, serializables);
		return list;
	}

	@Override
	public List<Product> getByTypeOfIndex(int firstResult,
			Serializable... serializables) {
		String hql = "from Product where productType.id = ?";
		List<Product> list = pd.getByEffectOfIndex(hql, firstResult, serializables); 
		return list;
	}

}
