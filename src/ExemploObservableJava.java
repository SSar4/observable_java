import java.util.Observable;
import java.util.Observer;

// Classe observável
class ExemploObservable extends Observable {
    private String mensagem;

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;

        // Marcando o objeto observável como modificado
        setChanged();

        // Notificando os observadores
        notifyObservers(mensagem);
    }
}

// Classe observadora
class ExemploObserver implements Observer {
    private String nome;

    public ExemploObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof ExemploObservable) {
            String mensagem = (String) arg;
            System.out.println(nome + " recebeu a mensagem: " + mensagem);
        }
    }
}

// Exemplo de uso
public class ExemploObservableJava {
    public static void main(String[] args) {
        ExemploObservable observavel = new ExemploObservable();

        ExemploObserver observador1 = new ExemploObserver("Observador 1");
        ExemploObserver observador2 = new ExemploObserver("Observador 2");

        observavel.addObserver(observador1);
        observavel.addObserver(observador2);

        observavel.setMensagem("Olá, observadores!");

        // Saída esperada:
        // Observador 1 recebeu a mensagem: Olá, observadores!
        // Observador 2 recebeu a mensagem: Olá, observadores!
    }
}
