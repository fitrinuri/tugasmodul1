/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author hp
 */
public class nomer3 {
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);
        byte[] ip = localhost.getAddress();
        for (int i = 52; i <= 255; i++) {
            ip[3] = (byte)i;
            InetAddress address = InetAddress.getByAddress(ip);
            if(address.isReachable(3000)){
                System.out.println(address + " - is Reachable");
            }else if (!address.getHostAddress().equals(address.getAddress())){
                System.out.println(address + " - diketahui");
            }else{
                System.out.println(address + " - host address dan host name sama");
                
            }
            
            
        }
    }
    
}
