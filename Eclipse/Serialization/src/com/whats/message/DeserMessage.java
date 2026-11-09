package com.whats.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserMessage {
	
	public void messageDeser() throws IOException, ClassNotFoundException  {
		
			FileInputStream fis = new FileInputStream("C:\\Batch\\Kodewala 1 june batch Practice\\Eclipse\\Serialization\\src\\com\\whats\\message\\message.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
		Message message = 	(Message) ois.readObject();
		
		System.out.println(message.getName() +" "+message.getAddress() +" "+ message.getAccNo());
			
		ois.close();
	}

}
