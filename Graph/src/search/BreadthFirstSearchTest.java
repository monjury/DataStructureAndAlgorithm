package search;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import representation.Node;

public class BreadthFirstSearchTest {

	protected BreadthFirstSearch<Character> bfs;
	protected Node<Character> a;
	protected Node<Character> b;
	protected Node<Character> c;
	protected Node<Character> d;
	protected Node<Character> e;
	protected Node<Character> f;
	protected Node<Character> g;
	protected Node<Character> h;

	@Before
	public void setUp() {
		bfs = new BreadthFirstSearch<Character>();
		a = new Node<Character>('A');
		b = new Node<Character>('B');
		c = new Node<Character>('C');
		d = new Node<Character>('D');
		e = new Node<Character>('E');
		f = new Node<Character>('F');
		g = new Node<Character>('G');
		h = new Node<Character>('H');
	}

	@Test
	public void testBfs() {
		a.addNeighbors(Arrays.asList(b, d, g));
		b.addNeighbors(Arrays.asList(a, e, f));
		c.addNeighbors(Arrays.asList(f, h));
		d.addNeighbors(Arrays.asList(a, f));
		e.addNeighbors(Arrays.asList(b, g));
		f.addNeighbors(Arrays.asList(b, c, d));
		g.addNeighbors(Arrays.asList(a, e));
		h.addNeighbors(Arrays.asList(c));
		bfs.traverse(a);
	}
}
