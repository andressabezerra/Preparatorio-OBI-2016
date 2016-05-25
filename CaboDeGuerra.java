import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaboDeGuerra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtParticipantes;
		String resultado, participante;

		List participantes = new ArrayList();
		List participantesASCII = new ArrayList();

		List saida = new ArrayList();

		qtParticipantes = sc.nextInt();

		while (qtParticipantes > 0) {

			for (int i = 0; i < qtParticipantes; i++) {
				participante = sc.next();
				participantes.add(participante);
				participantesASCII.add(converteParaAscii(participante));
			}

			System.out.println(participantesASCII);

			if (participantesASCII.size() == 1) {
				saida.add("Impossibilidade de empate.");
			} else {
				saida.add(formaEquipes(participantesASCII, participantes));
			}

			participantes.clear();
			participantesASCII.clear();
			qtParticipantes = sc.nextInt();
		}

		System.out.println(saida);
	}

	private static int converteParaAscii(String string) {

		int ascii = 0;
		for (int i = 0; i < string.length(); i++) {
			ascii = ascii + (int) string.charAt(i);
		}
		return ascii;
	}

	private static int calculaForcaEquipe(List equipe) {

		int forca = 0;
		for (int i = 0; i < equipe.size(); i++) {
			forca = forca + ((int) equipe.get(i) * (i + 1));
		}
		return forca;
	}

	private static String formaEquipes(List participantesASCII, List participantes) {

		int meio = (int) Math.floor(participantesASCII.size() / 2);
		
		System.out.println(calculaForcaEquipe(participantesASCII.subList(0, meio + 1)));
		System.out.println(calculaForcaEquipe(
				participantesASCII.subList(meio, participantesASCII.size())));
		
		if (calculaForcaEquipe(participantesASCII.subList(0, meio + 1)) == calculaForcaEquipe(
				participantesASCII.subList(meio, participantesASCII.size()))) {
			
			return (String) participantes.get(meio);

		} else if (calculaForcaEquipe(participantesASCII.subList(0, meio + 1)) > calculaForcaEquipe(
				participantesASCII.subList(meio, participantesASCII.size()))) {
			while (meio > 0) {
				meio--;
				if (calculaForcaEquipe(participantesASCII.subList(0, meio + 1)) == calculaForcaEquipe(
						participantesASCII.subList(meio, participantesASCII.size()))) {
					return (String) participantes.get(meio);

				} 
			}

		} else{
			while (meio < participantesASCII.size()-1) {
				meio++;
				if (calculaForcaEquipe(participantesASCII.subList(0, meio + 1)) == calculaForcaEquipe(
						participantesASCII.subList(meio, participantesASCII.size()))) {
					return (String) participantes.get(meio);

				} 
			}
		}
		
		System.out.println((String) participantes.get(meio));

		return "Impossibilidade de empate.";
	}
}
