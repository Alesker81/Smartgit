
 
/*
 * 
/*
import java.sql.*;


public class Bonjour {

	public static void main(String[] args) {
		
		/* Pour la declaration 
		String lastName = "Layla";
		String firstName = "Eithen";
		String email = "gozela@gmail.com";
		*/
		/*
		 * 
		 *	/*
			String sql = "Insert into users(lastName, firstName, email" + "Values(?,?,?)";
			PreparedStatement declaration = monconnexion.prepareStatement(sql);
			declaration.setString(1, lastName);
			declaration.setString(2, firstName);
			declaration.setString(3, email);
			
			int rows = declaration.executeUpdate();
 

		try {
			
			// Get a connection to database
			Connection monconnexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/alaskar", "root",
					"root");

			// Create a statement
			Statement monSt = monconnexion.createStatement();

			// Execute Sql query
			ResultSet monRes = monSt.executeQuery("select * from users");
			
			
			//Deleting sql query
			//String sql = "delete from users where lastName = 'Aleks'";
			
			// Process the result set
			while (monRes.next()) {
				System.out.print(monRes.getString("lastName") + ", " + monRes.getString("firstName") + ", "
						+ monRes.getString("email"));
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
 * */
