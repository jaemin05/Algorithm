#include <stdio.h>
#pragma warning(disable : 4996)

int main() {

	int num;
	int sum = 1;
	int arr[10] = {0};

	for (int i = 0; i < 3; i++) {
		scanf("%d", &num);
		sum *= num;
	}

	for (int j = 0; sum; j++) {
		arr[sum % 10]++;
		sum /= 10;
	}

	for (int k = 0; k < 10; k++) printf("%d ", arr[k]);
}