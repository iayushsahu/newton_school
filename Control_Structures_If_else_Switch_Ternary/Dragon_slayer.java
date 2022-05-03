static int DragonSlayer(int A, int B, int C,int D){
    //Enter your code here
    
    for(int i = 0; i<= 4; i++){
            A=A-D;
            C=C-B;
            if(A<=0)
                    break;
            if(C<=0)
                    break;
    }
            if(A<=0){
                    return 1;
            }else{
                    return 0;
            }        
    }


// newton school provide code 
// inside funtion 