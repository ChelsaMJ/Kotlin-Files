fun main() {
    
   //total amount and membership status
    
    var tot_amount=2000
    var ms=true

    //eligible for discount?
   
    
    if(tot_amount>=1000)
    {
        if(ms){
            println("You get 20% discount!")
            
        }
        else{
            println("You get 10% discount!")
        }
        
    }
    else
    {
        println("You are not eligible for a discount.")
    }
  }
