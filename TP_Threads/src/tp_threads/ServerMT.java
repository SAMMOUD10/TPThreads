package tp_threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMT extends Thread {

	private boolean isActive = true;
	private int nombreClients = 0;
	
	public static void main(String[] args) {
		new ServerMT().start();
	}
	
	@Override
	public void run() {
		try {
			ServerSocket ss = new ServerSocket(1234);
			while(isActive){
				Socket socket = ss.accept();
				++nombreClients;
				new Conversation(socket,nombreClients).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class Conversation extends Thread{
		
		private Socket socket;
		private int numeroClient;
		
		public Conversation(Socket s, int num) {
			this.socket = s;
			this.numeroClient = num;
		}
		
		@Override
		public void run() {
			
			try {
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is); 
				BufferedReader br = new BufferedReader(isr);
				
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os,true);
		
				String ipClient = socket.getRemoteSocketAddress().toString();
				System.out.println("Connexion du client numéro "+numeroClient+" IP= "+ipClient);
				pw.println("Bienvenue, vous êtes le client numéro "+numeroClient);
				
				while (true) {
					String req = br.readLine();
					String reponse = "Length: "+req.length();
					System.out.println("Le client "+ipClient+" a envoyé une requête "+req);
					pw.println(reponse);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
}
