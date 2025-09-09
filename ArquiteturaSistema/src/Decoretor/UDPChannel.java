package Decoretor;

public class UDPChannel implements Channel {
    @Override
    public void send(String message) {
        System.out.println("UDPChannel enviando: " + message);
    }

    @Override
    public String receive() {
        return "Mensagem recebida via UDPChannel";
    }
}

