package com.linecomparisonproblem;

import java.text.DecimalFormat;

public class Line implements Comparable<Line> {
    
	private Point start, end;
	
	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	
	public double getLength() {
		double x1 = start.getX();
		double y1 = start.getY();
		
		double x2 = end.getX();
		double y2 = end.getY();
		
		double length = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
		
		return Double.parseDouble(new DecimalFormat(".##").format(length));
	}	


	@Override
	public int compareTo(Line lineObj) {
		
		if(this.getLength()>lineObj.getLength())
			return 1;
		else if(this.getLength() == lineObj.getLength())
			return 0;
		else
			return -1;
	}
}