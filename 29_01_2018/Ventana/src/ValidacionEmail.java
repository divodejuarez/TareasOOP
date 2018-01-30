import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionEmail implements IValidacion{
	
	private final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + 
			"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	private final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	@Override
	public boolean comprobar(String s)
	{
		if (s == null) 
			return false;        
		 
		Matcher matcher = EMAIL_PATTERN.matcher(s);
		return matcher.matches();
	}

}
