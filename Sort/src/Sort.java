	public class Sort {
		    public static void main(String[] args) {
		        int[] A = {5, 2, 4, 6, 1, 3, 2, 6};
		        System.out.print("Массив до сортировки: ");
		        for (int i = 0; i < A.length; i++)
		            System.out.print(A[i] + " ");
		        System.out.println("");
		        A = sort(A);
		        System.out.print("Массив после сортировки: ");
		        for (int i = 0; i < A.length; i++)
		            System.out.print(A[i] + " ");
		    }

		    private static int[] sort(int[] A) {
		    	if (A == null) {
		            return null;
		    	}
		    	 if (A.length < 2) {
		             return A;
		    	}
		        sort(A, 1, A.length);
				return A;
		    }

		    private static void sort(int[] A, int p, int r) {
		    	if (p >= r-1)
		            return;

		        int q = p + (r - p)/2;

		        sort(A, p, q);
		        sort(A, q+1, r);
		        merge(A, p, q, r);
		    }
		    
		    private static void merge(int[] A, int p, int q, int r) {
		        int[] copyA = new int[r - p];

		        int currentIndex = 0;

		        for (int i = p, k = q; i < q || k < r; ) {
		            if (i == q) {
		                while (k < r)
		                copyA[currentIndex++] = A[k++];
		                break;
		            }

		            if (k == r) {
		                while (i < q)
		                copyA[currentIndex++] = A[i++];
		                break;
		            }

		            if (A[i] < A[k])
		                copyA[currentIndex++] = A[i++];
		            else
		                copyA[currentIndex++] = A[k++];
		        }

		        for (int i = p, c = 0; i < r && c < copyA.length; i++, c++)
		            A[i] = copyA[c];
		    }
}