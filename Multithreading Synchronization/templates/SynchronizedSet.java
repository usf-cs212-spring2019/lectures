import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

public class SynchronizedSet<E> extends IndexedSet<E> {

	public SynchronizedSet() {
		this(false);
	}

	public SynchronizedSet(boolean sorted) {
		super(sorted);
	}

	@Override
	public boolean add(E element) {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public boolean addAll(Collection<E> elements) {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public int size() {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public boolean contains(E element) {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public E get(int index) {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public String toString() {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public Set<E> unsortedCopy() {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}

	@Override
	public SortedSet<E> sortedCopy() {
		// TODO
		throw new UnsupportedOperationException("Not yet implemented");
	}
}
