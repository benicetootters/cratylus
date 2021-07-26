package edu.bowdoin.cratylus;

import java.net.*;

public class Tester {

	public static void main(String[] args) {
		InetAddress inetAddress;
		StringBuilder sb = new StringBuilder();
		String ipAddress="",macAddress="";
		int i=0;
		try {
		    inetAddress=InetAddress.getLocalHost();
		    ipAddress=inetAddress.getHostAddress();
		    NetworkInterface network=NetworkInterface.getByInetAddress(inetAddress);
		     byte[] hw=network.getHardwareAddress();
		     for(i=0; i<hw.length; i++)
		        sb.append(String.format("%02X%s", hw[i], (i < hw.length - 1) ? "-" : 
		         ""));    
		    macAddress=sb.toString();
		  } catch(Exception e) {
		   System.out.print("<br/>"+e.toString());
		    macAddress="-";
		  }
		  System.out.print("<br/>"+ipAddress);
		  System.out.print("<br/>"+macAddress);

	}

}
