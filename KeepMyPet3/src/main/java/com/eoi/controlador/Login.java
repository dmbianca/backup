package com.eoi.controlador;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eoi.modelo.UsuarioDAO;
import com.eoi.modelo.Usuarios;
import com.eoi.modelo.*;
import com.eoi.modelo.CuentaDAO;
/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {
		super();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mail = request.getParameter("UsuMail");
		String pass = request.getParameter("UsuPass");
		
		CuentaDAO Cdao = new CuentaDAO();
		//UsuarioDAO udao = new UsuarioDAO();
		Usuarios usu = null;
		String pageDest = "index.html";

		try {
			usu = Cdao.login(mail, pass);
			if (usu != null) {
				pageDest = "futura pagina del usuario XXXXXXXXXXXXXXXXXXXXXXXXXX CAMBIAR";
				HttpSession sesion = request.getSession();
				sesion.setAttribute("UsuNombre", usu.getUsuNombre());
				sesion.setAttribute("UsuRol", usu.getUsuRol());
			} else {
				String msgerr = "Usuario y Contrase�a incorrectos";
				request.setAttribute("msgerr", msgerr);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher(pageDest);
		rd.forward(request, response);
		
	}

}
