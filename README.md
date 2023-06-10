# Exemplo de Observable em Java
Este é um exemplo simples de como usar a interface Observable e a classe Observer em Java para implementar 
o padrão de projeto "Observer". O padrão Observer é usado quando 
há uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, 
todos os seus dependentes são notificados e atualizados automaticamente.

## Como funciona
Neste exemplo, temos uma classe ExemploObservable que é a classe observável e uma classe ExemploObserver que é a classe observadora.

A classe ExemploObservable estende a classe Observable do pacote java.util e possui um método setMensagem que atualiza o estado interno do objeto e notifica os observadores. O método setMensagem marca o objeto observável como modificado usando o método setChanged e, em seguida, chama o método notifyObservers para notificar os observadores passando a mensagem atualizada como argumento.

A classe ExemploObserver implementa a interface Observer e possui um método update que é invocado quando uma mudança ocorre no objeto observável. Neste exemplo, o método update simplesmente imprime a mensagem recebida.

## Como usar
Clone o repositório para o seu ambiente de desenvolvimento local:

git clone https://github.com/seu-usuario/observable_java.git

cd ``observable_java``

Compile os arquivos Java: javac ExemploObservableJava.java

Execute o arquivo compilado: java ExemploObservableJava

Você verá a saída no console, que mostrará que os observadores receberam a mensagem do objeto observável:

``Observador 1 recebeu a mensagem: Olá, observadores!
Observador 2 recebeu a mensagem: Olá, observadores!
``