/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author hp
 */
public class nomer4 {
    
    public static void main(String[] args) {
        InetAddress ip;
        try{
            ip = InetAddress.getLocalHost();
            System.out.println("Current IP Address : " + ip.getHostAddress());
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            System.out.println("Current MAC Address : ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "_" : "");
                
            }
            System.out.println(sb.toString());
        }catch (UnknownHostException e) {
            e.printStackTrace();
        }catch (SocketException e){
            e.printStackTrace();
            
        }
        
    }
    
}
