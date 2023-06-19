package day5;

public class Calc {
	int x;
	int y;

	void message(){
		System.out.println("안녕하세요");
	}
	public String message2(){
		return 	"안녕하세요2";
	}	

	void sum(int x, int y){
		System.out.println(x+y);
	}
	int sum2(int x, int y){
		return x+y;
	}
	double sum2(double x, double y){
		return x+y;
	}

	void max(int c, int d){
		System.out.println("두개의 숫자 중 큰 수는 "+((c>=d) ? c:d));
	}

	void arr1(int[] arr){//배열은 레퍼런스로 관리되기 때문에 리턴값이 없이 void사용
		int max=0;
		int min=0;
		//int arr[]={3, 2, 6, 5, 4};
		for(int i=1; i<arr.length; i++){
			if(arr[max]<arr[i]){//큰수찾기
				max=i; // 위치값을 저장해야 서로 바꿀수있다.
			}
			if(arr[min]>arr[i]){
				min=i; //1 //위치값저장
			}
		}
		int temp=arr[max];
		arr[max]=arr[min];
		arr[min]=temp;
	}
	void arr2(int[] arr){
		//가장 작은 숫자와 마지막 배열 값과 위치 바꾸기
		int min=0;
		//int count=0;
		//int arr[]={3, 2, 6, 5, 4};
		for(int i=1; i<arr.length; i++){
			if(arr[min]>arr[i]){
				min=i;
			}
//			count++;
		}
		int temp=arr[min];
		arr[min]=arr[arr.length-1];
		arr[arr.length-1]=temp;
	}

}
