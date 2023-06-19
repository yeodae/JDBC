package day2;
import java.util.Arrays;
import java.util.Scanner;
//1.3의배수 구구단 만들기
public class Gugudan3 {
	public static void main(String[] args) {
		//		for(int i=2; i<10; i++){
		//			for(int j=1; j<10; j++){
		//				if(i%3==0){
		//					System.out.print(i+"x"+j+"="+i*j);
		//				}
		//			}
		//		}//for-end

		//
		//2.0이 입력되기 전까지 입력된 숫자들 더하기(음수입력시 다시 입력하도록)
		//		Scanner s=new Scanner(System.in);
		//		System.out.println("계산할 숫자를 넣은후 0을눌러 합산합니다.");
		//		int sum=0;
		//
		//		while(true){
		//			int num=s.nextInt();					
		//			if(num==0){
		//				System.out.println("입력된 총 합 : "+sum);
		//				break;
		//			}else if(num<0){
		//				System.out.println("양수만 입력해주세요.");
		//			}else if(num>0){
		//				sum+=num;
		//			}
		//		}
		//
		//3.배열 {10,-20,30,40,50}의 음수를 제외한 평균값 구하기
		//		int arr[]={10,-20,30,40,50};
		//		double num=0;
		//		int count=0;
		//
		//		for(int i=0; i<arr.length; i++){
		//			if(arr[i]>0){
		//				num+=arr[i];
		//				count++;
		//			}//모든 양수의합
		//		}//for-end
		//		double avg=num/count;
		//		System.out.println("총합의 평균 : "+avg);
		//
		//4.5개의 숫자를 입력받아 배열에 넣기. 단, 음수의 경우 제외
		//		Scanner s=new Scanner(System.in);
		//	
		//		int arr[] = new int[5];
		//		
		//		for(int i=0; i<arr.length; i++){
		//			System.out.println("숫자입력");
		//			int ra=s.nextInt();
		//			if(ra>0){
		//				arr[i]=ra;
		//			}else{
		//				System.out.println("양수만 입력해주세요.");
		//				i--;
		//			}
		//		}
		//		System.out.println(Arrays.toString(arr));
		//
		//5.이전 실습에서 진행한 선택정렬 완성하기.
		//		int arr[] = {7,6,9,3,5};
		//		int temp=0;
		//
		//		for(int i=0; i<arr.length; i++){
		//			for(int j=i+1; j<arr.length; j++){
		//				if(arr[i]>arr[j]){
		//					temp=arr[i];
		//					arr[i]=arr[j];
		//					arr[j]=temp;
		//				}//버블정렬
		//			}	
		//		}		
		//		for(int i=0; i<arr.length; i++){
		//			int index=i; // i=0
		//			for(int j=i+1; j<arr.length; j++){
		//				if(arr[index]>arr[j]){
		//					index=j;//index=1
		//				}
		//			}
		//			int temp=arr[index];//최소값 저장
		//			arr[index]=arr[i];//기존값저장
		//			arr[i]=temp;
		//		}//선택정렬
		//
		//		System.out.println(Arrays.toString(arr));
		//
		//6.배열에서 중복제거
		int arr[]={30,20,60,0,25,20,60,0,10,30};
		int count=0;
		int temp=0;
		
		for(int i=0; i<arr.length; i++){
			int index=i;
			for(int j=i+1; j<arr.length; j++)
				
				if(arr[i]==arr[j]){
					count++;
					
				}else{
					index=j;
				}
			temp=arr[i];//중복값 i를 temp저장
			arr[i]=arr[index];//중복값 j를 i위치로
			arr[index]=temp;
			int arr2[]= new int[count];
			System.out.println(Arrays.toString(arr2));
		}
		
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
	}
}
