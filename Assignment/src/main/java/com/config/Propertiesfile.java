package com.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {
	

	public static void main(String[] args)throws IOException {
    Properties prop = new Properties();
	
	FileInputStream input = new FileInputStream("C:\\Users\\Home\\Desktop\\Expleo Project\\Assignment\\src\\main\\java\\com\\config\\config.properties");
	
	prop.load(input);
}
}