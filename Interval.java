// Semester:         CS367 Spring 2017 
// PROJECT:          p4
// FILE:             Interval.java
//
// TEAM:    Team 42a
// Authors: Jessica Fernandes, Aseel Albeshri
// Author1: (Jessica Fernandes,jfernandes2@wisc.edu,jfernandes2,lecture 02)
// Author2: (Aseel Albeshri,albeshri@wisc.edu,albeshri,lecture 02)
public class Interval<T extends Comparable<T>> implements IntervalADT<T> {
/**
 *Interval class compares intervals
 *
 * <p>Bugs: (a list of bugs and other problems)
 *
 * @author Jessica Fernandes, Aseel Albeshri
 */
    // TODO declare any needed data members
	private T start;
	private T end;
	private String label;
	/**
	 * Interval class constructor 
	 *
	 * @param T start is the interval's start value
	 * @param T end is the interval's end value
	 * @param String label is the label assigned to the interval
	 * @return start, end, label of interval
	 */	
    public Interval(T start, T end, String label) {
    	this.start = start;
    	this.end = end;
    	this.label = label;
    }
    /**
     * getStart returns the interval's start value
     * @return start value of type T of interval
     */
    @Override
    public T getStart() {
        return start;
    }
    /**
     * getEnd returns the interval's end value.
     * @return end value of type T of interval
     */
    @Override
    public T getEnd() {
        return end;
    }
    /**
     * getLabel returns interval's label
     * @return label of type String of interval
     */
    @Override
    public String getLabel() {
        return label;
    }
    /**
     * overlaps method checks if intervals overlap. If for interal1 and interval2
     * end1 is less than start2 or end2 is less than start1, there is no overlap.
     * For all other cases, interval and other interval overlap.
     *
     * PRECONDITIONS: checks for nonnull interval
     * 
     * POSTCONDITIONS: determines if intervals overlap
     *
     * @throws IllegalArgumentException if other interval is null
     * @param other the new interval to compare with interval
     * @return true if overlaps, false otherwise
     */
    @Override
    public boolean overlaps(IntervalADT<T> other) {
    	if (this.getEnd().compareTo(other.getStart()) < 0 || other.getEnd().compareTo(this.getStart()) < 0)
    		return false;
    	return true;
    }
	/**
	 * Returns true if given point lies inside the interval.
	 * 
	 * @param point
	 *            to search
	 * @return true if it contains the point
	 */
    @Override
    public boolean contains(T point) {
    	if (point.compareTo(this.getStart()) >= 0 && point.compareTo(this.getEnd()) <= 0)
    		return true;
    	return false;
    }
	/**
	 * Compares this interval with the other and return a negative value 
	 * if this interval comes before the "other" interval.  Intervals 
	 * are compared first on their start time.  The end time is only considered
	 * if the start time is the same.
	 * 
	 * <p>For example, if start times are different:</p>
	 * 
	 * <pre>
	 * [0,1] compared to [2,3]: returns -1 because 0 is before 2
	 * [2,3] compared to [0,1]: return 1 because 2 is after 0
	 * [0,4] compared to [2,3]: return -1 because 0 is before 2
	 * [2,3] compared to [0,4]: return 1 because 2 is after 0
	 * [0,3] compared to [2,4]: return -1 because 0 is before 2
	 * [2,4] compared to [0,3]: return 1 because 2 is after 0
	 * </pre>
	 * 
	 * <p>If start times are the same, compare based on end time:</p>
	 * <pre>
	 * [0,3] compared to [0,4]: return -1 because start is same and 3 is before 4
	 * [0,4] compared to [0,3]: return 1 because start is same and 4 is after 3</pre>
	 * 
	 * <p>If start times and end times are same, return 0</p>
	 * <pre>[0,4] compared to [0,4]: return 0</pre>
	 *
	 * @param other
	 *            the second interval to which compare this interval with
	 *            
	 * @return negative if this interval's comes before the other interval, 
	 * positive if this interval comes after the other interval,
	 * and 0 if the intervals are the same.  See above for details.
	 */
    @Override
    public int compareTo(IntervalADT<T> other) {
        if (other.getStart().compareTo(this.getStart())
    }
	    	/**
	 * Returns a specific string representation of the interval. It must return
	 * the interval in this form.
	 * 
	 *  <p>For example: If the interval's label is p1 and the start is 24 and the end is 45,
	 *  then the string returned is:</p>
	 *  
	 *  <pre>p1 [24, 45]</pre>
	 */
    @Override
	public String toString()  {
    }

}
