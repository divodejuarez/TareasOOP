import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerInputStream extends FilterInputStream{
	
	InputStream in;
	
	protected LowerInputStream(InputStream in) {
		super(in);
		this.in = in;
	}

	@Override
	public int read() throws IOException {
		int character=in.read();
		if(character == -1) {
			return -1;
		}
		else {
			char c = (char)character;
			char b = Character.toLowerCase(c);
			int m = (int)b;
			return m;
		}
	}
	
}
