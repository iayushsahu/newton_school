static int Rare(int N, int K){
    //Enter your code here
        int digit;
        int c1=0;
        int c2=0;
        while(N > 0)  
        {  
          digit=N%10;
          if(digit%K==0){
            c2++;
          }
          N=N/10;
          c1++;
        }
        if(c1 == c2){
          return 1;
        }else{
          return 0;
        }
    }   