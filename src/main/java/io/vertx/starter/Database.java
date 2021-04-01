package io.vertx.starter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class Database {
	
	private static Object LOCK = new Object();
	@SuppressWarnings("unused")
	private static Connection CON = createConnection();
	
	public static Connection init() {
		return createConnection();
	}
	
	private static Connection createConnection() {
		synchronized (LOCK) {
			if (CON != null) {
				return CON;
			}
			try {
				Class.forName("org.hsqldb.jdbc.JDBCDriver");
				Connection con =  DriverManager.getConnection("jdbc:hsqldb:mem:vertx", "sa", "");
				con.createStatement().execute("CREATE TABLE request_handler_data (id INT NOT NULL, title VARCHAR(50) NOT NULL, author VARCHAR(20) NOT NULL, submission_date DATE, PRIMARY KEY (id))");
				con.createStatement().execute("INSERT INTO request_handler_data VALUES (100,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("INSERT INTO request_handler_data VALUES (200,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("INSERT INTO request_handler_data VALUES (300,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("CREATE TABLE request_handler_outgoing (id INT NOT NULL, title VARCHAR(50) NOT NULL, author VARCHAR(20) NOT NULL, submission_date DATE, PRIMARY KEY (id))");
				con.createStatement().execute("INSERT INTO request_handler_outgoing VALUES (100,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("INSERT INTO request_handler_outgoing VALUES (200,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("INSERT INTO request_handler_outgoing VALUES (300,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("CREATE TABLE body_handler_data (id INT NOT NULL, title VARCHAR(50) NOT NULL, author VARCHAR(20) NOT NULL, submission_date DATE, PRIMARY KEY (id))");
				con.createStatement().execute("INSERT INTO body_handler_data VALUES (100,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("INSERT INTO body_handler_data VALUES (200,'Learn PHP', 'John Poul', NOW())");
				con.createStatement().execute("INSERT INTO body_handler_data VALUES (300,'Learn PHP', 'John Poul', NOW())");
				return con;
			} catch (Throwable t) {
				throw new InternalError(t);
			}
		}
	}
	
	public static synchronized void accessDB(String sql) {
		Objects.requireNonNull(sql);
		synchronized (LOCK) {
			try {			
				CON.createStatement().execute(sql);
			} catch (Throwable t) {
				t.printStackTrace(System.err);
			}
		}		
	}
	
}
