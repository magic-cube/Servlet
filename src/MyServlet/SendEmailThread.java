package MyServlet;

public class SendEmailThread extends Thread{
	
	@Override
	public void run() {
		int i=0;
		
		try {
			//每休眠一分钟,就去扫描那张存放邮件信息的表,看哪封邮件需要发送
			Thread.sleep(60*1000);
			System.out.println("发送第"+(++i)+"封邮件 ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
