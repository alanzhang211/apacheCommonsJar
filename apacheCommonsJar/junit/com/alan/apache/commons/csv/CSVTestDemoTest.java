package com.alan.apache.commons.csv;
import org.junit.Before;
import org.junit.Test;
/**
 * <p>junit���Դ���</p>
 * @author alanzhang211 2014-12-27 ����04:08:29
 * @blog http://www.alanzhang211.com
 * @GitHub https://github.com/alanzhang211
 * @version V1.0   
 * @modificationHistory=========================�߼��������ش�����¼
 * @modify by user: {�޸���} 2014-12-27
 * @modify by reason:{������}:{ԭ��}
 */
public class CSVTestDemoTest {
	/**CSVʵ��*/
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
