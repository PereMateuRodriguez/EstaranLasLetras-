public class Main {
  public static void main(String[] args) {
    String str1 = "scrip,tjaavx";
    String str2 = "javascr,ipt";
   
   StringBuilder str = new StringBuilder();
   str.append(str1);
   boolean esta = false;
   for(int i = 0; i < str2.length(); i++){
   		esta = false;
   		for(int j = 0; j < str.length(); j++){
        	if(str2.charAt(i) == str.charAt(j)){
            	esta = true;
                str.setCharAt(j, '-');
                break;
            }
        }
        if(esta == false){
        	
            break;
        }
        
   }
   System.out.println(esta);
  }
}
