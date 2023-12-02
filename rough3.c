#include<stdio.h>
int f(int n)
{
  static int a =0;
  if(n<=0)
  {
    return 1;
  }
  if(n>3)
  {
     a=n;
     return f(n-2) +2;
   }
   return f(n-1) + a;
}
int main()
{
  printf("Result: %d",f(5));
  return 0;
}