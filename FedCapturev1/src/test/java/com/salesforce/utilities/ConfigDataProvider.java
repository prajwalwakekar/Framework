package com.salesforce.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;

	public ConfigDataProvider()
	{
		File src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fin = new FileInputStream(src);
			pro=new Properties();
			pro.load(fin);
		
		} catch (Exception e) {
			System.out.println("Sorry, Couldn't load file"+e.getMessage());
		}
	}
	
	public String getConfig(String keyToSearch)
	{
		return pro.getProperty(keyToSearch);
	}
	
	public String getBrowser()
	{
		return pro.getProperty("browser");
	}
	
	public String getURL()
	{
		return pro.getProperty("url");
	}
}
