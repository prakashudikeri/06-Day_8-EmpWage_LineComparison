package com.bridgelabz.day8oopsconcept;
import java.util.Scanner;

public class LineComparisonUC4 {
	int x1,x2,y1,y2;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	    	LineComparisonUC4 LC1 = new LineComparisonUC4();
	        LineComparisonUC4 LC2 = new LineComparisonUC4();
	        LC1.getLinePoint();
	        LC2.getLinePoint();

	        double line1Length = LC1.getLengthOfLine();
	        double line2Length = LC2.getLengthOfLine();
	        
	        System.out.println("Length of Line1 : "+line1Length);
	        System.out.println("Length of Line2 : "+line2Length);
	        System.out.println(compareTo(line1Length,line2Length));
	    }	    
    public void getLinePoint(){
	        System.out.println("Enter The Value of X1 :");
		        x1=sc.nextInt();
	        System.out.println("Enter The Value of Y1 :");
	        	y1=sc.nextInt();
	        System.out.println("Enter the Value of X2 :");
		        x2=sc.nextInt();
	        System.out.println("Enter the Value of Y2 :");
		        y2=sc.nextInt();
		    }
    public double getLengthOfLine() {
	        double lengthofLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	        return lengthofLine;
		    }
    public static String compareTo(double l1,double l2) {
        if(l1==l2) {
		            return "Line1 and Line2 are Equal.";
		        }
        	else {
	            if(l1>l2) {
		                return "Line 1 is Bigger Than Line 2";
		            }
	            	else {
		                return "Line 1 is Smaller Than Line 2";
		            }
		        }
		    }	
}
