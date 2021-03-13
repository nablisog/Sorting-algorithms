import java.util.*;

/**
 *
 * @author nablisog
 */
public class Oblig0{
    
    Oblig0(){
        
    }
    boolean isEmpty(int[] a){
        return a.length == 0;
    }

    public int maks(int[] a) {
       if(isEmpty(a)){
         throw new NoSuchElementException();
       }
       int max = Integer.MIN_VALUE;
       for(int i : a){
           if(i > max)max= i;
       }
       return max;
    }


     public int ombyttinger(int[] a) {
            if(isEmpty(a)){
         throw new NoSuchElementException();
       }
        int counter = 0;
        int max = a[0];
        for(int i = 0; i < a.length; ++i){
            if(a[i] > max){
                max = a[i];
                counter++;
            }
        }
        return counter;
    }
     
    public  boolean sorted(int[] a){
         for(int i = 0; i < a.length-1; i++){
             if(a[i] > a [i + 1]){
                 return false;
             }
         }
         return true;
     }
     
    public int antallUlikeSortert(int[] a){
         ArrayList<Integer> non_repeted = new ArrayList<>();
              if(isEmpty(a)){
                return 0;
              }
              if(!sorted(a)){
                throw new IllegalStateException();
          }
              for(int i : a){
                  if(!non_repeted.contains(i)){
                      non_repeted.add(i);
                  }
                  
              }
          
          return non_repeted.size();
     }
    


    
    
    public void delsortering(int[] a){
         ArrayList<Integer> odd = new ArrayList<>();
         ArrayList<Integer> even = new ArrayList<>();
         
         
         for(int i : a){
             if(i%2 != 0){
                odd.add(i);
             }
             else{
                 even.add(i);
             }
             
         }
Collections.sort(even);
Collections.sort(odd);
even.addAll(odd);


even.forEach(k -> {System.out.println(k);});

     }
    
    public  void rotasjon(char[] a){
	if(a.length < 2){
            System.out.println("No Element to be rotated");
	}
        
        char rotate = a[a.length-1];
        for(int i = a.length-1; i > 0; i--){
            a[i] = a[i-1];
        }
         a[0] = rotate;
        
        for(int j = 0; j< a.length; j++){
            System.out.println(a[j]);
        }
    }

    public  void rotasjon(char[] a, int k){
       	if(a.length < 2){
            System.out.println("No Element to be rotated");
	}
       
        for(int i = 0; i < k; i++){
            for(int j = a.length-1; j > 0; j--){
              char tmp = a[j];
              a[j] = a[j-1];
              a[j-1] = tmp;
            }
        }
        
        for(int x = 0; x < a.length; x++){
            System.out.println(a[x]);
        }
    }
    
    public void Reverse(String a){
        for(int i = a.length()-1; i >= 0; i--){
            System.out.println(a.charAt(i));
        }
    }
        
   public void Non_Duplicate(int[] a){
       for(int i = 0; i < a.length; ++i){
           boolean is_not = false;
           for(int j = 0; j < a.length; j++){
               if(a[i] == a[j] && i != j){
                   is_not = true;
                   break;
               }    
           }
           if(!is_not){
               System.out.println(a[i]);
           } 
       } 
       
   }
   public boolean palandrum(int num){
       String word = Integer.toString(num);
       for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                   return false;
               }    
           } 
      
       
       return true;
   }
   
   public boolean palandrum(String word){        
        for(int i = 0; i < word.length()/2; i++){
            if(word.charAt(i) != word.charAt(word.length()-i-1)){
                   return false;
               }    
           } 
       return true;
   }
   
    public int fib(int n){     
      if (n <= 1){
        return n;
      }
      return fib(n-1) + fib(n-2);
    }
    
  public boolean is_prime(int n) { 
        if (n <= 1)return false; 
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false; 
            } 
        } 
        return true; 
    }
  
  public int factorial(int n){
      if(n <= 0){
          return 1;
      }
    return n * factorial(n-1);
  }
        
   public boolean armstrong_number(int n){
       int number = n;
       int sum = 0;
       while(n > 0){
           int r = n % 10;
           sum = sum + r*r*r;
           n = n/10;
       }
          return number == sum; 
       
       
   }
}