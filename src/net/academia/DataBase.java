package net.academia;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
	
	Connection c = null;
	boolean ligacao;
	public DataBase() {
		ligacao = false;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db","root","root");
			ligacao = true;
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} 
	}
	
	public DataBase(String senha, String pass){
		ligacao = false;
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db",senha,pass);
			ligacao = true;
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		} 
	}
	
	public boolean isOn(){
		return ligacao;
	}
	
}
