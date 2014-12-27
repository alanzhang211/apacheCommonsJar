package com.alan.apache.commons.csv;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
/**
 * 
 * <p>csvд�롢��ȡ</p>
 * @author alanzhang211 2014-12-27 ����03:10:00
 * @blog http://www.alanzhang211.com
 * @GitHub https://github.com/alanzhang211
 * @version V1.0   
 * @modificationHistory=========================�߼��������ش�����¼
 * @modify by user: {�޸���} 2014-12-27
 * @modify by reason:{������}:{ԭ��}
 */
public class CSVTestDemo {
	
	private final static String BASEPATH_STRING = System.getProperty("user.dir");
	/**
	 * д��CSV�ļ�
	 * @author alanzhang211 2014-12-27 ����03:19:38
	 * @throws Exception 
	 */
	public void writeCSV() {
		FileWriter writer = null;
		try {
			writer = new FileWriter(BASEPATH_STRING+"/WebRoot/docs/csv/test.csv");
	        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.RFC4180.withHeader("LastName","FirstName").withDelimiter(','));
	        List<String[]> dataList = new ArrayList<String[]>();
	        dataList.add(new String[]{"alan","zhang"});
	        printer.printRecords(dataList);
	        printer.close();
        } catch (IOException e) {
	        e.printStackTrace();
        }
	    
    }
	/**
	 * ��ȡCSV�ļ�����
	 * @author alanzhang211 2014-12-27 ����07:16:21
	 * @throws Exception
	 */
	public void readCSV(){
		Reader in = null;
		try {
	        in = new FileReader(BASEPATH_STRING+"/WebRoot/docs/csv/test.csv");
	        //��ָ���ļ�������Ĭ�ϵ�һ��Ϊ����
	        CSVParser parser = CSVFormat.EXCEL.withHeader().parse(in); 
	        //CSVParser parser = CSVFormat.EXCEL.withHeader("LastName","FirstName").parse(in);
	        String firstName = null;
	        String lastName = null;
	        for (CSVRecord record : parser) {
	        	lastName = record.get("LastName");
	            firstName = record.get("FirstName");
	            System.out.println("lastName:"+lastName);
	            System.out.println("firstName:"+firstName);
	        }
	        parser.close();
        } catch (FileNotFoundException e) {
	        e.printStackTrace();
        } catch (IOException e) {
	        e.printStackTrace();
        }
	}
}
