package com.ajio.genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains only property file specific common methods
 * @author Admin
 *
 */
public class PropertyFileLibrary {
	static Properties property;
	
	/**
	 * this method is used to open the property file
	 * @param filePath
	 * @throws IOException
	 */
	public static void openPropertyFile(String filePath) throws IOException {
		FileInputStream fis=new FileInputStream(filePath);
		property =new Properties();
		property.load(fis);
	}
	
	/**
	 * This method is used to get the data from the property file
	 * @param key
	 * @return
	 * @throws IOException 
	 */
	
	public static String getdataFromPropertyFile(String key) throws IOException {
		//openPropertyFile(key);
		String value = property.getProperty(key);
		return value;
	}
    
}
