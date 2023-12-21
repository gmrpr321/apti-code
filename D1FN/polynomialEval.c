#include<stdio.h>
int pow(int base,int exp)
{
    if(exp==0)
    return 1;
    if(exp==1)
    return base;
    return base * pow(base,exp-1);
}
int main()
{
    int arr[100];
    int exp = 0,res = 0,bsc = 0;
    printf("Enter the value of degree : ");
    scanf("%d",&exp);
    int temp = 0;
    printf("Enter the coefficient values \n");
    while(temp<=exp)
    {
        scanf("%d",&arr[temp]);
        temp++;
    }
    printf("Enter the value of variable");
    scanf("%d",&bsc);
    for(int i = 0;i<=exp;i++)
    {
    res+=arr[i]*(pow(bsc,exp-i));
    }
    printf("Polynomial Value : \n\n%d",res);
}