package org.apache.jsp.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ui018cadastrarposto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/web/head.jsp");
    _jspx_dependants.add("/web/header.jsp");
    _jspx_dependants.add("/web/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("    <!-- Head -->\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Bem-Vindo | DigiMon</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"dist/css/estilo.css\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"dist/imagens/favicon-32x32.png\">\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <script type=\"text/javascript\" src=\"dist/js/novo.js\" defer=\"\"></script>\n");
      out.write("</head>");
      out.write("\r\n");
      out.write("    <!-- fim Head -->\r\n");
      out.write("    <body class=\"insideSystem\">\r\n");
      out.write("        <div id=\"interface\">\r\n");
      out.write("            <!-- begin header -->\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"header\">\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <a href=\"ui005home.jsp\"><img src=\"dist/imagens/logoo.png\" class=\"logo\" id=\"logoo\" alt=\"Logo\"/></a>\r\n");
      out.write("        <ul class=\"menu\" id=\"menu\">\r\n");
      out.write("            <li><a href=\"ui005home.jsp\">Home</a></li>\r\n");
      out.write("            <li><a href=\"#\">Transportador<img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de transportador\"/></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Frete<img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Frete\"/></a>\r\n");
      out.write("                        <!--Criação da class submenu-->\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui006cadastrarfrete\">Cadastrar</a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Veículo <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Veículo\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui008cadastrarveiculo\">Cadastrar</a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Motorista <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Motorista\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"http://www2.projetodigimon.com.br/Home/ui020cadastrarmotorista\">Cadastrar</a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"#\">ANTT / DNIT <img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Órgão\"/></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Posto de Pesagem<img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Posto\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"ui018cadastrarposto.jsp\">Cadastrar</a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Rodovia <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Rodovia\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"ui014cadastrarrodovia.jsp\">Cadastrar </a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Transportador <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Transportador\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"#\">TAC<img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Câmera\"/></a>\r\n");
      out.write("                                <ul class=\"submenu\">\r\n");
      out.write("                                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui010cadastrartransportador\">Cadastrar</a></li>\r\n");
      out.write("                                    <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"#\">TETI<img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Câmera\"/></a>\r\n");
      out.write("                                <ul class=\"submenu\">\r\n");
      out.write("                                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui010cadastrartransportador\">Cadastrar </a></li>\r\n");
      out.write("                                    <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"#\">ETC<img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Câmera\"/></a>\r\n");
      out.write("                                <ul class=\"submenu\">\r\n");
      out.write("                                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui010cadastrartransportador\">Cadastrar </a></li>\r\n");
      out.write("                                    <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Câmera <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Câmera\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"ui026cadastrarcamera.jsp\">Cadastrar </a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Balança <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Balança\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"ui016cadastrarbalanca.jsp\">Cadastrar</a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"#\">Posto de Pesagem <img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Pesagem\"/></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"#\">Pesagem <img src=\"dist/imagens/setad.png\" class=\"setad\" alt=\"Opções de Pesagem\"/></a>\r\n");
      out.write("                        <ul class=\"submenu\">\r\n");
      out.write("                            <li><a href=\"ui024cadastrarpesagem.jsp\">Registrar </a></li>\r\n");
      out.write("                            <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li> \r\n");
      out.write("            <li><a href=\"#\">Relatório <img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Relatório\"/></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui030relatorio\">Emitir</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li><a href=\"#\">Usuário<img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Usuário\"/></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui012cadastrarusuario\">Cadastrar</a></li>\r\n");
      out.write("                    <li><a href=\"ui029pesquisa.jsp\">Consultar</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </li> \r\n");
      out.write("            <li><a href=\"#\">Ajuda<img src=\"dist/imagens/seta.png\" class=\"seta\" alt=\"Opções de Ajuda\"/></a>\r\n");
      out.write("                <ul>\r\n");
      out.write("                   <li><a href=\"http://www2.projetodigimon.com.br/Home/ui034faleconosco\">Fale Conosco</a></li>\r\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui033faq\">FAQ</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("            <!--Aqui tem uma ul diferente-->\r\n");
      out.write("            <li><img src=\"dist/imagens/iconeMenu.png\" class=\"iconeMenu\" alt=\"Menu do Usuário\"/>\r\n");
      out.write("                <ul id=\"last\">\r\n");
      out.write("                    <li><a href=\"http://www2.projetodigimon.com.br/Home/ui032minhaconta\">Minha Conta</a></li>\r\n");
      out.write("                    <li><a href=\"#\">Sair</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <!--aqui termina a ul do botao sair e minha conta-->\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"darkBox\"></div>\r\n");
      out.write("</div>");
      out.write("  \r\n");
      out.write("            <!-- end header --><!-- Fim da div header --><!-- Fim da div header -->\r\n");
      out.write("            <span id=\"titlePag\">Cadastrar Posto | DigiMon</span>\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"main\">\r\n");
      out.write("                <div class=\"centro\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- =======================NÃO EDITE ACIMA ====================-->\r\n");
      out.write("                    <h1>Cadastro de Posto</h1>\r\n");
      out.write("                    <form action=\"#\" method=\"post\" id=\"formularioJ\">\r\n");
      out.write("                        <fieldset>\r\n");
      out.write("                            <legend>Dados Endereço</legend>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"logradouroJ\">Logradouro:</label><br> \r\n");
      out.write("                                <input type=\"text\" name=\"logradouro\" id=\"logradouroJ\"  class= \"campoObrig\" placeholder=\"Ex: Rua, Av\" size=\"46\" maxlength=\"40\"><span id=\"x_logradouroJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"numeroJ\">Número:</label><br> \r\n");
      out.write("                                <input type=\"text\" name=\"numero\" id=\"numeroJ\"  class=\"campoObrig\" maxlength=\"9\" ><span id=\"x_numeroJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"complementoJ\">Complemento:</label><br> \r\n");
      out.write("                                <input type=\"text\" name=\"complemento\" id=\"complementoJ\"  class=\"campoObrig\"  placeholder=\"Ex. bloco A\" size=\"20\" maxlength=\"30\" ><span id=\"x_complementoJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"bairroJ\">Bairro:</label><br> \r\n");
      out.write("                                <input type=\"text\" name=\"bairro\" id=\"bairroJ\"  placeholder=\"Ex: Centro\" class=\"campoObrig\" maxlength=\"20\" size=\"40\"><span id=\"x_bairroJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"cepJ\">CEP:</label><br> \r\n");
      out.write("                                <input type=\"text\" name=\"cep\" id=\"cepJ\"  class=\"campoObrig \" placeholder=\"_____-___\" maxlength=\"9\" size=\"10\"><span id=\"x_cepJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"cidadeJ\">Cidade:</label><br> \r\n");
      out.write("                                <input type=\"text\" name=\"cidade\" id=\"cidadeJ\"  class=\"campoObrig\" maxlength=\"30\" placeholder=\"Ex: São Paulo\" size=\"27\"><span id=\"x_cidadeJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"latitudeJ\">Latitude:</label> <br>\r\n");
      out.write("                                <input type=\"text\" name=\"latitude\" class=\"campoObrig\" id=\"latitudeJ\" ><span id=\"x_latitudeJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"longitudeJ\">Longitude:</label> <br>\r\n");
      out.write("                                <input type=\"text\" name=\"longitude\" class=\"campoObrig\" id=\"longitudeJ\" ><span id=\"x_longitudeJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"kmJ\">Km:</label> <br>\r\n");
      out.write("                                <input type=\"text\" name=\"km\" class=\"campoObrig\" id=\"kmJ\" ><span id=\"x_kmJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"campo\"> \r\n");
      out.write("                                <label for=\"ufJ\">UF</label><br> \r\n");
      out.write("                                <select id=\"ufJ\" name=\"uf\" > \r\n");
      out.write("                                    <option value=\"AC\">AC</option> \r\n");
      out.write("                                    <option value=\"AL\">AL</option> \r\n");
      out.write("                                    <option value=\"AM\">AM</option> \r\n");
      out.write("                                    <option value=\"AP\">AP</option> \r\n");
      out.write("                                    <option value=\"BA\">BA</option> \r\n");
      out.write("                                    <option value=\"CE\">CE</option> \r\n");
      out.write("                                    <option value=\"DF\">DF</option> \r\n");
      out.write("                                    <option value=\"ES\">ES</option> \r\n");
      out.write("                                    <option value=\"GO\">GO</option> \r\n");
      out.write("                                    <option value=\"MA\">MA</option> \r\n");
      out.write("                                    <option value=\"MT\">MT</option> \r\n");
      out.write("                                    <option value=\"MS\">MS</option> \r\n");
      out.write("                                    <option value=\"MG\">MG</option> \r\n");
      out.write("                                    <option value=\"PA\">PA</option> \r\n");
      out.write("                                    <option value=\"PB\">PB</option> \r\n");
      out.write("                                    <option value=\"PR\">PR</option> \r\n");
      out.write("                                    <option value=\"PE\">PE</option> \r\n");
      out.write("                                    <option value=\"PI\">PI</option> \r\n");
      out.write("                                    <option value=\"RJ\" selected>RJ</option> \r\n");
      out.write("                                    <option value=\"RN\">RN</option> \r\n");
      out.write("                                    <option value=\"RO\">RO</option> \r\n");
      out.write("                                    <option value=\"RS\">RS</option> \r\n");
      out.write("                                    <option value=\"RR\">RR</option> \r\n");
      out.write("                                    <option value=\"SC\">SC</option> \r\n");
      out.write("                                    <option value=\"SE\">SE</option> \r\n");
      out.write("                                    <option value=\"SP\">SP</option> \r\n");
      out.write("                                    <option value=\"TO\">TO</option>\r\n");
      out.write("                                </select><span id=\"x_ufJ\" class=\"tSpan\"></span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </fieldset>\t\t\t\t \r\n");
      out.write("\r\n");
      out.write("                        <div class=\"botoes\" id=\"botoes\">\r\n");
      out.write("                            <input type=\"reset\" value=\"CANCELAR\" name=\"Limpar\" id=\"limparJ\" class=\"botaoJ\">\r\n");
      out.write("                            <input type=\"submit\" value=\"ENVIAR\" name=\"enviar\" id=\"enviarJ\" class=\"botaoJ\">\r\n");
      out.write("                        </div><!--Fim div botoes-->\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->\r\n");
      out.write("\r\n");
      out.write("                </div><!--Fim div centro-->\t\t\r\n");
      out.write("                <div id=\"clear\"></div><!--Fim div clear-->\r\n");
      out.write("            </div><!--Fim div main conteúdo-->\t\r\n");
      out.write("              <!-- Include do footer -->\r\n");
      out.write("                  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("    <div id=\"rodape\">\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            &copy 2015 - Projeto Digimon | Forsoft Rio\r\n");
      out.write("        </div><!--Fim div Footer-->\r\n");
      out.write("    </div><!--Fim div main do rodape-->\r\n");
      out.write("    </div><!--Fim div \"rodape\"-->\r\n");
      out.write("</div><!--Fim div Interface-->");
      out.write(" \r\n");
      out.write("              <!-- Fim do include do footer-->\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}