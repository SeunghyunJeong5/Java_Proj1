package chapter04.ex06;

import java.util.Scanner;

public class SSS {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int i, a, cnt = 0;

		for( i=1; i<=10; i++)
		{
			a = scn.nextInt();

			if(a==0)
			{
				continue;
			}
			if(a%2==0)
			{
				cnt++;
			}
		}

		System.out.printf("입력받은 짝수는 %d개입니다.", cnt);
	}
	}

