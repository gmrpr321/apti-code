#include<stdio.h>
int main()
{
    int hours,days,workers;
    printf("Enter expected hours : ");
    scanf("%d",&hours);
    printf("\nEnter days : ");
    scanf("%d",&days);
    printf("\nEnter workers : ");
    scanf("%d",&workers);
    days = days*(9/10);
    int diff = hours - ((10*days)*workers);
    if(diff>=0)
    printf("Yes can complete , hours left : %d",diff);
    else
    printf("No can't complete , hours required : %d",diff);
}