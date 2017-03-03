package MyServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 模拟处理买票时的并发问题
 */
public class TicketServlet extends HttpServlet {

	//假定初始时有两张票
	int ticket=2;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//servlet只有一个对象,此处锁住this即可
		synchronized(this){
			if(ticket>0){
				System.out.println("你买到票了");
				
				try {
					//模拟网络延时
					Thread.sleep(10*1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				ticket--;
				
			}else{
				System.out.println("你没有买到票");
			}
		}
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

}
