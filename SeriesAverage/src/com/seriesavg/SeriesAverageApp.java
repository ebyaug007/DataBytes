/* Design a class, MovingAverage, which contains a method, next that is responsible for returning the moving average from a stream of integers.
Note: a moving average is the average of a subset of data at a given point in time.

Ex: Given the following series of events...

// i.e. the moving average has a capacity of 3.
MovingAverage movingAverage = new MovingAverage(3);
m.next(3) returns 3 because (3 / 1) = 3
m.next(5) returns 4 because (3 + 5) / 2 = 4 
m.next(7) = returns 5 because (3 + 5 + 7) / 3 = 5
m.next(6) = returns 6 because (5 + 7 + 6) / 3 = 6*/

package com.seriesavg;

class MovingAverage {
    // TODO: declare any instance variables you require.
/**
 * Initializes a MovingAverage with a
 * capacity of `size`.
 */
int arr[];
int i;
public MovingAverage(int size) {
  // TODO: initialize your MovingAverage.
	arr = new int[size];
	i=0;
}

/**
 * Adds `val` to the stream of numbers
 * and returns the current average of the numbers.
 */
public double next(int val) {
   // TODO: implement this method.
	arr[i%3] = val;
	int sum = 0;
	for(int j=0; j< arr.length; j++)
	{
		sum = sum + arr[j];
	}
	i++;
	double avg = 0.0;
	if(i<arr.length)
		avg=sum/i;
	else
		avg =sum/arr.length;
	//System.out.println(i +" " + i%3);
	return avg;
}

}

public class SeriesAverageApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MovingAverage m = new MovingAverage(3);
		System.out.println(m.next(3) +" " + m.next(5) +" "+ m.next(7)+" "+m.next(6));
		
		
	}

}
