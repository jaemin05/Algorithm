#include <stdio.h>
#pragma warning(disable : 4996)

int main() {

	int num;
	int repeat;
	int index;
	char str[20];

	scanf("%d", &num);

	for (int i = 0; i < num; i++) {
		scanf("%d %s", &repeat, str);
 
		for (int k = 0; str[k] != '\0'; k++) {
			for (int j = 0; j < repeat; j++) {
				printf("%c", str[k]);
			}
		}
		printf("\n");
	}
}