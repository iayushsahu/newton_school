static boolean checkNeeded(int n)
{
    boolean isSevenPresent=false;
    boolean isNinePresent=false;
    while(n>0)
    {
        if(n%10==7)
        {
            isSevenPresent =true;
        }
        if(n%10==9)
        {
            isNinePresent=true;
        }
        n/=10;
    }
    if(isSevenPresent && isNinePresent)
    {
      return false;
    }
    return true;
}

static int MagicNumber(int n)
{
    int i=0;
    while(checkNeeded(n-i)==true && checkNeeded(n+i)==true)
    {
     i++;
    }
    if(checkNeeded(n-i)==false)
    {
        return n-i;
    }
    else
    {
    return n+i;
    }
}
