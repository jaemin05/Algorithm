#include <stdio.h>

int main() {
    int num;
    int cnt = 0;
    scanf("%d", &num);

    int k = num;
    int song = 1;

    while(k) {
        if(k - song < 0) {
            song = 1;
        }
        k -= song;
        cnt += 1;
        song += 1;
    }

    printf("%d", cnt);
}
