
#? Return a new sorted merged list from K sorted lists, each with size N.
a=[[10, 15, 30],[12, 15, 20],[17, 20, 32],[],[45,2,-8]]
b=[]
for i in range(len(a)):
    b=b+a[i]
b.sort()
print('Sorted List:\n',b)
