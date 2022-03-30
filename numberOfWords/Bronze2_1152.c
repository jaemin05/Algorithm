#include<stdio.h>
#pragma warning(disable:4996)

char str[1000000];

int main() {

	int cnt = 0;

	while (scanf("%s", str) != EOF) cnt++;

	printf("%d", cnt);
}