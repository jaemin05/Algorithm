#include <stdio.h>

int main() {
    while(1) {
        char str[201];
        int alpha[26] = {0,};
        int cnt = 0;

        gets(str);

        if(str[0] == '*') break;
        for(int i = 0; str[i] != '\0'; i++) {
            alpha[str[i] - 'a'] = 1;
        } 
        
        for(int i = 0; i < 26; i++) {
            if(alpha[i] == 1) cnt++;
        }

        if(cnt == 26) {
            printf("Y\n");
        } else {
            printf("N\n");
        }
    }
}