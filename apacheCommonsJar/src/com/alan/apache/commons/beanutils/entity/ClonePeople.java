package com.alan.apache.commons.beanutils.entity;

/**
 * 
 * <p>复制实体</p>
 * @author alanzhang211 2015-1-2 上午11:20:00
 * @blog http://www.alanzhang211.com
 * @GitHub https://github.com/alanzhang211
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2015-1-2
 * @modify by reason:{方法名}:{原因}
 */
public class ClonePeople {
	/**姓名*/
	private String name;
	/**年龄*/
	private Integer age;
	/**地址*/
	private Address address;
	
	public String getName() {
    	return name;
    }
	
    public void setName(String name) {
    	this.name = name;
    }
	
    public Integer getAge() {
    	return age;
    }
	
    public void setAge(Integer age) {
    	this.age = age;
    }

	
    public Address getAddress() {
    	return address;
    }

	
    public void setAddress(Address address) {
    	this.address = address;
    }
}
