package maps;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
    private Map<String, String> morseMap = new HashMap<>();
	// build a map for the morse code
//    {
//        morseMap.put(".-", "A");
//        morseMap.put("-...", "B");
//        morseMap.put("-.-.", "C");
//        morseMap.put("-..", "D");
//        morseMap.put(".", "E");
//        morseMap.put("..-.", "F");
//        morseMap.put("--.", "G");
//        morseMap.put("....", "H");
//        morseMap.put("..", "I");
//        morseMap.put(".---", "J");
//        morseMap.put("-.-", "K");
//        morseMap.put(".-..", "L");
//        morseMap.put("--", "M");
//        morseMap.put("-.", "N");
//        morseMap.put("---", "O");
//        morseMap.put(".--.", "P");
//        morseMap.put("--.-", "Q");
//        morseMap.put(".-.", "R");
//        morseMap.put("...", "S");
//        morseMap.put("-", "T");
//        morseMap.put("..-", "U");
//        morseMap.put("...-", "V");
//        morseMap.put(".--", "W");
//        morseMap.put("-..-", "X");
//        morseMap.put("-.--", "Y");
//        morseMap.put("--..", "Z");
//		morseMap.put("/", " ");
//    }

	// could have used a loop
	String[] letters = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z".split(",");
	String[] morseCode = ".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--..".split(",");
// when you have code in a class it needs to be in curly brackets
	{
		for (int i = 0; i < 26;i++){
			morseMap.put(morseCode[i],letters[i]);

	}
		morseMap.put("/"," ");
	}

    public String translate(String s) {
		String[] morseArray = s.split(" ");
		String output = "";
		for (String letter : morseArray){
			output += morseMap.get(letter);
		}
return output;

    }
}
