package Demo;

import java.io.IOException;
import java.io.InputStream;

public class IOUtils {
	/*
	 * ����һ��������,����һ���ֽ�����
	 */
	public static byte[] toByteArray(InputStream is){
		/*
		 * �˴�1024Ϊ1k,֮ǰ�����������̫С,��ͼƬ����ϴ�
		 * ����ͼƬ������ʾ����
		 * is.read(bytes),���������еĶ�����������ֽ�����
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
