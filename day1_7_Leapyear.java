import java.util.*;
public class day1_7_LeapYear{
public static void cheackleap(int year){

if(year>=1582)
{
if((year %4==0 && year %100!=0)||( year % 400==0))
System.out.println("leap  year");
}
else 
System.out.println(" non leap year");
}
 
public static void main(String [] args){
	do{
Scanner sc=new Scanner(System.in);
System.out.println("enter year");
int year =sc.nextInt();
cheackleap(year);}
while(year!=false)
}
}



