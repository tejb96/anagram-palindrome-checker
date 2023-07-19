import java.util.Scanner;
import java.util.Arrays;
public class Words {
	
	public void anagramChecker(String[] wordArray) {
		String[] result = new String[wordArray.length];
		
		for(int i=0;i<wordArray.length;i++) {
			result[i]="No";
		}
		
		for(int j=0;j<wordArray.length;j++) {
			for(int i=0; i<wordArray.length;i++) {
//				System.out.println(wordArray[j]+"  j");
//				System.out.println(wordArray[i]);
				if(wordArray[j].length()==wordArray[i].length()&&j!=i) {
					char[] wordOne=wordArray[j].toLowerCase().toCharArray();
					char[] wordTwo=wordArray[i].toLowerCase().toCharArray();
					Arrays.sort(wordOne);
					Arrays.sort(wordTwo);
					if(Arrays.equals(wordOne, wordTwo)) {
						result[j]= "Yes";
				}
			}
		  }
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(wordArray[i]+" - "+result[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {
			    "Kayak",    "Rotator",  "Post",     "Noon",     "Stop",
			    "Elbow",    "Level",    "Spot",     "Mom",      "Below"
			};
		
		Words word=new Words();
		word.anagramChecker(words);
	}

}
