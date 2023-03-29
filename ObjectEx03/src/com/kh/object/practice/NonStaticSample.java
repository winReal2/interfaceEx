package com.kh.object.practice;

public class NonStaticSample {
	public void printLottoNumbers() {
		// 1~45까지의 임의의 정수 출력, 중복제거, 정렬하기
		
		// 0 <=random < 1
		// 0 <=random < 45
		// 1 <=random < 46      즉, random = 1 ~ 45
		// int num = (int)(Math.random() * 45 + 1);
		
		// 6개의 수를 저장할 공간을 생성
		int[] lotto = new int[6];
		// i : 0~5
		for(int i=0;i<lotto.length; i++) {
			// 새로운 임의의 수를 생성하여 배열에 저장
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			// 중복체크 / 동일한 숫자가 입력되었는지 체크
			// i = 0
			// j = 0,1,2,3,4,5           
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
		}
		// 방을 바꿀 때 필요한 저장공간을 생성
		int temp = 0;
		// 순서대로 정렬하기
		for(int i=0; i<lotto.length; i++ ) {
			// 오름차순, 내림차순
			for(int j=i; j<lotto.length;j++) {  //i를 0으로하면 내림차순됨
				if(lotto[i] > lotto[j]) {
					// 방바꾸기
					temp = lotto[i];
					// 작은 수가 앞으로 올 수 있도록 자리바꿈
					lotto [i] = lotto[j];
					// 큰 수를 뒤로 이동
					lotto [j] = temp;
					
				}
				// 방바꾸기
			}
		}
		// 반복문을 활용하여 배열을 출력
		System.out.println("Lotto Number");
		for(int num : lotto) {
			System.out.print (num + " ");
		}
		System.out.println();
	}
	
	public void outputChar(int num, char c) {
		//입력받은 숫자만큼 반복문을 실행
		for(int i =0; i<num;i++) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	public char alphabette() {
		// 문자코드  A~Z=65~90, a~z=97~122  
		// 91~96번까지 처리(if문, while문으로 제외하는 처리) 
		// 91번부터 96번사이의 수가 나오면 다시 뽑을 수 있도록 함
		// 임의의 수를 생성
		// 숫자를 추출해서 char타입으로 변환
		// 65~122
		// 1~122
		// *n을 했을 때 랜덤의 범위
		// 0 ~ n-1
		// 65 <= ramdom < 122+1
		// 0 <= random < 1
		// * 122 + 1
		// 1~122
		// 66~187
		// 범위 : 122+1-65
		int num = (int)(Math.random()*58+65);
		System.out.println((char) num);
		return (char) num;
	}
	public String mySubstring(String str, int index1, int index2) {
		// 문자열의 인덱스값을 이용하여 문자열을 추출
		// 시작인덱스는 포함하고, 끝인덱스는 미포함
		// 문자열 추출시 이용
		System.out.println(str.substring(index1, index2));
		return str.substring(index1, index2);
	}
	
	
}
