![alt text](https://media.licdn.com/dms/image/C4D0BAQEqGPG2-q3r5w/company-logo_200_200/0/1671724357303?e=2147483647&v=beta&t=btLr5harzfvv_-lc_wki4O_XZ_oWAXtux-jg7vLaK9k)

<h1 align="center">Avaliação Técnica</h1>
<p align="center">Avaliação técnica para Facio</p>
<p align="center"> https://facio.com.br/<p/>
<p align="center">Repositório criado para etapa de teste .</p>


<h3 align="center">Status do Projeto</h3>
<p align="center"> ✅ Concluído. </p>

<h3>Demostração da Aplicação</h3>
<p>Antes de começar, você precisará ter instalado em sua máquina as seguintes ferramentas:</p>
<table>
<tr>
	<th>Ferramenta</th>
	<th>Versão</th>
</tr>
<tr>
	<td>Java JDK</td>
	<td>17</td>
</tr>
<tr>
	<td>Git</td>
	<td>2.**</td>
</tr>
<tr>
	<td>Gradle</td>
	<td>7.**</td>
</tr>
<tr>
	<td>Postman</td>
	<td>v9</td>
</tr>
</table>

<h3>Tecnologias Utilizadas</h3>

<table>
<tr>
	<th>Dependência</th>
	<th>Versão</th>
</tr>
<tr>
	<td>spring initialzr</td>
	<td><a href="https://start.spring.io/">https://start.spring.io/</a></td>
</tr>
<tr>
	<td>spring-boot-starter-web</td>
	<td>3.0.0</td>
</tr>
<tr>
	<td>lombok</td>
	<td>1.18.24</td>
</tr>
<tr>
	<td>springdoc-openapi-starter-webmvc-ui</td>
	<td>2.0.3</td>
</tr>
</table>

<h3 align="center" >Configurando a aplicação para poder utilizar em sua IDE</h3>
1° - Após clonar a aplicação: <b>git clone https://github.com/tamarabluz/facio.git</b>
<br>
<br>2° - Confira a <a href="http://localhost:8080/swagger-ui/index.html#/dependency-controller/postInstallationOrder">documentação<a/> ou se preferir coloque a url : http://localhost:8080/dependencies/installation-order</b> para usar o Postman.
<br>
<br>
<p align="center">Exemplo do corpo da requisiçao</p>
<br>
~~~json
{
    "name": "Teste",
    "dependencies": [
        {
            "name": "C",
            "dependencies": [
                {
                    "name": "A",
                    "dependencies": []
                },
                {
                    "name": "B",
                    "dependencies": []
                },
                {
                    "name": "D",
                    "dependencies": []
                }
            ]
        },
        {
            "name": "E",
            "dependencies": [
                {
                    "name": "A",
                    "dependencies": []
                }

            ]
        }
    ]
}
~~~
<br>
<br>
<hr>

<h3>Autora</h3>


<h3>Desenvolvedora</h3>


 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/97554143?v=4" width="100px;" alt=""/>
 
 <h3>Tamara Luz</h3>
