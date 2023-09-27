package idade;

import java.io.PrintWriter;
import java.time.Year;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcularIdade")

public class CalcularIdade extends HttpServlet {

	private static final long serialVersionUID = 1;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			PrintWriter writer = response.getWriter();
			writer.append( "<!DOCTYPE html><HTML><BODY>" );
			
			String str_ano = request.getParameter("ano");
			String aniversario = request.getParameter("aniversario");
			
			int ano = Integer.parseInt(str_ano);
			int ano_atual = Year.now().getValue();
			int idade = ano_atual - ano;
			
			if(aniversario.equals("não")) {
				idade -= 1;
			} 
			
			writer.append( "<H1>Ano de nascimento: "+ano);
			writer.append( "<H1>Aniversário: "+aniversario);	
			writer.append( "<H1>Idade atual: "+idade);	
			writer.append( "</BODY></HTML>" );

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
