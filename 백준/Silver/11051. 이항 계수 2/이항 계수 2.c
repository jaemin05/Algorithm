#include <stdio.h>

int binomial_coefficient(int a, int b) {
    int arr[a+1][b+1];

    for(int i = 0; i <= a; i++) {
        for(int j = 0; j <= b; j++) {
            arr[i][j] = 0;
        }
    }

    for(int i = 0; i <= a; i++) {
        arr[i][0] = 1;
    }

    for(int i = 0; i <= b; i++) {
        arr[i][i] = 1;
    }

    for(int i = 1; i <= a; i++) {
        for(int j = 1; j <= b; j++) {
            arr[i][j] = (arr[i-1][j] + arr[i-1][j-1]) % 10007;
        }
    }

    return arr[a][b];
}


int main() {
    int n1, n2;
    scanf("%d %d", &n1, &n2);
    printf("%d", binomial_coefficient(n1, n2));
}