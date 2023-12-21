#include<stdio.h>
int main()
{
    int x,y,z,min,max;
    printf("Enter values of x y z");
    scanf("%d %d %d",&x,&y,&z);
    min = x < y && x < z ? x : y<x && y<z ? y : z;
    max = x > y && x > z ? x : y > x && y>z ? y : z;
    if(x!=min && x!=max)
    printf("X is middle");
    if(y!=min && y!=max)
    printf("Y is middle");
    if(z!=min && z!=max)
    printf("Z is middle");
}