package queue;

public class Run {

	public static void main(String[] args) {
		QueueCustomImp<Integer> testQ = new QueueCustomImp<Integer>();
		testQ.add(1);
		testQ.add(2);
		testQ.add(3);
		System.out.println(testQ.pop());
		testQ.add(4);
		System.out.println(testQ.pop());
		System.out.println(testQ.peek());
		testQ.add(5);
	}

}
