
public class Parken {

	public static void main(String[] args) {
		System.out.println(parken(true, false, false));
		System.out.println(parken(true, true, false));

	}
	public static String parken(boolean is9_18h, boolean sonn_undFeiertage, boolean anwohnerauswei�_A) {
		if (is9_18h && !sonn_undFeiertage && !anwohnerauswei�_A) {
			return "Parkschein kaufen und Parken";
		}
		
		return "Parken";
	}

}
