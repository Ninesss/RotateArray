public class RotateArray {
	public static void solution(int[] A, int N, int K) {
        int[] res = new int[N];
        for(int i = 0; i < N; ++i){
            res[i] = A[i];
        }
        int j = N-K%N;
        for(int i = 0; i < K%N; ++i){
            A[i] = res[j];
            j++;
        }
        int s = 0;
        for(int i = K%N; i < N; ++i){
            A[i] = res[s];
            s++;
        }
	}

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5,6,7,8,9};
		solution(A,9,3);
		for(int i = 0; i < A.length ; ++i) {
			System.out.print(A[i]);
		}
	}
}
