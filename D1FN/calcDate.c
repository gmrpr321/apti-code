#include<stdio.h>
int main()
{
    int days;
    int year=0,month=0,week=0,leftover=0;
    printf("Enter the number of days");
    scanf("%d",&days);
    year = days/365;
    days = days%365;
    month = days/30;
    days = days%30;
    week = days/7;
    days = days%7;
    leftover = days;
    printf("Year : %d  month : %d  weeks : %d Leftover : %d",year,month,week,leftover);
}