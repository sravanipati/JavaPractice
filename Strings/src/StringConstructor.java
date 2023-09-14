
public class StringConstructor {
	public static void main(String[] args) {
		int alphabet_len =26;
		char[] alphabet = new char[alphabet_len];
		int[] integers = new int[alphabet_len];
		byte[] bytes = new byte[alphabet_len];
		int i=0;
		
		for(char c ='a';c<='z';c++,i++) {
			alphabet[i]=c;
			integers[i]=(int)c;
			bytes[i]=(byte)c;
		}
		String charString = new String(alphabet);
		System.out.println("charString = "+charString);
		
		String byteString = new String(bytes);
		System.out.println("bytesString = "+byteString);
		
		int offset=0;
		String intString = new String(integers,offset,alphabet_len);
		System.out.println("intString = "+intString);
		
		int offset1=1;
		String charString2 = new String(alphabet,offset1,alphabet_len-offset1);
		System.out.println("charString2 = "+charString2);
		
		int offset2=5;
		int length=5;
		String intString2 = new String(integers,offset2,length);
		System.out.println("intString2 = "+intString2);
		
		offset=2;
		length=9;
		String byteString2 = new String(bytes,offset,length,java.nio.charset.StandardCharsets.ISO_8859_1);
		System.out.println("bytesString2 = "+byteString2);
		
	}

}
