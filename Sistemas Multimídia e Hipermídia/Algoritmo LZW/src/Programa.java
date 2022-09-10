import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {
		ArrayList lista = new ArrayList<>();

		String palavra = "wabbawabba";
		String s = "";
		String c = "";
		Map<Integer, String> dicionario = new HashMap<Integer, String>();
		int contador = 0;

		for (int i = 0; i < palavra.length(); i++) {

			c = String.valueOf(palavra.charAt(i));
			if (!dicionario.containsValue(c)) {
				dicionario.put(contador, c);
				contador++;
			}
		}
		
		for(int i = 0; i<palavra.length(); i++) {
			c = String.valueOf(palavra.charAt(i));
			if(dicionario.containsValue(s + c)) {
				s = s + c;
			}
			else {
				s+=c;
				dicionario.put(contador, s);
				s=c;
				contador++;
			}
			System.out.println(dicionario);
		}

//			c =  String.valueOf(palavra.charAt(i));
//			if(!lista.contains(c)) {
//			lista.add(palavra.charAt(i));
//			}
//			else {
//				
//			}
	}

}
