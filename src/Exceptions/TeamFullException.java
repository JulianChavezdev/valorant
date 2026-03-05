package Exceptions;

public class TeamFullException extends Exception {
    public TeamFullException() {
        super("El equipo està completo, tiene 5 agentes.");
    }
}
