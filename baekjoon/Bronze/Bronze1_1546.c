#include <stdio.h>
#pragma warning(disable:4996)

double arr[1000];

int main() {

	int num;
	double result = 0;
	int max = 0;

	scanf("%d", &num);

	for (int i = 0; i < num; i++) {
		scanf("%lf", &arr[i]);
		if (arr[i] > max) max = arr[i];
	}

	for (int j = 0; j < num; j++) {
		result += arr[j]/max*100;
	}

	printf("%lf", result / num);
}
