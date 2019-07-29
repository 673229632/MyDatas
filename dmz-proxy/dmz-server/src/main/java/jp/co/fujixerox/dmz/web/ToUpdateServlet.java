package jp.co.fujixerox.dmz.web;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;
import org.dom4j.Element;

import jp.co.fujixerox.dmz.utils.XmlUtils;

/**
 * Servlet implementation class ToUpdateServlet
 */
@WebServlet("/ToUpdateServlet")
public class ToUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String host = request.getParameter("host");
		request.getParameter("flag");
		Document document = XmlUtils.getDocument();
		Element root = document.getRootElement();
		Iterator<Object> iterator = root.elementIterator("item");
		while (iterator.hasNext()) {
			Element element = (Element) iterator.next();
			// 根据属性名获取属性值
			if (element.elementText("host").equals(host)) {
				request.setAttribute("host", host);
				String port = element.elementText("port");
				request.setAttribute("port", port);
				break;
			}
		}
		// request.setAttribute("map", map);
		request.getRequestDispatcher("toAdd.jsp").forward(request, response);
	}
}
