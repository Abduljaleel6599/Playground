#include<stdio.h>
int main()
{
 int a,b,h,l,i;
  scanf("%d%d",&a,&b);
  i=(a<b)?b:a;
  for(;i>=1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      h=i;
      break;
    }
  }
  l=(a*b)/h;
  printf("%d",l);
  return 0;
}