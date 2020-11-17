package com.linecomparisonproblem;


public class LineComparator 
{
	public void isEqual(Line l1, Line l2) {

		Double l1Length = Double.valueOf(l1.getLength());
		Double l2Length = Double.valueOf(l2.getLength());
		
		if(l1Length.equals(l2Length)){
			System.out.print("Both the lines are equal");
			return;
		}
		System.out.print("Both the line are not equal");
	}
	
    public static void main( String[] args )
    {
       System.out.println("Welcome to Line Comparison Computation Problem");
       
       Point p1 = new Point(0,5);
       Point p2 = new Point(0,12);
       Line line1 = new Line(p1,p2);
       
       Point p3 = new Point(5,10);
       Point p4 = new Point(5,17);
       Line line2 = new Line(p3,p4);
       
       LineComparator lineComparator = new LineComparator();
       lineComparator.isEqual(line1, line2);
       
       
    }
}
