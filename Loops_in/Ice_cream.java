static int Icecreams (int N, int D){
    //Enter your code here
    while(D != 0){
          if(N%2 != 0){
                N =N/2 +1;
          }else{
                N = N/2;
          }
          N = N*3;
          D--;
    }
    return N;
    }