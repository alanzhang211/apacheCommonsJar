package com.alan.apache.commons.beanutils.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.alan.apache.commons.beanutils.entity.Address;
import com.alan.apache.commons.beanutils.entity.ClonePeople;
import com.alan.apache.commons.beanutils.entity.People;

/**
 * 
 * <p>测试类</p>
 * @author alanzhang211 2015-1-2 下午03:29:56
 * @blog http://www.alanzhang211.com
 * @GitHub https://github.com/alanzhang211
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2015-1-2
 * @modify by reason:{方法名}:{原因}
 */
public class BeanUtilsDemoTest {
	private BeanUtilsDemo beanUtilsDemo;
	private People people;
	@Before
	public void setUp() throws Exception {
		beanUtilsDemo = new BeanUtilsDemo();
		people = new People();
		people.setName("alan");
		people.setAge(25);
		people.setAddress(new Address("hangzhou","555号"));
	}
	
	@Test
	public void testGetClonePeople() {
		ClonePeople clonePeople = beanUtilsDemo.getClonePeopleByBeanUtils(people);
		assertEquals(25, clonePeople.getAge().intValue());
	}
	
	@Test
	public void testGetProperty() {
		assertEquals("alan", beanUtilsDemo.getProperty(people));
	}
	
	@Test
	public void testGetAddressByConstructorUtils() throws Exception{
		Object[] args = {"nanjing","666"};
		Address address = (Address)beanUtilsDemo.getAddressByConstructorUtils(Address.class, args);
		assertEquals("666", address.getRoad());
	}
	
	@Test
	public void testGetMethodByMethodUtils() {
		assertEquals("toString",beanUtilsDemo.getMethodByMethodUtils(people.getClass()).getName());
	}
}
