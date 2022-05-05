static void Pattern(int N){
    //Enter your code here
    int n = N+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==2){
                    continue;
                }
                if(j==1 || j==i){ 
                    System.out.print("*"); //print first line
                }else if(i==n){ 
                    System.out.print("*"); //print last line
                }else{
                    System.out.print("^"); 
                }
            }
            if(i==2){
                    continue;
                }
            System.out.println();
        }
    }