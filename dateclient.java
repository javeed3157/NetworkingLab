import java.io.*;
import java.net.*;

public class dateclient {
    public static void main(String args[]) {
        Socket soc;
        BufferedReader dis;
        String sdate;
        try {
            InetAddress ia = InetAddress.getLocalHost();
            soc = new Socket(ia, 8020);
            dis = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            sdate = dis.readLine();
            System.out.println("The date in the server is: " + sdate);
        } catch (IOException e) {
            System.out.println("The exception is: " + e);
        }
    }
}
