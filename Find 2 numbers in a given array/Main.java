#include<stdio.h>
int main()
{
  	int n,i,e1,e2,e1i=-1,e2i=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&e1,&e2);
  for(i=0;i<n;i++)
  {
    if(e1==a[i] && e1i==-1)
    {
      e1i=i;
    }
    if(e2==a[i] && e2i==-1)
    {
      e2i=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",e1i,e2i);
return 0;
}