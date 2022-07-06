#include <stdio.h>
#pragma warning(disable:4996)

int main() {

	int input;
	int num;
	int result = 0;

	scanf("%d", &input);

	for (int i = 0; i < input; i++) {
		scanf("%1d", &num);
		result += num;
	}

	printf("%d", result);
}