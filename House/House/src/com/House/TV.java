package com.House;

public class TV implements Gadget
{


	 public String status;
	    @Override
		public String getStatus() 
	    {
		   return status;	
		}

		@Override
		public void setStatus(String st) {
			status= st;
		}
		String devType=" ";
		public String getDevType() 
		{
			return devType;
		}

		public void setDevType(String devType) {
			this.devType = devType;
		}
		
		
		@Override
		public String on() 
		{
			System.out.println("TV : ON");
			return "ON";
			
		}
		@Override
		public String off() 
		{  
			System.out.println("TV : CLOSE");
			return "OFF";
		}
	  
  
}