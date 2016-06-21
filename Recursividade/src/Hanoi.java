

import java.util.Stack;

public class Hanoi {

	private void moveDisk(Stack<Integer> a, Stack<Integer> b) {
		int disk;
		
		if (a.empty()) {
			disk = b.pop();
			a.push(disk);
		} else if (b.empty()) {
			disk = a.pop();
			b.push(disk);
		} else if (a.peek() > b.peek()) {
			disk = b.pop();
			a.push(disk);
		} else {
			disk = a.pop();
			b.push(disk);
		}
	}
	
	public void solve(Integer numDisk) {
		
		int numMoves = ((int) Math.pow(2.0, numDisk.doubleValue())) - 1;
		Stack<Integer> src = new Stack<Integer>();
		Stack<Integer> aux = new Stack<Integer>();
		Stack<Integer> dst = new Stack<Integer>();
		
		for (int i = numDisk; i > 0; i--) {
			src.push(i);
		}		
		
		for (int i = 0; i < numMoves; i++) {
			if (i % 3 == 0) {
				moveDisk(src, dst);
			} else if (i % 3 == 1) {
				moveDisk(src, aux);
			} else if (i % 3 == 2) {
				moveDisk(aux, dst);
			}
		}
	}
	
}