package com.House;

import java.util.Scanner;

public class Room 
{
	int no=0;
	Gadget[] device = new Gadget[20]; 
	Scanner sc = new Scanner(System.in);
	public void AddDevice()
	{
		int ch;
		char choice;
	   	do
    	{	
	        System.out.println("\n1.Electronic device\n2.Lights\n3.Air Conditioners\n4.Television\n5.Doors\n6.Showers");
	        System.out.println("\nWhich device you want to add:");
	        ch = sc.nextInt();  
	        switch(ch)
	        {
	           case 1:device[no]= new ElectDevice();
	                  device[no].setDevType("Electronic Device");
	                  switchDev();
	                  no++;
	                  break;
	           case 2:device[no]= new Lights();
	                  device[no].setDevType("Lghts");
	                  switchDev();
	                  no++;
                      break;
	           case 3:device[no]= new AC();
	                  device[no].setDevType("AC");
	                  switchDev();
	                  no++;
                      break;
	           case 4:device[no]= new TV();
	                  device[no].setDevType("TV");
	                  switchDev();
                      no++;
                      break;
	           case 5:device[no]= new Doors();
	                  device[no].setDevType("Doors");
	                  switchDev();
                      no++;
                      break;
               case 6:device[no]= new Shower();
                      device[no].setDevType("Shower");
                      switchDev();
               		  no++;
                      break;
	        }
	        System.out.println("\nDo you want to add more devices?:(Y/N)");
	        choice=sc.next().charAt(0);
    	}while(choice!='N');
	   
	}
	public void disDevInroom()
    {
    	for(int i=0;i<no;i++)
    	{
    		System.out.println("\nName of Deivce:"+device[i].getDevType()+" Status:"+device[i].getStatus());
    	}
    }
    public void switchDev()
    {
    	int ch1;
    	System.out.println("\nDo you want to make the device on/off(1:0)?:");
        ch1 = sc.nextInt();  
        switch(ch1)
        {
            case 1:device[no].setStatus(device[no].on());
                   break;
            case 0:device[no].setStatus(device[no].off());
                   break;
        }
    }
	public void setRoom_Type(String string) {
	} 
	public String getRoom_Type() {
		return null;
	}
	
		
		
	
	
}
