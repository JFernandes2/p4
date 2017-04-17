// Semester:         CS367 Spring 2017 
// PROJECT:          p4
// FILE:             Interval.java
//
// TEAM:    Team 42a
// Authors: Jessica Fernandes, Aseel Albeshri
// Author1: (Jessica Fernandes,jfernandes2@wisc.edu,jfernandes2,lecture 02)
// Author2: (Aseel Albeshri,albeshri@wisc.edu,albeshri,lecture 02)
/**
 * (Write a succinct description of this class here. You should avoid
 * wordiness and redundancy. If necessary, additional paragraphs should
 * be preceded by <p>, the html tag for a new paragraph.)
 *
 * <p>Bugs: (a list of bugs and other problems)
 *
 * @author Jessica Fernandes, Aseel Albeshri
 */
public class Interval<T extends Comparable<T>> implements IntervalADT<T> {

    // TODO declare any needed data members
	private T key;
	private T start;
	private T end;
	private String label;

	/**
	 * Interval class 
	 *
	 * @param T start is the interval's start value
	 * @param T end is the interval's end value
	 * @param String label is the label assigned to the interval
	 * @return start, end, label of interval
	 */
    public Interval(T start, T end, String label) {
        // TODO Auto-generated constructor stub
    	this.start=start;
    	this.end=end;
    	this.label=label;
    }
    /**
     * getStart returns the interval's start value
     * @return start value of type T of interval
     */
    @Override
    public T getStart() {
        // TODO Auto-generated method stub
    	return start;
    }
    /**
     * getEnd returns the interval's end value.
     * @return end value of type T of interval
     */
    @Override
    public T getEnd() {
        // TODO Auto-generated method stub
    	return end;
    }
    /**
     * getLabel returns interval's label
     * @return label of type String of interval
     */
    @Override
    public String getLabel() {
        // TODO Auto-generated method stub
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
    public boolean overlaps(IntervalADT<T> other) throws IllegalArgumentException {
        // TODO Auto-generated method stub
    	overlaps=false;
    	
    	if(other==null) throw IllegalArguementException;
    	
    	interval.getStart()=a;
    	interval.getEnd()=b;
    	other.getStart()=c;
    	other.getEnd()=d;
    	
    	if(b<c || d<a)
    		false;
    	else
    		true;
    	return boolean overlaps;
    	
    }
    /**
     * (Write a succinct description of this method here.  If necessary,
     * additional paragraphs should be preceded by <p>, the html tag for
     * a new paragraph.)
     *
     * PRECONDITIONS: (i.e. the incoming list is assumed to be non-null)
     * 
     * POSTCONDITIONS: (i.e. the incoming list has been reordered)
     *
     * @param (parameter name) (Describe the first parameter here)
     * @param (parameter name) (Do the same for each additional parameter)
     * @return (description of the return value)
     */
    @Override
    public boolean contains(T point) {
        // TODO Auto-generated method stub
    }
    /**
     * (Write a succinct description of this method here.  If necessary,
     * additional paragraphs should be preceded by <p>, the html tag for
     * a new paragraph.)
     *
     * PRECONDITIONS: (i.e. the incoming list is assumed to be non-null)
     * 
     * POSTCONDITIONS: (i.e. the incoming list has been reordered)
     *
     * @param (parameter name) (Describe the first parameter here)
     * @param (parameter name) (Do the same for each additional parameter)
     * @return (description of the return value)
     */
    @Override
    public int compareTo(IntervalADT<T> other) {
        // TODO Auto-generated method stub
    }

}
