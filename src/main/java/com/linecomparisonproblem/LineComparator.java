package com.linecomparisonproblem;


public class LineComparator 
{
	public void comparison(Line l1, Line l2) {
		
		int status = l1.compareTo(l2);
		
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
       
       Point p1 = new Point(4,5);
       Point p2 = new Point(12,12);
       Line line1 = new Line(p1,p2);
       
       Point p3 = new Point(40,10);
       Point p4 = new Point(50.5,17);
       Line line2 = new Line(p3,p4);
       
       LineComparator lineComparator = new LineComparator();
       lineComparator.comparison(line1, line2);
       
       
    }
}
