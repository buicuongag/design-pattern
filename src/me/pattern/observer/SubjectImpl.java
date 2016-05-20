package me.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{
	
	List<Observer> observers = new ArrayList<Observer>();
	
	private int flag;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
		notifyObserver();
	}

	@Override
	public void register(Observer obs) {
		observers.add(obs);
	}
	
	@Override
	public void unregister(Observer obs) {
		observers.remove(obs);
	}

	@Override	
	public void notifyObserver() {
		for(Observer o : observers) {
			o.update();
		}
	}

}
