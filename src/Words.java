import java.util.Scanner;
import java.util.Arrays;
public class Words {
	public Stacks stacks;
	public Queue q;
	
	public void anagramChecker(String[] wordArray) {
		String[] result = new String[wordArray.length];
		
		for(int i=0;i<wordArray.length;i++) {
			result[i]="No";
		}
		
		for(int j=0;j<wordArray.length;j++) {
			for(int i=0; i<wordArray.length;i++) {

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
	
	
	public void palindromeChecker(String[] wordArray) {
		String[] result=new String[wordArray.length];
		
		for(int i=0;i<wordArray.length;i++) {
			result[i]="Yes";
		}
		
		for(int i=0;i<wordArray.length;i++) {
			char[] word=wordArray[i].toLowerCase().toCharArray();
			stacks=new Stacks(word);
			q=new Queue(word);
			
			for(int j=0;j<word.length;j++) {				
				stacks.push(word[j]);				
				q.enqueue(word[j]);
			}
			
			for(int j=0;j<word.length;j++) {
				if(stacks.pop()!=q.dequeue()) {
					result[i]="No";
				}
			}
		}
		for(int i=0;i<result.length;i++) {
			System.out.println(wordArray[i]+" - "+result[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner reader=new Scanner(System.in);
		
		System.out.print("Enter the number of words: ");
		int numOfWords=reader.nextInt();
		String[] words= new String[numOfWords];
		System.out.println("Enter input words: ");
		for(int i=0;i<numOfWords;i++) {
			words[i]=reader.next();
		}		
		reader.close();
		
		System.out.println('\n'+"The input words are:");
		System.out.println(Arrays.toString(words).replace("[", "").replace("]", " ").replace(",", ""));
		
		Words word=new Words();
		System.out.println('\n'+"The anagram decisions are:");
		word.anagramChecker(words);		
		
		System.out.println('\n'+"The palindrome decisions are:");		
		word.palindromeChecker(words);
	}

}
