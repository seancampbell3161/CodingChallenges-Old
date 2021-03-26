

public class accumul {
    
    public static String ourMethod(String s) {
      String[] array = s.split("");
      int increment = 0;
      String string = "";
      
      for(int i=0; i<array.length; i++) {
        string += array[i].toUpperCase();
        for(int j=0; j<increment; j++) {
          string += array[i].toLowerCase();
        }
        
        if(i != array.length -1){
          string += "-";
        }
        
          increment++;
      }
      
      return string;
    }
    
    public static void main(String[] args) {
        
        System.out.print(ourMethod("abcdE"));
        
    }

}
