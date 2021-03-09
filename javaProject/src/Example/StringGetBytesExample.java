package Example;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		String test1 = String .valueOf(10.4);
		String test2 = String.valueOf(10.456);
		String test3 = String.valueOf(true);
		System.out.println((test1));
		System.out.println(test2);
		System.out.println(test3);
		
		
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length :" + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 > STring : "  + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println();
			System.out.println("bytes2.length :" + bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("bytes2 > STring : "  + str2);
			
			byte[] bytes3 = str.getBytes("EUC-KR");
			System.out.println();
			System.out.println("bytes3.length :" + bytes3.length);
			String str3 = new String(bytes3,"EUC-KR");
			System.out.println("bytes3 > STring : "  + str3);
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
