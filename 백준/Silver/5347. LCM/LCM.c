#include <stdio.h>

#define ll long long

int gcd(int a, int b) {
    if(b == 0) {
        return a;
    }
    return gcd(b, a % b);
}

ll lcm(ll a, ll b) {
    return (a * b) / gcd(a, b);
}

int main() {
    int num;
    scanf("%d", &num);

    for(int i = 0; i < num; i++) {
        int a,b;
        scanf("%d %d", &a, &b);
        printf("%lld\n", lcm(a, b));
    }
}
