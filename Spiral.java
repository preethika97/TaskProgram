package Task;

import java.util.*;

public class Spiral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Limit: ");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		int i = 0, j = 0, val = 1;
		while (i == 0 && j < n) {
			a[i][j] = val++;
			j++;
		} // i=0,j=5
		i++;
		j--;
		while (i < n && j == n - 1) {
			a[i][j] = val++;
			i++;
		} // i=5,j=4
		i--;
		j = n - 2;
		while (i == n - 1 && j >= 0) {
			a[i][j] = val++;
			j--;
		} // i=4,j=0
		i = n - 2;
		j = 0;
		while (i >= 1 && j == 0) {
			a[i][j] = val++;
			i--;
		} // i=1,j=0
		i = 1;
		j = 1;
		while (i == 1 && j < n - 1) {
			a[i][j] = val++;
			j++;
		} // i=1,j=3
		i++;
		j = 3;
		while (i <= n - 2 && j == 3) {
			a[i][j] = val++;
			i++;
		} // i=3,j=3
		i = 3;
		j--;
		while (i == 3 && j >= 1) {
			a[i][j] = val++;
			j--;
		} // i=3,j=1
		i--;
		j = 1;
		while (i >= 2 && j == 1) {
			a[i][j] = val++;
			i--;
		}
		a[++i][++j] = val;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print(a[i][j] + "    ");
			}
			System.out.println();
		}
	}
}
