
public class Interval<T extends Comparable<T>> implements IntervalADT<T> {

    // TODO declare any needed data members
	T key;
	T start;
	T end;
	String label;

    public Interval(T start, T end, String label) {
        // TODO Auto-generated constructor stub
    	this.start=start;
    	this.end=end;
    	this.label=label;
    }

    @Override
    public T getStart() {
        // TODO Auto-generated method stub
    	return start;
    }

    @Override
    public T getEnd() {
        // TODO Auto-generated method stub
    	return end;
    }

    @Override
    public String getLabel() {
        // TODO Auto-generated method stub
    	return label;
    }

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

    @Override
    public boolean contains(T point) {
        // TODO Auto-generated method stub
    }

    @Override
    public int compareTo(IntervalADT<T> other) {
        // TODO Auto-generated method stub
    }

}
