package commons;

import java.util.UUID;
//uuid工具类
public class CommonUtils {
	
	//返回一个随机的,不会重复的32位,十六进制字符串
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-", "").toUpperCase();
	}
}
