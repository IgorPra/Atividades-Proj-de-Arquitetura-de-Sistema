package AbstractFactory;

class TCPChannel implements Channel {
    @Override
    public void getMessage() {
        System.out.println("Recebendo mensagem via TCP...");
    }
}
