#include <stdio.h>
#include <math.h>
#pragma warning(disable:4996)

int main() {
	
	int arr[9];
	int max = 0;
	int index;

	for (int i = 0; i < 9; i++) {
		scanf("%d", &arr[i]);
		if (arr[i] > max) {
			max = arr[i];
			index = i+1;
		}
	}
	
	printf("%d\n%d", max, index);
}