import java.io.IOException;
import java.io.Serializable;

/**
    Represents inclusive integer range.
*/
class Range implements Serializable {

	private static final long serialVersionUID = 1L;

	/** @serial */
	private final int from;
	/** @serial */
	private final int to;

	/**
	 * Creates Range.
	 * 
	 * @param from start 
	 * @param to end
	 * @throws IllegalArgumentException if start is greater than end. 
	 */
	public Range(int from, int to) {
		if (from > to) {
			throw new IllegalArgumentException("Start is greater than end");
		}
		this.from = from;
		this.to = to;
	}

	private void writeObject(java.io.ObjectOutputStream stream)
		throws IOException {
		stream.defaultWriteObject();
	}

	private void readObject(java.io.ObjectInputStream stream)
		throws IOException, ClassNotFoundException {
		stream.defaultReadObject();
		if (from > to) {
			throw new IllegalArgumentException("Start is greater than end");
		}
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

}
