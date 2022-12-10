package com.azamon;

public class Players {
	
	public static int solve_function(int[] scores) {
		int medalCount = 0;

		int[] medals = new int[scores.length];

		for (int i = 0; i < scores.length; i++) {
			medals[i] = 1;
			for (int j = i; j > 0; j--) {
				if (scores[j] < scores[j - 1]) {
					if (medals[j] > 1)
						medals[j]--;
					medals[j - 1] = medals[j] + 1;
				}
				if (scores[j] > scores[j - 1]) {
					if ((medals[j] <= medals[j - 1])) {
						medals[j]= medals[j-1]+1;
					}
				}
				if (scores[j] == scores[j - 1]) {
					medals[j] = 1;
				}

			}
		}

		for(int i =0 ; i<medals.length; i++) {
			medalCount = medalCount+medals[i];
		}
		return medalCount;
	}

	public int[] rearrangeMedals(int[] medals, int score, int index) {

		return medals;
	}

	public static void main(String[] args) {

		int[] arr = {0,2,3,1,5,0,0,1,2,1,3,4,5};
		System.out.println(Players.solve_function(arr));

	}


}
