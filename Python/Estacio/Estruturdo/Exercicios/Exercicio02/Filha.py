def fatorial_iterativo(n):
    f=1
    for i in range (1,n+1):
        f=f*i
    return f

def fatorial_recusivo(n):
    if((n==0)or(n==1)):
        return 1
    return n*fatorial_iterativo(n-1)