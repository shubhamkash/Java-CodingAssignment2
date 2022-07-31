package assignment.gl1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import assignment.gl1.services.ConstructionOrder;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int numberOfFloors = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < numberOfFloors; i++) {
			System.out.println("Enter the floor size given on day : "+ (i+1));
			q.add(sc.nextInt());
		}
		int[] floorSizes = new int[numberOfFloors];
		for (int i = 0; i < numberOfFloors; i++) {
			floorSizes[i] = q.remove();
		}
		sc.close();
		
		ConstructionOrder constOrder = new ConstructionOrder();
		constOrder.ConstOrder(floorSizes, numberOfFloors);
	}
}
