#vector


#logical
vtr1 = c(TRUE,FALSE)
#numeric
vtr2 = c(97,12.45,999,8777,88888888);
#integer
vtr3 = c(7L,45L)
#vtr4 = c(98.74L) #warning will occur as integer is declared but using decimal
#mixed
vtr5 = c(TRUE, 7L, 98.75); # numeric
vtr6 = c("Hello", FALSE, 8L)

class(vtr1)
class(vtr2)
class(vtr3)
#class(vtr4) #integer literal 98.74L contains decimal; using numeric value
class(vtr5)
class(vtr6)
