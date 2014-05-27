package com.biz;

import java.io.Serializable;
import java.util.List;

import com.bean.ProductType;

public interface ProductTypeBiz {
	public List<ProductType> getAll(Serializable... serializables);
}
