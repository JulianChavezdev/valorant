package Exceptions;

public class AgentNotFoundException extends RuntimeException {
    public AgentNotFoundException(String name) {
        super("Agente no encontrado" +name );
    }
}
