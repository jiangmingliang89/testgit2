package abc;

import java.util.ArrayList;
import java.util.List;

public class Arrlsit {

	public static void main(String[] args) {
		//ð������  �Ż�
		//��������  �Ƚϴ��� c=n-1;  ð��������õ�ʱ�临�Ӷ�ΪO(n)��
		//���Ƿ���  �Ƚϴ���c=n(n-1)/2   ð����������ʱ�临�Ӷ�ΪO(n*n)
		int []arr =new int[] {1,3,0,4,5};
		
		for(int i=0;i<arr.length;i++) {
			int  falg=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1] ){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					falg=1;
				}
			}
			if(falg==0) {
				System.out.println(333);
			
			}
		}
		
		for(int n:arr) {
			{ System.out.println(n); }	
		}
		
		
	}

}
