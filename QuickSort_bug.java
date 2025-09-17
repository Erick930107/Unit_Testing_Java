package test;

class QuickSort_bug {
    public static void sort(int[] number) {
        sort(number, 0, number.length-1);
    }
    
    private static void sort(int[] number, int left, int right) {
        if(left < right) { 
            int s = number[(left+right)/2]; 
            int i = left-1; 
            int j = right+1; 

            while(true) { 
                while(number[++i] < s) ;
                while(number[--j] > s) ; 
                if(i > j)                  // bug，由原本>=改為> 
                    break; 
                swap(number, i, j); 
            } 

            sort(number, left, i-1);    
            sort(number, j+1, right);  
        }
    }
    
    private static void swap(int[] number, int i, int j) {
        int t = number[i]; 
        number[i] = number[j]; 
        number[j] = t;
    }
}