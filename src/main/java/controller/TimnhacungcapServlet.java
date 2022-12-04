package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.NhacungcapDAO;
import jakarta.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Nhacungcap025;



/**
 * Servlet implementation class TimnhacungcapServlet
 */

public class TimnhacungcapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NhacungcapDAO nccDao = new NhacungcapDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TimnhacungcapServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String ten = request.getParameter("ten");
		ArrayList<Nhacungcap025> listNcc = nccDao.getNhacungcap025(ten);
		request.setAttribute("listNcc", listNcc);
		request.getRequestDispatcher("gdTimNhacungcap.jsp").forward(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
