package com.lihl.iterator;

public class ConcreteMyIterator implements MyIterator {
	private ConcreteAggregate aggregate;

	public ConcreteMyIterator(ConcreteAggregate aggregate) {
		super();
		this.aggregate = aggregate;
	}

	private int cursor;

	@Override
	public void first() {
		cursor = 0;
	}

	@Override
	public void last() {
		cursor = aggregate.getList().size() - 1;
	}

	@Override
	public void next() {
		cursor++;
	}

	@Override
	public boolean hasNext() {
		return cursor < aggregate.getList().size();
	}

	@Override
	public Object currentObject() {
		return aggregate.getList().get(cursor);
	}

}
