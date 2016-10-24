package keylogger.client.observerdesignpattern;

/**
 * "Feel the beat now,
 * If you've got nothing left say."
 * Good Charlotte.
 * 
 * @author Leonardo
 */
public interface Subject {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void removeObserver(int index);
	public void notifyObserver();
}
