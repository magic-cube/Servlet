package Demo;

import java.io.IOException;
import java.io.InputStream;

public class IOUtils {
	/*
	 * 接收一个输入流,返回一个字节数组
	 */
	public static byte[] toByteArray(InputStream is){
		/*
		 * 此处1024为1k,之前由于数组给的太小,而图片本身较大
		 * 导致图片不能显示出来
		 * is.read(bytes),将输入流中的东西读入这个字节数组
		 */
		byte [] bytes=new byte[65536];
		
		try {
			while((is.read(bytes)!=-1)){
				
			}
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
		return bytes;
	}
}
