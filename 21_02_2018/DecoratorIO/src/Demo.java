import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
	public static void main(String[] args) throws IOException{
		
		InputStream in = new LowerInputStream(new BufferedInputStream(new FileInputStream("C://Users//roris//Documents//test.txt"))); 
		
		int i;
		char c;
		
		while((i = in.read()) != -1) {
			c = (char)i;
			System.out.print(c);
		}
		
	}
}