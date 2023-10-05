# Orientação a Objetos e UML: Diagramação de Classes do iPhone
<p>Desafio proposto pelo Santander Bootcamp - Backend Java para criar um digrama de classe do iphone.</p>
<p>Para este desafio o iphone conta com as funcionalinades de um reprodutor musical, aparelho telefonico e um navegador web.</p>

## Diagrama de classe
![iphone](https://github.com/MarcosSilva13/Diagrama-classe-iphone/blob/master/Diagrama%20iphone.jpg)

## Descrição das classes e interface

### Reprodutor Musical
A interface ReprodutorMusical é responsável por definir os métodos `tocar(String musica)`, `pausar()` e `selecionarMusica(int indiceMusica)`. O método tocar recebe como parâmetro uma música e o método selecionarMusica recebe como parâmetro o indice de uma música. 

### Aparelho Telefônico
A interface AparelhoTelefonico é responsável por definir os métodos `ligar(String numero)`, `atender()`, e `iniciarCorreioVoz()`. O método ligar recebe como parâmetro um número de telefone para ser feito a ligação.

### Navegador Web
A interface NavegadorWeb é responsável por definir os métodos `exibirPagina(String url)`, `adicionarNovaAba()` e `atualizarPagina()`. O método exibirPagina recebe como parâmetro uma url para abrir uma página na web.

### Iphone
A classe Iphone implementa todas as interfaces citadas acima e também seus métodos, assim possuindo todas as funcionalidades sugeridas.
