
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/demo.php")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DemoServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/demo/form.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String fullname = request.getParameter("fullname");
//		String country = request.getParameter("cboCountry");
//		String gender = request.getParameter("rdoGender");
//		String single = request.getParameter("chkSingle");
//		String[] skill = request.getParameterValues("englishSkill");
//		
//		String message = country + gender + single + "\n";
//		for (String x : skill) {
//			message += x;
//		}
		SimpleBean bean = new SimpleBean();
		try {
			BeanUtils.populate(bean,request.getParameterMap() );
			System.out.println(bean.getFullname());
			System.out.println(bean.getCountry());
			System.out.println(bean.getEnglishSkill());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Enumeration<String> names = request.getParameterNames();
//		while (names.hasMoreElements()) {
//			String name = names.nextElement();
//			String value = request.getParameter(name);
//			System.out.println(name + "+" + value);
//		}
//		request.setAttribute("message", message);
		request.getRequestDispatcher("/views/demo/result.jsp").forward(request, response);
	}

}
