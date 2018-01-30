import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidacionFecha implements IValidacion{

	@Override
	public boolean comprobar(String s) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    try {
	      dateFormat.parse(s.trim());
	    } catch (ParseException pe) {
	      return false;
	    }
	    return true;
	}

}