package controller;

import java.io.IOException;
import dao.DautruyenDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dautruyen025;

/**
 * Servlet implementation class DongiaSoluongDAO
 */

public class DongiaSoluongServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DautruyenDAO truyenDao = new DautruyenDAO();

    /**
     * Default constructor. 
     */
    public DongiaSoluongServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		luuDautruyen(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	protected void luuDautruyen(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String truyen_id = request.getParameter("truyen_id"); 
		System.out.println("truyen_id" + truyen_id);
		request.getSession().setAttribute("truyenid", truyen_id);
		Dautruyen025 truyenSelected = truyenDao.getDautruyen025byId(Integer.parseInt(truyen_id));
		request.setAttribute("truyenSelected", truyenSelected);
		System.out.println( "truyenSelected" + truyenSelected);
		request.getRequestDispatcher("gdNhapDongiaSoluong.jsp").forward(request, response);		
	}

}
