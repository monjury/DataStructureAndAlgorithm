package search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import representation.Node;

public class BreadthFirstSearchAnalysedTest {

	protected BreadthFirstSearchAnalysed<Character> bfs;
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
		bfs = new BreadthFirstSearchAnalysed<Character>();
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
		List<Node<Character>> actual = bfs.result;
		List<Node<Character>> expected = new ArrayList<Node<Character>>();
		expected.add(a);
		expected.add(b);
		expected.add(d);
		expected.add(g);
		expected.add(e);
		expected.add(f);
		expected.add(c);
		expected.add(h);
		Assert.assertEquals(expected, actual);
	}
}
