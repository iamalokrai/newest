package com.cg.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.resume.Resume;

/**
 * Servlet implementation class ResumeServelet
 */
@WebServlet("/ResumeServelet")
public class ResumeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResumeServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**F
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= request.getRequestDispatcher("Resume.jsp");
		rd.forward(request, response);
		Resume resume = new Resume(request.getParameter("fname"),request.getParameter("lname"),request.getParameter("gender"),
				request.getParameter("qualification"),request.getParameter("dob"),request.getParameterValues("hobbies"),
				request.getParameter("address"),request.getParameterValues("skills"),request.getParameter("email"),request.getParameter("website"),request.getParameter("cno"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
