import java.io.*;

public class WriteExcel {
	public static void main(String[] args) {
		try {		
			FileWriter f = new FileWriter("MyCode.xlsx");
			BufferedWriter writer = new BufferedWriter(f);
			writer.write("S.No\tName\tGame\n");
			writer.write("1\tA\tCricket\n");
			writer.write("2\tB\tTennis\n");
			writer.write("3\tC\tTT\n");
			writer.write("4\tD\tGolf\n");
			writer.close();

			FileReader file = new FileReader("MyCode.xlsx");
			BufferedReader reader = new BufferedReader(file);
			String line = null;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}