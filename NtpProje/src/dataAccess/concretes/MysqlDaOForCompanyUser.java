package dataAccess.concretes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dataAccess.abstracts.UserDao;
import entities.Company;
public class MysqlDaOForCompanyUser<T> implements UserDao<Company>{
	ArrayList<Company> companyList=new ArrayList<Company>();
	Connection connection=null;
	DbHelper helper=new DbHelper();
	PreparedStatement statement=null;
	Statement statementa=null;
	ResultSet resultSet;	
	public MysqlDaOForCompanyUser(){
		
	}
	@Override
	public void add(Company company)  {
		
			try {
				connection =helper.getConnection();  //dtaabase'e baðlanma
				String sql="insert into company(id,email,password,CompanyName) values(?,?,?,?)";
				statement = connection.prepareStatement(sql);
				statement.setInt(1, company.getId());
				statement.setString(2, company.getEmail());
				statement.setString(3, company.getPassword());
				statement.setString(4, company.getCompanyName());
				int result=statement.executeUpdate();
				System.out.println("kayýt database eklendi " + company.getCompanyName());
		
				
			} catch (SQLException exception) {
				helper.showErrorMessage(exception);	
				
			}
	}

	@Override
	public void delete(Company company) {
			try {

				connection =helper.getConnection();
				String sql="delete from company where id=? ";//çalýþtýracaðýmýz sql kodu
				statement = connection.prepareStatement(sql);
				statement.setInt(1,company.getId());
				int result=statement.executeUpdate();
				System.out.println("kayýt database'den silindi");
		
				
			} catch (SQLException exception) {
				helper.showErrorMessage(exception);	
				
			}
	}

	@Override
	public void update(Company company) {
		try {

			connection =helper.getConnection();
			String sql="update company set companyName = ?, Email=?, password=? where id = ? ";//çalýþtýracaðýmýz sql kodu
			
			statement = connection.prepareStatement(sql);
			statement.setString(1, company.getCompanyName());
			statement.setString(2, company.getEmail());
			statement.setString(3,	company.getPassword());
			statement.setInt(4, company.getId());
			int result=statement.executeUpdate();
			System.out.println("kayýt güncellendi");
	
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			}
		
	}

	@Override
	public void getAll() {
		try {
		
			connection =helper.getConnection();
			statementa = connection.createStatement();
			resultSet=statementa.executeQuery("select id,CompanyName,Email,password from company");
			
			
			while(resultSet.next()) {
				companyList.add(new Company(
						resultSet.getInt("id"),
						resultSet.getString("Email"),
						resultSet.getString("CompanyName")));
			}
			System.out.println("-----------------Veri tabanýndaki þirket Listesi------------------------");
			for(Company company: companyList) {
				
			}
			System.out.println(companyList.size());
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			System.out.println(exception.getMessage());
		}
}
	@Override
	public void find(Company company) {
		
		try {
			
			connection =helper.getConnection();

			resultSet=statementa.executeQuery("select id,CompanyName,Email,password from company");
			statement.setInt(1, company.getId());
			resultSet.getString("CompanyName");
		String a=	resultSet.getString(company.getCompanyName());	
			System.out.println(a+"a");
			
		} catch (SQLException exception) {
			helper.showErrorMessage(exception);	
			System.out.println(exception.getMessage());
		}
		
	}	
	}
	

