#include <stdio.h>

char str[257];

int main() {
    while(1) {
        int cnt = 0;
        fgets(str, sizeof(str), stdin);
        if(str[0] == '#') break;

        for(int i = 0; str[i] != '\0'; i++) {
            switch (str[i]) {
                case 'i':
                case 'I':
                case 'a':
                case 'A':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                case 'e':
                case 'E': cnt++;
            }
        }

        printf("%d\n", cnt);
    }
}
