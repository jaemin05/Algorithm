#include<stdio.h>
#include<string.h>
#include<stdlib.h>

char n[100001];

int compare(const void* a, const void* b) {
	const char* n1 = (const char*)a;
	const char* n2 = (const char*)b;
	if (*n1 > *n2) {
		return -1;
	}
	else if (*n1 == *n2) {
		return 0;
	}
	else {
		return 1;
	}
}

int main() {
	int sum = 0;
	int i = 0;
	scanf("%s", n);
    if (strchr(n, '0') == NULL) {
        printf("-1");
        return 0;
	}
	while (n[i] != NULL) {
		sum += n[i] - 48;
		i++;
	}
	if (sum % 3 != 0) {
		printf("-1");
        return 0;
	}
	else {
		qsort(n, sizeof(n)-1, sizeof(char), compare);
	}
	printf("%s", n);
    return 0;
}
