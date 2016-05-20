package me.pattern.observer;

public interface Subject {
	void register(Observer obs);
	void unregister(Observer obs);
	void notifyObserver();
}
