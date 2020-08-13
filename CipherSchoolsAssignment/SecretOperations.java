package CipherSchoolsAssignment;
import java.util.*;
class secret{
	 public String Asia(String s){
	        char[] charArray = s.toCharArray();
	        for(int i = 0 ; i< charArray.length ; i ++){
	            char currentChar = charArray[i];

	            // To check if the character is an English alphabet
	            if((currentChar>='a' && currentChar<='z') || (currentChar>='A' && currentChar<='Z') )
	            charArray[i] = (char)((int)charArray[i]+2);
	            else
	                return "Invalid message";
	        }
	        return new String(charArray);
	    }
	    public String Dubai(String s){
	        return new StringBuilder(s).reverse().toString();
	    }
	    public String UnitedStates(String s){
	        LinkedList<String> encParts = new LinkedList<>();
	        for(int i = 0 ; i< s.length() ; i++){
	            encParts.add(""+((int)s.charAt(i)));
	        }
	        return String.join(".",encParts);
	    }
}
public class SecretOperations extends secret {
	 public String encoder(String string , int operation){
	        switch (operation){
	            case 0:
	                return Asia(string);
	            case 1:
	                return UnitedStates(string);
	            case 2:
	                return Dubai(string);
	            default:
	                return "Invalid Locale";
	        }
	        }
	        public static void main(String[] args) {
	            Scanner scan = new Scanner(System.in);
	            SecretOperations encode = new SecretOperations();
	            int q = scan.nextInt();
	            String[] messages = new String[q];
	            for(int i = 0 ; i < q ; i++){
	                messages[i] = scan.next();
	            }


	            LinkedList<String> encryptedResult = new LinkedList<>();
	            for(int i = 0; i < q ; i++){
	                int operation = scan.nextInt();
	                encryptedResult.add(encode.encoder(messages[i],operation));
	            }
	            encryptedResult.stream().forEach(e->{
	                System.out.println(e);
	            });
	        }

}
