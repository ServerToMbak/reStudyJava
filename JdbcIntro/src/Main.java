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
				String sql="delete from city where id=? ";//�al��t�raca��m�z sql kodu
				
				statement = connection.prepareStatement(sql);
				statement.setInt(1, 4086);
				int result=statement.executeUpdate();
				System.out.println("kay�t silindi");
		
				
			} catch (SQLException exception) {
				helper.showErrorMessage(exception);	
				
			}finally {
				statement.close();  //statement ve connection'� kapatt���m�z k�s�m
				connection.close();
			}
		
	}
	public void updateData()throws SQLException{
		Connection connection=null;
		DbHelper helper=new DbHelper();
		PreparedStatement statement=null;
		ResultSet resultSet;	
			try {

				connection =helper.getConnection();
				String sql="update city set population = 100000 where id = ? ";//�al��t�raca��m�z sql kodu
				
				statement = connection.prepareStatement(sql);
				statement.setInt(1, 4086);
				int result=statement.executeUpdate();
				System.out.println("kay�t g�ncellendi");
		
				
			} catch (SQLException exception) {
				helper.showErrorMessage(exception);	
				
			}finally {
				statement.close();  //statement ve connection'� kapatt���m�z k�s�m
				connection.close();
			}
	}
	public static void insertData() throws SQLException{
		Connection connection=null;
		DbHelper helper=new DbHelper();
		PreparedStatement statement=null;
		ResultSet resultSet;	
			try {
  
				connection =helper.getConnection();  //dtaabase'e ba�lanma
				String sql="insert into city(Name,CountryCode,District,Population) values(?,?,?,?)";
				statement = connection.prepareStatement(sql);
				statement.setString(1, "D�zce2");
				statement.setString(2, "TUR");
				statement.setString(3, "TURKKEY");
				statement.setInt(4, 70000);
				
				
				int result=statement.executeUpdate();
				System.out.println("kay�t ekledi");
		
				
			} catch (SQLException exception) {
				helper.showErrorMessage(exception);	
				
			}finally {
				statement.close();
				connection.close();
			}
		
	}
	
	public static void select() throws SQLException {
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
