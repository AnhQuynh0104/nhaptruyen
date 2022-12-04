package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.DautruyenDAO;
import dao.HoadonnhapDAO;
import dao.NhacungcapDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.HoadonDautruyen025;
import model.Hoadonnhap025;
import model.Nhacungcap025;


/**
 * Servlet implementation class HoadonnhapServlet
 */

public class HoadonnhapServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	NhacungcapDAO nccDao = new NhacungcapDAO();
	DautruyenDAO truyenDao = new DautruyenDAO();
	HoadonnhapDAO hoadonDao = new HoadonnhapDAO();

    /**
     * Default constructor. 
     */
    public HoadonnhapServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		luuNhacungcap(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String dongia = request.getParameter("dongia");
		String soluong = request.getParameter("soluong");
		String truyen_id = (String) request.getAttribute("truyen_id");
		String ncc_id = (String) request.getAttribute("ncc_id");
		System.out.println("dongia " + dongia + " soluong " + soluong + " truyen_id " + truyen_id + " ncc_id " + ncc_id);
		List<HoadonDautruyen025> list = new ArrayList<>();
		HoadonDautruyen025 x = new HoadonDautruyen025(new DautruyenDAO().getDautruyen025byId(Integer.parseInt(truyen_id)),
				Double.parseDouble(dongia), Integer.parseInt(soluong));
		list.add(x);
		Nhacungcap025 ncc = new NhacungcapDAO().getNhacungcap025byId(Integer.parseInt(ncc_id));
		Hoadonnhap025 hd = new Hoadonnhap025(ncc, list, Double.parseDouble(dongia)*Double.parseDouble(soluong));
		request.setAttribute("hoadonnhap", hd);
	}
	
	protected void luuNhacungcap(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ncc_id = request.getParameter("ncc_id"); 
		Nhacungcap025 nccSelected = nccDao.getNhacungcap025byId(Integer.parseInt(ncc_id));
		
		request.setAttribute("nccSelected", nccSelected);	
		request.getRequestDispatcher("gdHoadonnhap.jsp").forward(request, response);			
	}

}
