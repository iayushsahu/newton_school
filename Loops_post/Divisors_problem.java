static int DivisorProblem(int N){
    //Enter your code here
    int step = 0;
    while(N!=1){
        if ((N%2)==0){
            N=N/2;
            step += 1;
        }else if((N%3)==0){
            N=N/3;
            step += 1;
        }else if((N%5)==0){
            N=N/5;
            step += 1;
        }else if((N%7)==0){
            N=N/7;
            step += 1;
        }else{
            N=1;
            step += 1;
        }
    }    
        return step;
    }