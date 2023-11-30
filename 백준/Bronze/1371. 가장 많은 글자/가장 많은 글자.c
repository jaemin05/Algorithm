#include <stdio.h>

#define max(a, b) ((a) > (b) ? a : b)

char str[5001];
int alpha[26]; 
int temp = 0;

int main() {
    int cnt = 0;

    while(gets(str)) {
        for(int i = 0; str[i] != '\0'; i++) {
            if(str[i] >= 'a' || str[i] <= 'z') {
                alpha[str[i] - 'a']++;
            }
        }
    }

    for(int i = 0; i < 26; i++) {
        temp = max(alpha[i], temp);
    }

    for(int i = 0; i < 26; i++) {
        if(alpha[i] == temp) {
            printf("%c", i + 'a');
        }    
    }
}
