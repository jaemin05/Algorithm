#include <stdio.h>
#pragma warning(disable:4996)

char str[1000000];

int main() {
	
	int arr[26] = {0};
	int cnt = 0;
	int index = 0;
	int check = 0;

	scanf("%s", str);

	//'\0'은 문자열의 끝을 의미한다.
	for (int i = 0; str[i] != '\0'; i++) {
		if (str[i] >= 'A' && str[i] <= 'Z') arr[str[i] - 'A'] += 1; // 알파벳을 아스키문자로 생각한다. 배열을 이용한다.
		if (str[i] >= 'a' && str[i] <= 'z') arr[str[i] - 'a'] += 1;
	}

	for (int j = 0; j < 26; j++) {
		if (arr[j] > cnt) {
			cnt = arr[j];
			index = j;
			check = 0;
		}
		else if (arr[j] == cnt) check = 1;
	}

	if (check) printf("?"); 
	else printf("%c", 'A' + index);
}