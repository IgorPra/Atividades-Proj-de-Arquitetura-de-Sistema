package Decoretor;

public class TCPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("TCPChannel enviando: " + message);
    }

    @Override
    public String receive() {
        return "Mensagem recebida via TCPChannel";
    }
}

