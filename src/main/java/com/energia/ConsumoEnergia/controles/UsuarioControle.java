package com.energia.ConsumoEnergia.controles;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.energia.ConsumoEnergia.entities.Usuario;
import com.energia.ConsumoEnergia.repositorio.usuarioRepositorio;

@RestController
@RequestMapping("/api")
public class UsuarioControle {
	
	//acoes
	@Autowired
	private usuarioRepositorio acoes;

	// Cadastro
	@RequestMapping(value="/cadastro", method=RequestMethod.POST)
	public @ResponseBody Usuario cadastro(@RequestBody Usuario usuario) {
		return acoes.save(usuario);
	}
	// Cadastro
		@RequestMapping(value="/cadastrar", method=RequestMethod.GET)
		public @ResponseBody String cadastro() {
			
			
			return "<!DOCTYPE html>\r\n"
					+ "<html lang=\"pt-br\">\r\n"
					+ "<head>\r\n"
					+ "    <meta charset=\"UTF-8\">\r\n"
					+ "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
					+ "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx\" crossorigin=\"anonymous\">\r\n"
					+ "    <link rel=\"stylesheet\" href=\"cz.css\">\r\n"
					+ "    <style type=\"text/css\">\r\n"
					+ "	\r\n"
					+ "* {\r\n"
					+ "  \r\n"
					+ "  font-family: 'Roboto', sans-serif;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "body {\r\n"
					+ "  background-image: url(127447954.jpg);\r\n"
					+ "  background-repeat: no-repeat;\r\n"
					+ "  background-size: cover;\r\n"
					+ "  background-attachment: fixed;\r\n"
					+ "  \r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".borda {\r\n"
					+ "  display: flex;\r\n"
					+ "  justify-content: center;\r\n"
					+ "  width: 100%;\r\n"
					+ "  margin-top: 100px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ ".dentro {\r\n"
					+ "  background-color: #ffffff80;\r\n"
					+ "  padding: 30px;\r\n"
					+ "  border-radius: 4%;\r\n"
					+ "  box-shadow: 3px 4px 5px #00000060;\r\n"
					+ "  width: 400px;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "h1{\r\n"
					+ "  text-align: center;\r\n"
					+ "  margin-bottom: 20px;\r\n"
					+ "  color: BLACK;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "a{\r\n"
					+ "  text-decoration: none;\r\n"
					+ "  background-color: #ffffff80;\r\n"
					+ "  border-color: BLACK;\r\n"
					+ "  color: BLACK;\r\n"
					+ "  padding: 7px;\r\n"
					+ "  font-weight: bold;\r\n"
					+ "  font-size: 12pt;\r\n"
					+ "  margin-top: 20px;\r\n"
					+ "  border-radius: 4px;\r\n"
					+ "  cursor: pointer;\r\n"
					+ "  outline: none;\r\n"
					+ "  transition: all .4s ease-out;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "a:hover{\r\n"
					+ "  background-color: BLACK;\r\n"
					+ "  color: #fff;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "input{\r\n"
					+ "  background-color: transparent;\r\n"
					+ "  border: 0;\r\n"
					+ "  border-bottom: 1px solid black;\r\n"
					+ "  background-color: transparent;\r\n"
					+ "  outline: none;\r\n"
					+ "  width: 100%;\r\n"
					+ "  padding: 5px 5px;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  input:focus{\r\n"
					+ "  background-color: transparent;\r\n"
					+ "  box-shadow: 0 0 0 0;\r\n"
					+ "  border-top:none; \r\n"
					+ "  border-left:none;\r\n"
					+ "  border-right:none;\r\n"
					+ "  outline: 0;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .form-grup{\r\n"
					+ "    position:relative;\r\n"
					+ "    padding-top:13px;\r\n"
					+ "    margin-top: 5%;\r\n"
					+ "    margin-bottom: 5%;\r\n"
					+ "    \r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ "  .form-grup label{\r\n"
					+ "    position:absolute;\r\n"
					+ "    left:5px;\r\n"
					+ "    opacity:0.5;\r\n"
					+ "    pointer-events: none;\r\n"
					+ "    transition: 0.5s;\r\n"
					+ "    \r\n"
					+ " }\r\n"
					+ "\r\n"
					+ " .form-grup input:focus + label,\r\n"
					+ " .form-grup input:hover + label,\r\n"
					+ " .form-grup input:valid + label\r\n"
					+ " {\r\n"
					+ "    font-size: small;\r\n"
					+ "    transform: translateY(-20px);\r\n"
					+ "    opacity:1;\r\n"
					+ "  }\r\n"
					+ "\r\n"
					+ ".justify-center{\r\n"
					+ "  display: flex;\r\n"
					+ "  justify-content: center;\r\n"
					+ "}\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "	</style>\r\n"
					+ "</head>\r\n"
					+ "    <body>\r\n"
					+ "    \r\n"
					+ "    <form  class=\"kwh\" action=\"login\">\r\n"
					+ "        <div class='borda'>\r\n"
					+ "          <div class='dentro'>\r\n"
					+ "\r\n"
					+ "            <h1> Cadastrar </h1>\r\n"
					+ "            \r\n"
					+ "                    <div class=\"form-grup\">\r\n"
					+ "                       <input type=\"text\" id=\"email\" name=\"email\" required>\r\n"
					+ "                       <label id=\"labelNome\" for=\"\">Email</label>\r\n"
					+ "                   \r\n"
					+ "                    </div>\r\n"
					+ "                    \r\n"
					+ "                    <div class=\"form-grup\">\r\n"
					+ "                       <input type=\"password\" id=\"senha\" name=\"senha\" required>\r\n"
					+ "                       <label id=\"labelSenha\" for=\"senha\">Senha</label>\r\n"
					+ "                     \r\n"
					+ "                    </div>\r\n"
					+ "                    \r\n"
					+ "                    <div class=\"form-grup\">\r\n"
					+ "                       <input type=\"password\" id=\"confirmSenha\"  required>\r\n"
					+ "                       <label id=\"labelConfirmSenha\" for=\"confirmSenha\">Confirmar Senha</label>\r\n"
					+ "\r\n"
					+ "                    </div>\r\n"
					+ "                    \r\n"
					+ "                    <div class='justify-center'>\r\n"
					+ "                       <a class=\"dista\" type=\"submit\" > <button> Cadastrar </button> </a>\r\n"
					+ "                    </div>\r\n"
					+ "        \r\n"
					+ "            \r\n"
					+ "          </div>\r\n"
					+ "          </div>\r\n"
					+ "          </form>\r\n"
					+ "        \r\n"
					+ "</body>\r\n"
					+ "</html>";
			
			
		}
	
	// Login
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public @ResponseBody String login(HttpServletRequest request, HttpServletResponse response) {
		Usuario usuario = new Usuario();
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		usuario.setEmail(email);
		usuario.setSenha(senha);
		acoes.save(usuario);
		return "oi";
	}
	
	// VerUsuarios
	
}
