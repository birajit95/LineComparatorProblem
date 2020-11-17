package com.linecomparisonproblem;


public class LineComparator 
{
    public static void main( String[] args )
    {
       System.out.println("Welcome to Line Comparison Computation Problem");
       
       Point p1 = new Point(4,5);
       Point p2 = new Point(7,12);
       
       Line line1 = new Line(p1,p2);
       
       System.out.print(line1.getLength());
       
    }
}
