package controller;

import java.io.IOException;

import dao.TaikhoanDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Taikhoan025;




/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @throws jakarta.servlet.ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			String tendangnhap = request.getParameter("tendangnhap");
			String matkhau = request.getParameter("matkhau");
			TaikhoanDAO tkDao = new TaikhoanDAO();
			Taikhoan025 tk = tkDao.kiemtraDangnhap(tendangnhap, matkhau);
			if(tk == null) {
				response.sendRedirect("gdLogin.jsp");
			} else {
				response.sendRedirect("gdChinhNhanvien.jsp");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
