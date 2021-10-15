import java.io.*;
import java.net.*;
// 39110926-SHAIK JAVEED SUHAIL
public class Sip {
    public static void main(String args[]) {
        ServerSocket ss;
        Socket s;
        BufferedReader dis;
        String ip;
        try {
            ss = new ServerSocket(8020);
            while (true) {
                s = ss.accept();
                dis = new BufferedReader(new InputStreamReader(s.getInputStream()));
                ip = dis.readLine();
                System.out.println("Ip address of the client system is" + ip);
            }
        } catch (IOException e) {
            System.out.println("The exception is: " + e);
        }
    }
}
