package com.supinfo.network;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket; 


public class ServerLauncher {
	
	// Listening Port : 4155 || Max connection queue: 5
	ServerSocket listen = new ServerSocket(4155, 5);
	Socket service

	while (true) {
		// Ready to accept client connection
		service = listen.accept();
		OutputStream out = service.getOutputStream();
		InputStream in = new FileInputStream ("file");
		byte[] buffer = new byte[256];

		// While there is byte to read
		while (in.read (buffer) != -1) {
			out.write (buffer);
		}
		/* Close all the streams and the socket */


}
