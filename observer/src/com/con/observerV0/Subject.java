package com.con.observerV0;

import java.util.*;

public abstract class Subject {
	
	List<Observer> listObservers = new ArrayList<>();
	
	void attach(Observer o) {
		listObservers.add(o);
	}
	
	void detach(Observer o) {
		listObservers.remove(o);
	}
	
	void notificar() {
		for (Observer o:listObservers)
			o.update();
	}

}
