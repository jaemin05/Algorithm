#include <stdio.h>
#pragma warning(disable:4996)

int main() {

	int x, y;

	scanf("%d %d", &x, &y);
	
	x > y ? printf(">") : x == y ? printf("==") : printf("<");
}