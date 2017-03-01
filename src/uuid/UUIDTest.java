package uuid;

import java.util.UUID;

import org.junit.Test;

import commons.CommonUtils;

public class UUIDTest {
	
	//获取一个随机字符串,不会重复的
	@Test
	public void fun1(){
		UUID uuid=UUID.randomUUID();
		String s=uuid.toString();
		s=s.replace("-", "");
		s=s.toUpperCase();
		
		System.out.println(s);
		System.out.println(CommonUtils.uuid());
	}
	
}
