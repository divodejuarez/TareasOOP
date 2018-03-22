
public class CeilingCommands implements Command{

	CeilingFan cf;
	
	public CeilingCommands(CeilingFan cf) {
		this.cf = cf;
	}
	
	@Override
	public void execute() {
		switch(cf.state) {
		case 0:
			cf.slow();
			//cf.state++;
			break;
		case 1:
			cf.medium();
			//cf.state++;
			break;
		case 2:
			cf.high();
			//cf.state++;
			break;
		default:
			System.out.println("Fan at highest speed");
			break;
		}
	}

	@Override
	public void undo() {
		switch(cf.state) {
		case 3:
			cf.medium();
			//cf.state--;
			break;
		case 2:
			cf.slow();
			//cf.state--;
			break;
		case 1:
			cf.off();
			//cf.state--;
			break;
		default:
			System.out.println("Fan is already off");
			break;
		}
	}

}
