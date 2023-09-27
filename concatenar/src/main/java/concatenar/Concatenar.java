package concatenar;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Concatenar")

public class Concatenar extends HttpServlet {

	private static final long serialVersionUID = 1;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			PrintWriter writer = response.getWriter();
			writer.append( "<!DOCTYPE html><HTML><BODY>" );
			
			String nome = request.getParameter("nome");
			String estado_civil = request.getParameter("estado_civil");
			String faixa_etaria = request.getParameter("faixa_etaria");
			
			String string_concatenada = nome+estado_civil+faixa_etaria;
			
			writer.append( "<H1>Nome: "+nome);
			writer.append( "<H1>Estado civil: "+estado_civil);	
			writer.append( "<H1>Faixa etária: "+faixa_etaria);	
			writer.append( "<H1>String concatenada: "+string_concatenada);	
			writer.append( "</BODY></HTML>" );

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
