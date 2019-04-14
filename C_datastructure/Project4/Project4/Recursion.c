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

int Fibo(int n)
{
	if (n == 1)
		return 0;
	else if (n == 2)
		return 1;
	else
		return Fibo(n - 1) + Fibo(n - 2);
}

int BSearchRecur(int ar[], int first, int last, int target)
{
	int mid;
	if (first > last)
		return -1;
	mid = (first + last) / 2;

	if (ar[mid] == target)
		return mid;
	else if (target < ar[mid])
		return BSearchRecur(ar, first, mid - 1, target);
	else
		return BSearchRecur(ar, mid + 1, last, target);
}


void HanoiTowerMove(int num, char from, char by, char to)
{
	if (num==1)
	{
		printf("원반1을 %c에서 %c로 이동 \n", from, to);
	}
	else
	{
		HanoiTowerMove(num - 1, from, to, by);
		printf("원반%d을 %c에서 %c로 이동 \n", num, from, to);
		HanoiTowerMove(num - 1, by, from, to);
	}
}


int main(void)

{	// 1. Recursive(3);

	// 2. Factorial

	//printf("1! = %d \n", Factorial(1));
	//printf("2! = %d \n", Factorial(2));
	//printf("3! = %d \n", Factorial(3));
	//printf("4! = %d \n", Factorial(4));
	//printf("9! = %d \n", Factorial(9));
	
	// 3. Fibo
	/*int i;
	for (i = 1; i < 15; i++)
		printf("%d ", Fibo(i));*/


	// 4. BSearchRecur

	/*int arr[] = { 1,3,5,7,9 };
	int idx;

	idx = BSearchRecur(arr, 0, sizeof(arr) / sizeof(int) - 1, 7);
	if (idx == -1)
		printf("탐색 실패 \n");
	else
		printf("타겟 저장 인덱스: %d \n", idx);

	idx = BSearchRecur(arr, 0, sizeof(arr) / sizeof(int) - 1, 4);
	if (idx == -1)
		printf("탐색 실패 \n");
	else
		printf("타겟 저장 인덱스: %d \n", idx);*/


	// 5. HanoiTowerMove

	HanoiTowerMove(3, 'A', 'B', 'C');
	system("pause");

	return 0;
}

// 재귀함수는 자료구조나 알고리즘의 어려운 문제를 단순화 하는데 사용되는 중요한 무기이다. 