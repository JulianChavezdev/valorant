package Exceptions;

public class AgentNotFoundException extends Exception {
    public AgentNotFoundException(String name) {
        super("Agente no encontrado" +name );
    }
}
