package com.alan.apache.commons.csv;
import org.junit.Before;
import org.junit.Test;
/**
 * <p>junit测试代码</p>
 * @author alanzhang211 2014-12-27 下午04:08:29
 * @blog http://www.alanzhang211.com
 * @GitHub https://github.com/alanzhang211
 * @version V1.0   
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2014-12-27
 * @modify by reason:{方法名}:{原因}
 */
public class CSVTestDemoTest {
	/**CSV实例*/
	private CSVTestDemo csvTestDemo;
	@Before
	public void setUp(){
		csvTestDemo = new CSVTestDemo();
	}
	
	@Test
	public void WriteCSV(){
		csvTestDemo.writeCSV();
	}
	
	@Test
	public void ReadCSV(){
		csvTestDemo.readCSV();
	}
	
}
