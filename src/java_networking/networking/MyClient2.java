package java_networking.networking;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
public class MyClient2 //TCPClient
{
	public static void main(String[] args)throws IOException
	{

		Socket s=new Socket("localhost",3333);
		System.out.println("Client Started");
		DataInputStream din=new DataInputStream(s.getInputStream());
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";
		while(!str.equals("stop"))
		{
			str=br.readLine();
			dout.writeUTF(str);
			dout.flush();
			str2=din.readUTF();
			System.out.println("Server Says : "+str2);	
		}
		dout.close();
		s.close();
	}
}