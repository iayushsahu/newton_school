static char Race(int A,int B,int C){
    //Enter your code here
    int len1 = (A > C)? A - C:C-A;
    int len2 = (B > C)? B - C:C-B;
    if(len1 > len2){
        return 'S';
    }else if(len1 == len2){
        return 'D';
    }else{
        return 'N';
    }
    }