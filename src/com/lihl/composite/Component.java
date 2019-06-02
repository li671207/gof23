package com.lihl.composite;

public interface Component {
	
	void operation();

}

interface Composite extends Component {
	
	void add(Component component);
	void remove(Component component);
	void getChild(int index);
	void operation();

}


interface Leaf extends Component {
	
	void operation();

}
