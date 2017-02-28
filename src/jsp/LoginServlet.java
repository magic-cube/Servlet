package jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 1.获取表单数据
		 */
		//处理中文数据
		request.setCharacterEncoding("utf-8");
		//获取表单数据
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		//2.校验用户名和密码是否正确
		if("hc".equalsIgnoreCase(username)){//成功
			/*
			 * 把用户名保存到cookie中,发送给客户端浏览器,
			 * 当再次打开login.jsp时,login.jsp会读取request中的cookie,将其显示到户名文本框中
			 * 方便下次浏览器访问时携带
			 */
			Cookie cookie=new Cookie("username",username);
			cookie.setMaxAge(60*60*24);//设置命长为一天
			response.addCookie(cookie);//保存cookie
			
			
			/*
			 * 3.如果成功,
			 * 		保存用户信息到session中
			 * 		重定向到succ1.jsp
			 */
			HttpSession session=request.getSession();//获取session
			session.setAttribute("username", username);//向session域中保存用户名
			//重定向
			response.sendRedirect("/Servlet/session2/succ1.jsp");
			
		}else{//登录失败
			/*
			 * 4.如果失败,
			 * 		保存错误信息至request中
			 * 		转发至login.jsp(一个请求)
			 */
			request.setAttribute("msg", "username or password is wrong");
			//得到一个转发器,请求转发
			RequestDispatcher rd=request.getRequestDispatcher("/session2/login.jsp");
			rd.forward(request, response);
		}
	}

}



