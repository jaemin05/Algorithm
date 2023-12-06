#include<stdio.h>

double fac(int num) {
	if (num <= 1) return 1;
    return num * fac(num - 1);
}

double exponential(int n)
{
	double ans = 1;

    for (int i = 1; i <= n; i++)
    {
        ans += 1 / fac(i);
    }
    return ans;
}

int main(void)
{
	printf("n e\n");
	printf("- -----------\n");
	printf("0 1\n");
	printf("1 2\n");
    printf("2 2.5\n");
	for (int i = 3; i < 10; i++)
	{
		printf("%d %.9f\n", i, exponential(i));
	}
}
