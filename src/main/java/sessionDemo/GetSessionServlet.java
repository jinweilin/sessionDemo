package sessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.ObjectUtils;

public class GetSessionServlet extends HttpServlet {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String demo = ObjectUtils.toString(session.getAttribute("demo"));
		demo = "".equals(demo) ? "no value" : demo;
		System.out.println("您的SessionValue is :" + demo);
		out.println(
				"<html><meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"><body><h1>Get Session Session id is :"
						+ session.getId() + " Session is :</h1><p>" + demo + "</p></body></html>");
	}
}
