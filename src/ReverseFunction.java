
public class ReverseFunction {
	public static void main(String[] args) {
		int[] myList = new int[20];

		for (int i = 0; i < myList.length; i++) {
			myList[i] = i + 1;
		}

		// We see the elements of myList1
		for (int i = 0; i < myList.length; i++) {
			System.out.println("myList[" + i + "]=" + myList[i]);
		}

		reverse(myList);
		
		System.out.println("\nThe New List:\n-------------");
		for(int i=0;i<myList.length;i++) {
			System.out.println("myList[" + i + "]=" + myList[i]);
		}
	}

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];

		for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
			result[i] = list[j];

		}
		for(int i=0;i<list.length;i++) {
			list[i] = result[i];

		}

		return list;
	}
}
