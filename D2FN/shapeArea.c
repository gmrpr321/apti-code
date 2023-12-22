#include<stdio.h>
int main()
{
    char shape;
    int size = 0;
    printf("Enter the shape : ");
    scanf("%c",&shape);
    printf("\nEnter size : ");
    scanf("%d",&size);
    if(shape=='C' || shape =='c')
    printf("Area of Circle : %f ",(3.14*(size*size)));
    else if(shape=='S' || shape=='s')
    printf("Area of Square : %d ",size*size);
    return 0;
}