#include <stdio.h>

void Recursive(int num)
{

	if (num <= 0)
		return;
	printf("Recursive call! %d \n", num);
	Recursive(num - 1);
}

int Factorial(int n)
{
	if (n == 0)
		return 1;
	else
		return n * Factorial(n - 1);
}

int main(void)
{

	printf("1! = %d \n", Factorial(1));
	printf("2! = %d \n", Factorial(2));
	printf("3! = %d \n", Factorial(3));
	printf("4! = %d \n", Factorial(4));
	printf("9! = %d \n", Factorial(9));
	return 0;
	Recursive(3);
	return 0;
}

// 재귀함수는 자료구조나 알고리즘의 어려운 문제를 단순화 하는데 사용되는 중요한 무기이다. 