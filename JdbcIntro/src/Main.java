import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Main {
	
	
	public static void main(String[] args) throws SQLException {
		Connection connection=null;
		DbHelper helper=new DbHelper();
		PreparedStatement statement=null;
		ResultSet resultSet;	
			try {

				connection =helper.getConnection();
				statement = connection.prepareStatement
				("insert into city(Name,CountryCode,District,Population) value('DÜZCE','TUR','Düzce',50000)");
				int result=statement.executeUpdate();
				System.out.println("kayýt ekledi");
		
				
			} catch (SQLException exception) {
				helper.showErrorMessage(exception);	
				
			}finally {
				statement.close();
				connection.close();
			}
		
	}
	
	
	
	public void select() throws SQLException {
		Connection connection=null;
		DbHelper helper=new DbHelper();
		Statement statement=null;
		ResultSet resultSet;	
			try {

				connection =helper.getConnection();
				statement = connection.createStatement();
				resultSet=statement.executeQuery("select code,name,continent,Region from country");
				ArrayList<Country> countries = new ArrayList<Country>();
				
				
				while(resultSet.next()) {
					countries.add(new Country(
							resultSet.getString("code"),
							resultSet.getString("name"),
							resultSet.getString("continent"),
							resultSet.getString("region")));
				}
				System.out.println(countries.size());
				
			} catch (SQLException exception) {
				helper.showErrorMessage(exception);	
				System.out.println(exception.getMessage());
			}finally {
				connection.close();
			}
	}
}
