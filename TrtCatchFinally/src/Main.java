import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Main {
	public static void main(String[] args)  {
		BufferedReader bufferedReader=null;
		int total=0;
		try {
			 bufferedReader= new BufferedReader(new FileReader("path of file"));
			 String line=null;
			 while((line=bufferedReader.readLine())!=null) {
				total+=Integer.valueOf(line);
			 }
			 System.out.println("toplam total : " + total );
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bufferedReader.close();
			} 
			catch (Exception exception) {
				
			}
		}
	}

}
