import java.io.*;
public class Decryptor {
	public static void main(String args[]) throws Exception {
		BufferedReader inFromKeyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the ciphertext message:");
		String sentence = inFromKeyboard.readLine();
		System.out.println("The plaintext message is : '" + Decrypt(sentence) + "'") ;
		
	} 
	static String Decrypt(String m) throws Exception{
		String sentence = m.toLowerCase(),fm="";
		int len = sentence.length(),cypher=0,c;
		byte ch = 0;
		for(int i = 0; i<len;i++) {
			FileInputStream f = new FileInputStream("C:\Users\\Excallibure\Desktop\Information Security \Official project\src\Decryptedkey1.txt");
			cypher++;
			if(cypher == 5)
				cypher=1;
			if(cypher==1 || cypher ==4) {
				f = new FileInputStream("C:\Users\\Excallibure\Desktop\Information Security \Official project\src\Decryptedkey1.txt");}
			if(cypher==2 || cypher ==3) {
				f = new FileInputStream("C:\Users\\Excallibure\Desktop\Information Security \Official project\src\Decryptedkey2.txt");}
			c=sentence.charAt(i)-'a';
			if(c<=25 && c>=0){
				for(int j=0;j<=c;j++) {
					ch=(byte)f.read();
				}
				fm = fm + ((char)ch);
			}
			else
				fm = fm + sentence.charAt(i);
			}
		return fm;
	}

}
