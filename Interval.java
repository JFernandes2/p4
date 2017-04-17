
public class Interval<T extends Comparable<T>> implements IntervalADT<T> {

    // TODO declare any needed data members
	private T start;
	private T end;
	private String label;

    public Interval(T start, T end, String label) {
    	this.start = start;
    	this.end = end;
    	this.label = label;
    }

    @Override
    public T getStart() {
        return start;
    }

    @Override
    public T getEnd() {
        return end;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public boolean overlaps(IntervalADT<T> other) {
    	if (this.getEnd().compareTo(other.getStart()) < 0 || other.getEnd().compareTo(this.getStart()) < 0)
    		return false;
    	return true;
    }

    @Override
    public boolean contains(T point) {
    	if (point.compareTo(this.getStart()) >= 0 && point.compareTo(this.getEnd()) <= 0)
    		return true;
    	return false;
    }

    @Override
    public int compareTo(IntervalADT<T> other) {
        if (other.getStart().compareTo(this.getStart())
    }
    @Override
	public String toString()  {
    	
    }

}
