package com.House;

import java.util.Scanner;

public class Home 
{
	Scanner sc = new Scanner(System.in);
	Room room[]=new Room[10];
    int room_count=0; 
	public static void main(String[] args) 
	{
		Home home = new Home();
		home.addRoom();
		home.displayRooms_Device();
	}
    public void addRoom()
    {
	  int ch;
	  char choice;
   	  do
	  {	
        System.out.println("\n1.Kitchen\n2.Hall\n3.Bedroom\n4.Exit");
        System.out.println("\nWhich room you want to add in you house:");
        ch = sc.nextInt();  
        switch(ch)
        {
           case 1:room[room_count]= new Kitchen();
                  room[room_count].setRoom_Type("Kitchen");
                  room[room_count].AddDevice();
                  room_count++;
                  break;
           case 2:room[room_count]= new Bedroom();
                  room[room_count].setRoom_Type("Bedroom");
                  room[room_count].AddDevice();
                  room_count++;
                  break;
           case 3:room[room_count]= new Hall();
                  room[room_count].setRoom_Type("Hall");
                  room[room_count].AddDevice();
                  room_count++;
                  break;
          default:System.out.println("\n\nPlease enter the correct choice.");
                  break;
        }
        System.out.println("\nDo you want to add more rooms?:(Y/N)");
        choice=sc.next().charAt(0);
	}while(choice!='N');
   
  }
  public void displayRooms_Device()
  {
	  for(int i=0;i<room_count;i++)
	  {
		  System.out.println("\nName of Room:"+room[i].getRoom_Type());
		  room[i].disDevInroom();
		  System.out.println("--------------------------------------------------------");
	  }
  }

}