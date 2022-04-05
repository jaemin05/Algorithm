#include <stdio.h>
#pragma warning(disable:4996)

int main() {
	
	int result;
	char str[100];
	int arr[26];

	scanf("%s", str);

	for (int i = 0; i < 26; i++) {
		arr[i] = -1;
	}

	for (int j = 0; str[j]; j++) {
		result = j;

		if(arr[str[j] - 'a'] == -1) 
			arr[str[j] - 'a'] = result;
	}

	for (int k = 0; k < 26; k++) {
		printf("%d ", arr[k]);
	}
}