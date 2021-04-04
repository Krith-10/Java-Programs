import java.io.*;

public class RetrieveExcel {
	public static void main(String[] args) {
		try {
			FileReader f = new FileReader("MyCode.xlsx");
			BufferedReader reader = new BufferedReader(f);
			String line = null;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}