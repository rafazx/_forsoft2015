<%-- 
    Document   : cadastrarposto
    Created on : 25/10/2015, 02:06:07
    Author     : Sora
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html lang="pt-br">
<head>
	<title>Consultar Posto | DigiMon</title>
	<link rel="stylesheet" type="text/css" href="dist/css/estilo.css">
	<link href='https://fonts.googleapis.com/css?family=Cantarell:400,700' rel='stylesheet' type='text/css'>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src="dist/js/novo.js" defer=""></script>
</head>
<body class="insideSystem">
	<div id="interface">
		<div id="header">
			<div class="main">
				<a href="#"><img src="dist/imagens/logoo.png" class="logo" id="logoo" alt="Logo"/></a>
				<ul class="menu" id="menu">
					<li><a href="#">Home</a></li>
					<li><a href="#">Transportador<img src="dist/imagens/seta.png" class="seta" alt="Opções de transportador"/></a>
						<ul>
							<li><a href="#">Frete<img src="dist/imagens/setad.png" class="setad" alt="Opções de Frete"/></a>
								<!--Criação da class submenu-->
								<ul class="submenu">
									<li><a href="#">Cadastrar</a></li>
									<li><a href="#">Consultar</a></li>
								</ul>
							</li>
							<li><a href="#">Veículo <img src="dist/imagens/setad.png" class="setad" alt="Opções de Veículo"/></a>
								<ul class="submenu">
									<li><a href="#">Cadastrar</a></li>
									<li><a href="#">Consultar</a></li>
								</ul>
							</li>
							<li><a href="#">Motorista <img src="dist/imagens/setad.png" class="setad" alt="Opções de Motorista"/></a>
								<ul class="submenu">
									<li><a href="#">Cadastrar</a></li>
									<li><a href="#">Consultar</a></li>
								</ul>
							</li>
						</ul>
					</li>
					<li><a href="#">Órgão <img src="dist/imagens/seta.png" class="seta" alt="Opções de Órgão"/></a>
						<ul>
							<li><a href="#">Posto <img src="dist/imagens/setad.png" class="setad" alt="Opções de Posto"/></a>
								<ul class="submenu">
									<li><a href="#">Posto de Pedágio</a></li>
									<li><a href="#">Posto de Pesagem</a></li>
								</ul>
							</li>
							<li><a href="#">Rodovia <img src="dist/imagens/setad.png" class="setad" alt="Opções de Rodovia"/></a>
								<ul class="submenu">
									<li><a href="#">Cadastrar </a></li>
									<li><a href="#">Consultar</a></li>
								</ul>
							</li>
							<li><a href="#">Transportador <img src="dist/imagens/setad.png" class="setad" alt="Opções de Transportador"/></a>
								<ul class="submenu">
									<li><a href="#">TAC</a></li>
									<li><a href="#">TETI</a></li>
									<li><a href="#">ETC</a></li>
								</ul>
							</li>
							<li><a href="#">Câmera <img src="dist/imagens/setad.png" class="setad" alt="Opções de Câmera"/></a>
								<ul class="submenu">
									<li><a href="#">Cadastrar </a></li>
									<li><a href="#">Consultar</a></li>
								</ul>
							</li>
							<li><a href="#">Balança <img src="dist/imagens/setad.png" class="setad" alt="Opções de Balança"/></a>
								<ul class="submenu">
									<li><a href="#">Cadastrar </a></li>
									<li><a href="#">Consultar</a></li>
								</ul>
							</li>
						</ul>
					</li>
					<li><a href="#">Posto de Pesagem <img src="dist/imagens/seta.png" class="seta" alt="Opções de Pesagem"/></a>
						<ul>
							<li><a href="#">Pesagem <img src="dist/imagens/setad.png" class="setad" alt="Opções de Pesagem"/></a>
								<ul class="submenu">
									<li><a href="#">Cadastrar </a></li>
									<li><a href="#">Consultar</a></li>
								</ul>
							</li>
						</ul>
					</li> 
					<li><a href="#">Relatório <img src="dist/imagens/seta.png" class="seta" alt="Opções de Relatório"/></a>
						<ul>
							<li><a href="#">Emitir</a></li>
						</ul>
					</li>
					<li><a href="#">Usuário<img src="dist/imagens/seta.png" class="seta" alt="Opções de Usuário"/></a>
						<ul>
							<li><a href="#">Cadastrar</a></li>
							<li><a href="#">Consultar</a></li>
						</ul>
					</li>
					<li><a href="#">Ajuda<img src="dist/imagens/seta.png" class="seta" alt="Opções de Ajuda"/></a>
						<ul>
							<li><a href="#">Fale Conosco</a></li>
							<li><a href="#">FAQ</a></li>
						</ul>
					</li>
				<!--Aqui tem uma ul diferente-->
					<li><img src="dist/imagens/iconeMenu.png" class="iconeMenu" alt="Menu do Usuário"/>
						<ul id="last">
							<li><a href="#">Minha Conta</a></li>
							<li><a href="#">Sair</a></li>
						</ul>
				<!--aqui termina a ul do botao sair e minha conta-->
					</li>
				</ul>
			</div>
			<div id="darkBox"></div>
		</div><!-- Fim da div header -->
		
		<div id="main">
			<div class="centro">
			
					<!-- =======================NÃO EDITE ACIMA ====================-->
			<h1>Cadastro de Posto</h1>
				<form action="posto" method="post" id="formularioJ">
					<fieldset>
						<legend>Dados Endereço</legend>
						<div class="campo"> 
							<label for="logradouroJ">Logradouro:</label><br> 
							<input type="text" name="logradouro" id="logradouroJ"  class= "campoObrig" placeholder="Ex: Rua, Av" size="46" maxlength="30"><span id="x_logradouroJ" class="tSpan"></span>
						</div>
						<div class="campo"> 
							<label for="numeroJ">Número:</label><br> 
							<input type="text" name="numero" id="numeroJ"  class="campoObrig" maxlength="9" ><span id="x_numeroJ" class="tSpan"></span>
						</div>
						<div class="campo"> 
							<label for="complementoJ">Complemento:</label><br> 
							<input type="text" name="complemento" id="complementoJ"  class="campoObrig"  placeholder="Ex. bloco A" size="20" maxlength="10" ><span id="x_complementoJ" class="tSpan"></span>
						</div>
						<div class="campo"> 
							<label for="bairroJ">Bairro:</label><br> 
							<input type="text" name="bairro" id="bairroJ"  placeholder="Ex: Centro" class="campoObrig" maxlength="20" size="30"><span id="x_bairroJ" class="tSpan"></span>
						</div>
						<div class="campo"> 
							<label for="cepJ">CEP:</label><br> 
							<input type="text" name="cep" id="cepJ"  class="campoObrig" placeholder="_____-___" maxlength="10" size="10"><span id="x_cepJ" class="tSpan"></span>
						</div>
						<div class="campo"> 
							<label for="cidadeJ">Cidade:</label><br> 
							<input type="text" name="cidade" id="cidadeJ"  class="campoObrig" maxlength="30" placeholder="Ex: São Paulo" size="27"><span id="x_cidadeJ" class="tSpan"></span>
						</div>
						<div class="campo"> 
							<label for="ufJ">UF</label><br> 
							<select id="ufJ" name="uf" > 
								<option value="AC">AC</option> 
								<option value="AL">AL</option> 
								<option value="AM">AM</option> 
								<option value="AP">AP</option> 
								<option value="BA">BA</option> 
								<option value="CE">CE</option> 
								<option value="DF">DF</option> 
								<option value="ES">ES</option> 
								<option value="GO">GO</option> 
								<option value="MA">MA</option> 
								<option value="MT">MT</option> 
								<option value="MS">MS</option> 
								<option value="MG">MG</option> 
								<option value="PA">PA</option> 
								<option value="PB">PB</option> 
								<option value="PR">PR</option> 
								<option value="PE">PE</option> 
								<option value="PI">PI</option> 
								<option value="RJ" selected>RJ</option> 
								<option value="RN">RN</option> 
								<option value="RO">RO</option> 
								<option value="RS">RS</option> 
								<option value="RR">RR</option> 
								<option value="SC">SC</option> 
								<option value="SE">SE</option> 
								<option value="SP">SP</option> 
								<option value="TO">TO</option>
							</select><span id="x_ufJ" class="tSpan"></span>
						</div>
					</fieldset>				 

					<div class="botoes" id="botoes">
						<input type="reset" value="CANCELAR" name="Limpar" id="limparJ" class="botaoJ">
						<input type="submit" value="ENVIAR" name="enviar" id="enviarJ" class="botaoJ">
					</div><!--Fim div botoes-->
				</form>
				
				<!-- ===== NÃO EDITE A PARTIR DAQUI =========================================-->
				
				</div><!--Fim div centro-->		
				<div id="clear"></div><!--Fim div clear-->
			</div><!--Fim div main conteúdo-->	
		<div id="rodape">
			<div class="main">
				<div id="footer">
					&copy 2015 - Projeto Digimon | Forsoft Rio
				</div><!--Fim div Footer-->
			</div><!--Fim div main do rodape-->
		</div><!--Fim div "rodape"-->
	</div><!--Fim div Interface-->
</body>
</html>