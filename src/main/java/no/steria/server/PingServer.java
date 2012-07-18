package no.steria.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class PingServer {
	public static void main(String[] args) throws Exception {
		int port = 8081;
		String paraPort = System.getProperty("pingServer.port");
		if (paraPort != null && !paraPort.isEmpty()) {
			port = Integer.parseInt(paraPort);
		}
		Server server = new Server(port);
		server.setHandler(new WebAppContext("src/main/webapp", "/"));
		server.start();
		
		System.out.println("Server started port " + port);
	}
}
