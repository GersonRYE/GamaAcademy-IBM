package ProjetoTime;

public class TimeTeste {

	public static void main(String[] args) {

		Time t = new Time(0,15,23);
		System.out.println(t.exibirHorarioUniversal());
		System.out.println(t.exibirHorarioPadrao());
		
		t.setTime(8, 25);
		System.out.println(t.exibirHorarioUniversal());
		System.out.println(t.exibirHorarioPadrao());
		
		t.setTime(16,14,28);
		System.out.println(t.exibirHorarioUniversal());
		System.out.println(t.exibirHorarioPadrao());
		
		t.setTime(12, 10, 8);
		System.out.println(t.exibirHorarioUniversal());
		System.out.println(t.exibirHorarioPadrao());
		
	}

}
