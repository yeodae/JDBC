package day3;

public class Calc {
	void sum(){
		System.out.println("void sum 호출");
	}

	int sum2(int a, int b){ //
		return a+b;
	}
	int max(int a, int b){
		return Math.max(a, b);//최대값을 리턴해준다.
		//return (a >= b) ? a : b; //삼항연산자
	}
	int min(int a, int b){
		return Math.min(a, b);//최소값을 리턴해준다.
	}
	int abs(int a){
		return Math.abs(a); //절대값을 리턴해준다.
		//return (a >= 0) ? a : -a;//삼항연산자
	}
	int min(int a, int b, int c){ 
		//매개변수 수에따라 오버로딩되어 사용가능
		return (min(a,b) >= c) ? c : min(a,b);
		//		if(a<=b && a<=c){
		//			return a;
		//		}else if(b<=c && b<=a){
		//			return b;
		//		}else{
		//			return c;
		//		}
	}
	double sum2(double a, double b){//오버로딩:sum2
		return a+b;
	}
	int arrMax(int[] arr){ // 배열에서 가장큰수 구하기
		int max= arr[0];
		for(int num : arr){
			max = Math.max(max,num);
		}
		return max;
	}

	double arrAvg(int[] arr){ //배열의 합 나누기
		double avg=arr[0];
		int sum=0;
		//		for(int i=0; i<arr.length; i++){
		//			sum+=arr[i];
		//		}
		//		avg=(double)sum/arr.length;
		//		return avg;
		for(int i:arr){
			sum += i;
			avg= (double)sum/arr.length;
		}
		return avg;
	}
	void test1(int a){
		a = a+1; //리턴해주지않아 별개의 영역으로 11이되어 끝.
	}
	void test2(int[] arr){ //객체(레퍼런스)는 주소를 갖고있는데 
		arr[0] = 100; // 배열은 같은 주소를 사용하기에 넘어간다.
	}

}

