package com.scripted.selfhealing_Mob_testscripts;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
class Example
{
    public static void main(String[] args)
    {	

    	
    	//Displaying current date and time in 12 hour format with AM/PM
    	DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_ms_aa");
    	String dateString = dateFormat.format(new Date()).toString();
    	System.out.println("Current date and time in AM/PM: "+dateString);
    }
}