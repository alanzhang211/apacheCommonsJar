package com.alan.apache.commons.beanutils.entity;

import org.apache.commons.beanutils.Converter;


public class MyConvert implements Converter {
	
	public <T> T convert(Class<T> type, Object value) {
		if (type == null) {
            return null;
        }
		return null;
	}
	
}
