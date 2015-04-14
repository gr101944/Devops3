package devops.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import devops.util.MiscUtil;
import devops.bank.*;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String jspPage = "/jsp/index.jsp"; 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String amount = (String)request.getParameter("Amount");
		HttpSession session =request.getSession();
		String screenMessage = "";
		boolean error = false;
		try{
			if (null == amount)
				error = true;
			else
			{
				Double.parseDouble(amount); 
			}
		}catch (Exception e)
		{
			error = true;
			screenMessage = "Please enter valid value";
		}
		if (!error)
		{
			BankAccount accnt =  new BankAccount(1000000);
			double balance = accnt.debit(Double.parseDouble(amount));
			screenMessage = "Balance is " + balance;
		}
		request.setAttribute(MiscUtil.sessionScreenMessage, screenMessage);
		
		request.getRequestDispatcher(jspPage).forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
