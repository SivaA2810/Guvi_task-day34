package org.prop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Datas_properties {
	
public static String url;
public static String giveusername;
public static String givepassword;
public static String username;
public static String password;

public static void main(String[] args) throws IOException {

	FileReader file = new FileReader("C:\\Users\\HP\\Eclipse workspace new\\Pom\\src\\test\\resources\\testdata.properties");
	Properties prop = new Properties();
	prop.load(file);
	giveusername = prop.getProperty("url");
	giveusername = prop.getProperty("giveusername");
	givepassword = prop.getProperty("givepassword");
	username = prop.getProperty("username");
	password = prop.getProperty("password");
	

}
}