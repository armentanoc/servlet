package operacoes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Operacoes")

public class Operacoes extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws 
	ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.append( "<!DOCTYPE html><HTML><BODY>" );
		
		try {
			
			String str_numero1 = request.getParameter("numero1");
			String str_numero2 = request.getParameter("numero2");
			double numero1, numero2;
			
			if(str_numero1 != "" && str_numero2 != "") {
				
				try {
					numero1 = Double.parseDouble(str_numero1);
					numero2 = Double.parseDouble(str_numero2);
					
					double divisao = numero1/numero2;
					double multiplicacao = numero1 * numero2;
					double soma = numero1+numero2;
					double subtracao = numero1-numero2;
					
					writer.append( "<H1>Divisão ("+numero1+"/"+numero2+"): "+divisao+"</H1>" );
					writer.append( "<H1>Multiplicação ("+numero1+"*"+numero2+"): "+multiplicacao+"</H1>" );
					writer.append( "<H1>Soma ("+numero1+"+"+numero2+"): "+soma+"</H1>" );
					writer.append( "<H1>Subtração ("+numero1+"-"+numero2+"): "+subtracao+"</H1>" );
				} catch (Exception e) {
					writer.append(e.getLocalizedMessage());
				}
				
			} else {
				writer.append("Erro! Um ou mais valores nulos informados.");
			}
			writer.append( "</BODY></HTML>" );

		} catch (Exception e) {
			response.getWriter().append(e.getLocalizedMessage());
		}
	}
}
