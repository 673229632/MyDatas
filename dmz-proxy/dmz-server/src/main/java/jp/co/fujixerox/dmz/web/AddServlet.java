package jp.co.fujixerox.dmz.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Document;

import jp.co.fujixerox.dmz.utils.XmlUtils;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String flag = request.getParameter("flag");
		String host = request.getParameter("host");
		String port = request.getParameter("port");
		Document document = XmlUtils.getDocument();
		List allEle = XmlUtils.getData(document);
		if (flag != null && flag != "") {
			if (flag.equals(host)) {
				document = XmlUtils.updateDocument(document, flag, host, port);
				request.setAttribute("message", "修改成功！");
				XmlUtils.writeXml(document);
			} else {
				Boolean result = XmlUtils.compareHost(allEle, host);
				if (!result) {
					document = XmlUtils.updateDocument(document, flag, host, port);
					request.setAttribute("message", "修改成功！");
					XmlUtils.writeXml(document);
				} else {
					request.setAttribute("message", "修改失败！");
				}
			}
		} else {
			Boolean result = XmlUtils.compareHost(allEle, host);
			if (result) {
				request.setAttribute("message", "新增失败！");
			} else {
				document = XmlUtils.addElementByName(document, host, port);
				XmlUtils.writeXml(document);
				request.setAttribute("message", "新增成功！");
			}
		}
		request.getRequestDispatcher("toAdd.jsp").forward(request, response);
	}
}
