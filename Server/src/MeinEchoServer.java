import java.io.*;
import java.net.*;

public class MeinEchoServer {

    public static void main(String[] argv) {

        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            Socket clientSocket = serverSocket.accept();

            OutputStream socketoutstr = clientSocket.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter( socketoutstr );
            BufferedWriter bw = new BufferedWriter( osr );

            InputStream socketinstr = clientSocket.getInputStream();
            InputStreamReader isr = new InputStreamReader( socketinstr );
            BufferedReader br = new BufferedReader( isr );

            String anfrage;
            String antwort;


            anfrage = br.readLine();
            antwort = "Antwort auf " + anfrage;
            bw.write(antwort);
            bw.newLine();
            bw.flush();

            anfrage = br.readLine();
            antwort = "Antwort auf " + anfrage;
            bw.write(antwort);
            bw.newLine();
            bw.flush();

            anfrage = br.readLine();
            antwort = "Antwort auf " + anfrage;
            bw.write(antwort);
            bw.newLine();
            bw.flush();

            bw.close();
            br.close();
            clientSocket.close();
            serverSocket.close();
        }
        catch (UnknownHostException uhe) {
            System.out.println(uhe);
        }
        catch (IOException ioe) {
            System.out.println(ioe);
        }

    } // ende: main

} // Ende: public class MeinEchoServer 