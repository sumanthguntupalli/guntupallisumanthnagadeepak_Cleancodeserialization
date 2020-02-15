package houseconstruction;


public class GetPlanFactory {
	public Plan getPlan(String planType){  
        if(planType == null){  
         return null;  
        }  
      if(planType.equalsIgnoreCase("standard")) {  
             return new Standard();  
           }   
       else if(planType.equalsIgnoreCase("Abovestandard")){  
            return new Abovestandard();  
        }   
      else if(planType.equalsIgnoreCase("Highstandard")) {  
            return new Highstandard();  
      }
      else if(planType.equalsIgnoreCase("Highstandard_fullyautomated")) {  
    	  return new HighstandardFullautomatic();
      }
  return null;  
}  
}
