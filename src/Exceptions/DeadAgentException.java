package Exceptions;

public class DeadAgentException extends Exception {
    public DeadAgentException(String name) {
        super("Agent " + name + " is eliminated");
    }
}
