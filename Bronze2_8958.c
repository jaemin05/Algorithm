#include <stdio.h>
#pragma warning(disable:4996)

int main() {
	
	int num, a, sum;
	char str[81];

	scanf("%d", &num);

	for (int i = 0; i < num; i++) {
		scanf("%s", str);

		a = 0;
		sum = 0;

		for (int j = 0; str[j]; j++) {
			if (str[j] == 'O')
				sum += ++a;
			else
				a = 0;
		}

		printf("%d\n", sum);
	}
}