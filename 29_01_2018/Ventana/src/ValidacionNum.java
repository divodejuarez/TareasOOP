
public class ValidacionNum implements IValidacion{
	
	private final String NUM_REGEX = "\\d+";
	
	@Override
	public boolean comprobar(String s) {
		return s.matches(NUM_REGEX);
	}

}
