static int Knight(int X, int Y){
    //Ener your code here
    int cnt=0;
    if(X>2){
    if(Y>1){cnt++;}
    if(Y<8){cnt++;}
    }
    if(Y<7){
    if(X>1){cnt++;}
    if(X<8){cnt++;}
    }
    if(X<7){
    if(Y>1){cnt++;}
    if(Y<8){cnt++;}
    }
    if(Y>2){
    if(X>1){cnt++;}
    if(X<8){cnt++;}
    }
    return cnt;
}

//it is functional programming
