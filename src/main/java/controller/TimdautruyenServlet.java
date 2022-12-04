package controller;

import java.io.IOException;
import java.util.ArrayList;

import dao.DautruyenDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dautruyen025;
import model.Nhacungcap025;

/**
 * Servlet implementation class TimdautruyenServlet
 */
public class TimdautruyenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DautruyenDAO truyenDAO = new DautruyenDAO();
	

    /**
     * Default constructor. 
     */
    public TimdautruyenServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String ten = request.getParameter("ten");
		System.out.println("ten" + ten);
		ArrayList<Dautruyen025> listTruyen = truyenDAO.getDautruyen025(ten);
		request.setAttribute("listTruyen", listTruyen);
		request.getRequestDispatcher("gdTimDautruyen.jsp").forward(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
