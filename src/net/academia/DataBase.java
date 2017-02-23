package net.academia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
	
	Connection c = null;
	
	public DataBase() {
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:test.db","root","root");
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
		try {
			BufferedReader reader = new BufferedReader(new FileReader("teste.txt"));
			Statement smt = c.createStatement();
			String sql = "select * from TABELA;";
			ResultSet set = smt.executeQuery(sql);
			set.next();
			set.getString(1);

			c.setAutoCommit(false);
			int f = 36;
			
			c.setAutoCommit(true);
			smt.close();
			c.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
		
		
	}
}
