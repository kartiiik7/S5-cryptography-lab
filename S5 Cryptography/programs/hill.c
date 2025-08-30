#include<stdio.h>
void main()
{
    	int i,j;
    	int key={{2,3},{3,6}};
    	char a[]=”attack”;
    	int len=sizeof(a)-1;
    	char e[len], num[len],d[len];
    	for(i=0;i<len;i++){
        	num[i]=a[i]-‘a’;
   	    }
    	for(i=0;i<=len;i=i+2){
        	e[i]=((num[i]*key)%26+(num[i+1]*key[1])%26)%26;
        	e[i+1]=((num[i]*key[1])%26+(num[i+1]*key[1][1])%26)%26;
    	}
    	char enc[len];
    	for(i=0;i<len;i++){
        	enc[i]=e[i]+’a’;
    	}
    	printf(“Original string:%s\n”,a);
    	printf(“Encrypted string=%s\t\n”,enc);
    	int del= (key*key[1][1])-(key[1]*key[1]);
    	int del_inv;
    	for(i=0;i<26;i++){
		    if((del*i)% 26==1){
            	del_inv=i;
            	break;
        	}
    	}
    	int k_adj={{key[1][1],0-key[1]},{0-key[1],key}};
    	int k_inv;
    	for(i=0;i<2;i++){
        	for(j=0;j<2;j++){
            	k_inv[i][j]=k_adj[i][j]*del_inv;
        	}
    	}
    	for(i=0;i<2;i++){
        	for(j=0;j<2;j++){
            	if(k_inv[i][j]<0){
               			k_inv[i][j]+=26;
            	}
        	}
    	}
    	for(i=0;i<=len;i=i+2){
        	d[i]=((e[i]*k_inv)%26+(e[i+1]*k_inv[1])%26)%26;
        	d[i+1]=((e[i]*k_inv[1])%26+(e[i+1]*k_inv[1][1])%26)%26;
    	}
    	char dec[len];
    	for(i=0;i<len;i++){
        	dec[i]=d[i]+’a’;
        	printf(“Decrypted string=%s\t\n”,dec);
    }
}
