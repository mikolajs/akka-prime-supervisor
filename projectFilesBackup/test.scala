

var bank = scala.collection.mutable.ListBuffer(2L)



def foundFactorial(numb:Long):Boolean = {
	  for(i <- bank){
        if(i*i > numb) return false
	    if(numb % i == 0) return true
	  }
	  return false
}

for( n <- 3L to 100L by 2L) {
    if(!foundFactorial(n)) bank += n
}
println(bank)
