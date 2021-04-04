import java.io.*;
import java.util.*;

public class CommandIO {
	public static void main(String[] args) {
		try {		
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number of entries");
			int noOfLines = sc.nextInt();
			FileWriter f = new FileWriter("Names.xlsx");
			BufferedWriter writer = new BufferedWriter(f);
			writer.write("SNo\tName\tGame\n");			
			for(int i=0; i < noOfLines; i++) {
				System.out.print("Enter the serial number:");
				int SNo = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter the name:");
				String Name = sc.nextLine();
				System.out.print("Enter the game:");
				String Game = sc.nextLine();
				writer.write(SNo+"\t"+Name+"\t"+Game+"\n");
				writer.flush();
			}
			FileReader file = new FileReader("Names.xlsx");
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