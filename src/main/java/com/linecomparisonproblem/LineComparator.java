package com.linecomparisonproblem;


public class LineComparator 
{
	public void comparison(Line l1, Line l2) {

		Double l1Length = Double.valueOf(l1.getLength());
		Double l2Length = Double.valueOf(l2.getLength());
		
		int status = l1Length.compareTo(l2Length);
		
		if(status==0){
			System.out.print("Both the lines are equal");
		}
		else if(status==1) {
			System.out.print("Line 1 is longer than line 2");
		}
		else {
			System.out.print("Line 2 is longer than line 1");
		}
		
	}
	
    public static void main( String[] args )
    {
       System.out.println("Welcome to Line Comparison Computation Problem");
       
       Point p1 = new Point(-5,5);
       Point p2 = new Point(0,12);
       Line line1 = new Line(p1,p2);
       
       Point p3 = new Point(4,10);
       Point p4 = new Point(5,17);
       Line line2 = new Line(p3,p4);
       
       LineComparator lineComparator = new LineComparator();
       lineComparator.comparison(line1, line2);
       
       
    }
}
