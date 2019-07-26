import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileLower_NoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = System.getProperty("user.dir");
		String fileName=filePath+"\\"+args[0];
		
try {
	BufferedReader reader=new BufferedReader(new FileReader(fileName));
	FileWriter writer=new FileWriter(fileName,true);
	System.out.println("fileName location: "+writer);
	String line=null;
	while ((line=reader.readLine())!=null) {
		System.out.println("line "+line);
		String lowerData=line.toLowerCase();
		System.out.println("lower Data " +lowerData);
		writer.write(lowerData);
		
	}
	writer.flush();
	
	
	
	
	
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
