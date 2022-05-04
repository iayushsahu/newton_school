static void Pattern(int N){
    //Enter your code here
    int c6=0; // number for printing Row1
    int ci=4; //counter for printing +4 
        for(int i=0;i<N;i++){ //printing row
            for(int j=1;j<N;j++){ //printing coloumns
                if(j == 1 && i == 0){ //printing i=0 && j=0
                    System.out.print("0 ");
                }
                if(j == 1 && i != 0){ //printing j=0 
                    System.out.print(c6 + " ");
                }
                if(i == 0){ //printing i=0 coloumns
                    System.out.print(ci + " ");
                    ci+=4;
                }
                if(i != 0){ //printing other coloumns
                    ci+=4;
                    System.out.print(ci + " ");
                }
                }
                System.out.println(); //printing newline
            c6 = c6+ 6; //inc c6
            ci = c6; //inc ci
        }
    }