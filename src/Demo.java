
public class Demo {

	public static void main(String[] args) {
		
		//MOVIMIENTO COMPLETO
		Persona estudiante = new Estudiante(new MotrizMovimiento());
		
		estudiante.setEdad(32);
		estudiante.setNombre("Roris");
		estudiante.setGenero(true);
		
		System.out.println(estudiante.getNombre());
		System.out.println(estudiante.getEdad());
		System.out.println(estudiante.getGenero());
		
		System.out.println(estudiante.mov.motrizManos());
		System.out.println(estudiante.mov.motrizPies());
		
		
		//HANDICAP - MOV NULO
		Persona handi = new Handicup(new MotrizNula());
		
		handi.setEdad(27);
		handi.setNombre("SHarles");
		handi.setGenero(false);
		
		System.out.println();
		
		System.out.println(handi.getNombre());
		System.out.println(handi.getEdad());
		System.out.println(handi.getGenero());
		
		System.out.println(handi.mov.motrizNulo());

	}

}
