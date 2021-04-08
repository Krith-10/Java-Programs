import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class DatabaseDemo {
	
	public static void retrieveAll(String url, String uname, String pwd) throws Exception {
	
	//To retrieve all data from the MySQL
		String query = "SELECT * "
				+ "FROM student ";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		String userData = "";
		
		while(rs.next()) {
			userData = rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getFloat(4)+" "+rs.getString(5);
			System.out.println(userData);
		}
		st.close();
		con.close();
	}
	
	public static void insertSingleData(String url, String uname, String pwd) throws Exception {
		
	//Inserting a single line data
		
		String query = "INSERT INTO student VALUES (11, 'Kk', 'K', 8.55, 'Bangalore')";
						
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		Statement st = con.createStatement();
		int rs = st.executeUpdate(query);
		
		System.out.println("Row/Row(s) affected:"+rs);
		
		st.close();
		con.close();
	}
	
	public static void userInput(String url, String uname, String pwd) throws Exception {
	
	//Entering data from the user
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pwd);
		
		PreparedStatement statement = con.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?)");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the number of entries to be done: ");
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the roll no: ");
			int rno = Integer.parseInt(br.readLine());
			
			System.out.println("Enter the last name: ");
			String lname = br.readLine();
			
			System.out.println("Enter the first name: ");
			String fname = br.readLine();
			
			System.out.println("Enter GPA: ");
			float gpa = Float.parseFloat(br.readLine());
			
			System.out.println("Enter city: ");
			String city = br.readLine();
			
			statement.setInt(1,rno);
			statement.setString(2, lname);
			statement.setString(3, fname);
			statement.setFloat(4, gpa);
			statement.setString(5, city);
			
			int updts = statement.executeUpdate();
			System.out.println("No of rows affected: "+updts);
			
			statement.close();
			con.close();
		}
	}
		public static void getMetaData (String url, String uname, String pwd) throws Exception {
		
		//The metadata of the table
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,pwd);
			
			PreparedStatement ps=con.prepareStatement("select * from student");  
			ResultSet rs=ps.executeQuery();  
			ResultSetMetaData rsmd=rs.getMetaData();  
			
			int totalColumn = rsmd.getColumnCount();
			System.out.println("Total number of coulumns in table: "+totalColumn);
			
			for(int i=1;i<=totalColumn;i++) {
				System.out.println("Name of "+i+" column: "+rsmd.getColumnName(i));
				System.out.println("Type of "+i+" column: "+rsmd.getColumnTypeName(i));
			}
			
			ps.close();
			con.close();
		}
	
	public static void main (String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/Persons?characterEncoding=latin1";
		String uname="";	//your user name 
		String pwd="";		//your password
		
		//Select the static method required to perform operation
		DatabaseDemo.getMetaData(url, uname, pwd);
		
	}
}