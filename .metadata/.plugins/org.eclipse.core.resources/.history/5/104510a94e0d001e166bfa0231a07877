package com.java.programs;

import java.util.Scanner;

public class BestScore {

	public int[] findBestscore(int arr[]) {
		int firstBestScore = Integer.MIN_VALUE;
		int secondBestScore = Integer.MIN_VALUE;
		for (int score : arr) {
			if (score > firstBestScore) {
				secondBestScore = firstBestScore;
				firstBestScore = score;
			} else if (score > secondBestScore && score < firstBestScore) {
				secondBestScore = score;
			}

		}

		return new int[] { firstBestScore, secondBestScore };
	}

	public void displayScore(int scoreArray[]) {
		BestScore bestScore = new BestScore();
		int newScoreArray[] = bestScore.findBestscore(scoreArray);
		for(int i=0;i<newScoreArray.length;i++)
		{
			System.out.print(newScoreArray[i]);
		}
	}
	
	public static void main(String[] args) {
		int size = 5;
		// TODO Auto-generated method stub
		OneDimentionalArray oneDArray = new OneDimentionalArray(size);
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < oneDArray.arr.length; i++) {
				oneDArray.arr[i] = sc.nextInt();
			}
		}
		BestScore bestScore = new BestScore();
		bestScore.displayScore(oneDArray.arr);

	}

}
