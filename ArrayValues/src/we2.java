public class we2 {
       
        public static int average(int[] values, int sublist){
               
                int sum = 0;
               
                for(int i = 0; i < sublist; i++){
                        sum = sum + values[i];
                }
               
                return sum/sublist;
        }
       
        public static void main(String[] args){
               
                int[] arr = new int[5];
               
                arr[0] = 5;
                arr[1] = 5;
                arr[2] = 5;
                arr[3] = 2;
                arr[4] = 10;
               
                for(int i = 0; i < arr.length; i++){
                        System.out.println(arr[i]);
                }
               
                System.out.println("Average of first 5 is: " + average(arr, 5));
        }
 

    }
