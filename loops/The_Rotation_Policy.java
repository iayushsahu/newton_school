static int RotationPolicy(int A, int B){
    //Enter your code here
    
    
    int a=0;
    for(int i=A;i<=B; i++){
        if(i%6==2 || i%6==0)
             a++;
    }
    return a;
    }
    
    