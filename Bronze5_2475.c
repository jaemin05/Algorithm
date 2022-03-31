#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {
	
	int num;
	int result = 0;

	for (int i = 0; i < 5; i++) {
		scanf("%d", &num);

		result += pow(num, 2);
	}

	printf("%d", result % 10);
}