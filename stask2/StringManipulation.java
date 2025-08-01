package stask2;

public class StringManipulation {

	public static void main(String[] args) {
		
        String original = "Hello";
        String modified = original.concat(" World");

        System.out.println("Original String: " + original);   
        System.out.println("Modified String: " + modified);   

        String str = "  Java Programming  ";

        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        System.out.println("Uppercase: " + trimmed.toUpperCase());

        System.out.println("Lowercase: " + trimmed.toLowerCase());

        System.out.println("Substring (5-16): " + trimmed.substring(5, 16));

        System.out.println("Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));

        String[] words = trimmed.split(" ");
        System.out.println("Words in string:");
        for (String word : words) {
            System.out.println(word);
        }

       
        System.out.println("Character at index 3: " + trimmed.charAt(3));
	}

}
