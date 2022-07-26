public class baralho {

	public static void main(String Args[]) {
		String[] nipes = { "copas", "ouros", "espadas", "paus" };
		String[] face = { "az", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "dama", "valete", "rei" };

		System.out.println("vamos sortear uma carta");
		String nipe = nipes[(int) (Math.random() * 3)];
		String faces = face[(int) (Math.random() * face.length)];
		System.out.println("a carta foi " + faces + " de " + nipe);

	}
}
