package rekursion;
import java.util.*;
public class Permutacionet {
	public static void main(String[] args) {
		for(String s : permutations("eni")) {
			System.out.println(s);
		}
	}
//MERR GJITHE PERMUTACIONET E FJALES
	private static ArrayList<String> permutations(String word) {
		
		ArrayList<String> result = new ArrayList<>();
		
		//Stringu bosh ka vetem nje permutacion-veten
		if(word.length() == 0) {
			result.add(word);
			return result;
		} else {
			//Kalojme te cdo pozicion karakteri. Mqs na duhet pozicioni nuk perdorim ciklin for each, por for
			for(int i=0; i<word.length(); i++) {
				//Krijoj nje string me te vogel duke hequr karakterin e i-te
				String shorter = word.substring(0,i) + word.substring(i+1);
				
				//Gjeneroj te gjithe permutacionet e fjales se thjeshtuar
				ArrayList<String> shorterPermutations = permutations(shorter);
				
				//Shtoj karakterin e hequr ne fillim te cdo permutacioni te fjales se thjeshtuar (ne menyre qe mos te kete perseritje)
				for(String s : shorterPermutations) {
					result.add(word.charAt(i) + s);
				}
			}
			return result;//kthejme gjithe permutacionet
		}
	}
}
