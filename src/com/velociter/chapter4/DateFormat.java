package com.velociter.chapter4;
/*
Define an array of 10 String elements each containing an arbitrary string of the form
"month/day/year"; for example,"10/29/99" or "12/5/01". Analyze each element in the
array and output the date represented in the form 29th October 1999
 */
public class DateFormat {

	public static void main(String[] args) {
		//String[] to store date in 12/30/99 format
		String[] dateOfYear = 
			{"10/29/99","05/14/13","07/27/19","01/03/92","04/03/21","12/25/67","09/02/06","01/01/00","03/02/22","01/05/04"};
		String[] month = new String[dateOfYear.length];					//String[] to extract month from date
		String[] day = new String[dateOfYear.length];					//String[] to extract day from date
		String[] year = new String[dateOfYear.length];					//String[] to extract year from date
		
		for(int i=0; i<dateOfYear.length; i++) {	
			String monthSubString = dateOfYear[i].substring(0,2);		//String to store subString for month	
			month[i] = monthSubString;									//storing month in month[]
			String daySubString = dateOfYear[i].substring(3,5);			//String to store subString for day
			day[i] = daySubString;										//storing day in day[] 	
			String yearSubString =dateOfYear[i].substring(6);			//String to store subString for year
			year[i] = yearSubString;									//storing year in year[]
		}
		
		
		for(int i=0; i<month.length; i++) {
			switch(month[i]) {											//converting months 1,2,3 into January.Feburary.....
			case "01":
				month[i]= "January";
				break;
			case "02":
				month[i]= "Feburary";
				break;
			case "03":
				month[i]= "March";
				break;
			case "04":
				month[i]= "April";
				break;
			case "05":
				month[i]= "May";
				break;
			case "06":
				month[i]= "June";
				break;
			case "07":
				month[i]= "July";
				break;
			case "08":
				month[i]= "Augest";
				break;
			case "09":
				month[i]= "September";
				break;
			case "10":
				month[i]= "October";
				break;
			case "11":
				month[i]= "November";
				break;
			case "12":
				month[i]= "December";
				break;
			}
			if((Integer.parseInt(year[i]))>22) { 										//converting year 99 to 1999	
				year[i] = "19"+year[i];
			}
			else {	
				year[i] = "20"+year[i];
				}
			char lastChar = day[i].charAt(day[i].length()-1);							//converting 1,2,3 to 1st,2nd,3rd
			switch(lastChar) {
			case '1':
				day[i] = day[i]+"st";
				break;
			case '2':
				day[i] = day[i]+"nd";
				break;
			case '3':
				day[i] = day[i]+"rd";
				break;
			default:
				day[i] = day[i]+"th";
				break;
			}
		}
		for(int i=0; i<month.length; i++)												//Printing DateFormet
			System.out.println(dateOfYear[i]+" : "+day[i]+" "+month[i]+" "+year[i]);
	}
}
