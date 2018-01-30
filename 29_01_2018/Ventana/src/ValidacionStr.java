
public class ValidacionStr implements IValidacion{

	@Override
	public boolean comprobar(String s) {
		char[] chars = s.toCharArray();
		
		for(char c : chars){
			if(!Character.isLetter(c)) {
				return false;
			}
		}
		return true;
	}

}