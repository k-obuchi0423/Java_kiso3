package Java_kiso03;

public class Car extends Vehicle{ 
    
	Car(String vehicle,String maker,String purchaseDate,int coordinate,int fuel,int all){
		super(vehicle,maker,purchaseDate,coordinate,fuel,all);
	
	}
	
    @Override
    public void run(int location) {
	   if(fuel > 0) {
	    	
	     if(fuel < Math.abs(location)) {
	    		
	      all += fuel;
	      coordinate -= fuel;
	      fuel -= fuel;

	      if(location < 0) {
	        coordinate -= fuel;
	        }else {
	    	coordinate += fuel;
	        }
	      }else {
	        fuel -= Math.abs(location);
	    	all += Math.abs(location);
	    	if(location < 0) {
	    	  coordinate += location;
	    	  }else {
	    	    coordinate += location;
	    	  }
	        }
          }else {
    	    System.out.println("”R—¿‚ª‚È‚¢‚©‚ç‘–‚ç‚È‚¢");
          }
  
          super.run(location);
          System.out.println("Œ»Ý‚ÌXÀ•W‚ÍB" + coordinate);
          System.out.println("‘‘–s‹——£‚Í" + all);
          System.out.println();
    }
}
