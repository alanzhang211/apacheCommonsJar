package com.alan.apache.commons.beanutils.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConstructorUtils;
import org.apache.commons.beanutils.MethodUtils;

import com.alan.apache.commons.beanutils.entity.ClonePeople;
import com.alan.apache.commons.beanutils.entity.People;

/**
 * 
 * <p>beanutils功能简单实现</p>
 * 提供对 Java 反射和自省API的包装
 * @author alanzhang211 2015-1-2 上午11:21:37
 * @blog http://www.alanzhang211.com
 * @GitHub https://github.com/alanzhang211
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2015-1-2
 * @modify by reason:{方法名}:{原因}
 */
public class BeanUtilsDemo {
	/**
	 * BeanUtils.copyProperties对象间属性赋值
	 * @author alanzhang211 2015-1-2 下午03:15:17
	 * @param people
	 * @return ClonePeople
	 */
	public ClonePeople getClonePeopleByBeanUtils(People people){
		ClonePeople clonePeople = new ClonePeople();
		try {
	        BeanUtils.copyProperties(clonePeople,people);
        } catch (IllegalAccessException e) {
	        e.printStackTrace();
        } catch (InvocationTargetException e) {
	        e.printStackTrace();
        }
		return clonePeople;
	}
	/**
	 * BeanUtils.getProperty获取对象属性值
	 * @author alanzhang211 2015-1-2 下午04:13:23
	 * @param people
	 * @return
	 */
	public Object getProperty(People people){
		Object object = null;
		try {
			object = BeanUtils.getProperty(people, "name");
        } catch (IllegalAccessException e) {
	        e.printStackTrace();
        } catch (InvocationTargetException e) {
	        e.printStackTrace();
        } catch (NoSuchMethodException e) {
	        e.printStackTrace();
        }
        return object;
	}
	/**
	 * 通过ConstructorUtils构造对象
	 * @author alanzhang211 2015-1-2 下午04:58:48
	 * @param type 对象类型
	 * @param args 参数
	 * @return
	 */
    @SuppressWarnings({"rawtypes", "unchecked"})
    public Object getAddressByConstructorUtils(Class type,Object[] args) throws Exception{
        Class[] argsType = {String.class,String.class};
		return ConstructorUtils.invokeConstructor(type, args, argsType);
	}
	/**
	 * 通过MethodUtils获取方法
	 * @author alanzhang211 2015-1-2 下午05:31:05
	 * @param type
	 * @return
	 */
    public Method getMethodByMethodUtils(Class type){
    	return MethodUtils.getAccessibleMethod(type, "toString", new Class[]{});
    }
}
