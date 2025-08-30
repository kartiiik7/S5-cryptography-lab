#include<stdio.h>
#include<stdlib.h>
#include<math.h>
void main(){
    int p=3,q=11,m=5,n,phi,e=7,d,c,M;
    n=p*q;
    phi=(p-1)*(q-1);
    d=1;
    while(((e)*(d))%phi!=1){
        (d)++;
    }
    c=(int)(pow(m,e))%n;
    M=(int)(pow(c,d))%n;
    printf("The Given Text: %d\n",m);
    printf("The Encrypted Text: %d\n",e);
    printf("The Decrypted Text: %d\n",M);
}