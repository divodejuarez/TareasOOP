
public class MotrizMovimiento implements IMotriz{

	@Override
	public String motrizManos() {
		return "Muevo las manos";
	}

	@Override
	public String motrizPies() {
		return "Muevo los pies";
	}

	@Override
	public String motrizNulo() {
		return null;
	}

}
