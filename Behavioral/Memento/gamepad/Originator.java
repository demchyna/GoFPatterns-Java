package gamepad;

public interface Originator {
    Memento save();
    void restore(Memento memento);
}
