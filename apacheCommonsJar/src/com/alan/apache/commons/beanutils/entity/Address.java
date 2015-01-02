package com.alan.apache.commons.beanutils.entity;

/**
 * 
 * <p>住址</p>
 * @author alanzhang211 2015-1-2 上午11:27:48
 * @blog http://www.alanzhang211.com
 * @GitHub https://github.com/alanzhang211
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2015-1-2
 * @modify by reason:{方法名}:{原因}
 */
public class Address {
	/**城市*/
	private String city;
	/**街道*/
	private String road;
	/**
	 * 
	 * 创建一个新的实例Address.
	 */
	public Address(){
		super();
	}
	
	public Address(String city,String road){
		this.city = city;
		this.road = road;
	}
    public String getCity() {
    	return city;
    }
	
    public void setCity(String city) {
    	this.city = city;
    }
	
    public String getRoad() {
    	return road;
    }
	
    public void setRoad(String road) {
    	this.road = road;
    }
	
   
}
