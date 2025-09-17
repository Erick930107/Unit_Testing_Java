package test;

class QuickSort {
    public static void sort(int[] number) {
        sort(number, 0, number.length-1);
    }
     
    private static void sort(int[] number, int left, int right) {
        if(left < right) {                    // 代表左右之間的區間尚未檢查
            int s = number[(left+right)/2];   // 以中間為基準，以此來判斷左邊是否都更小，右邊同理
            int i = left-1;                   // 避免運算後指派index out of range，故-1
            int j = right+1;                  

            while(true) { 
                // 向右找直到沒有比s小的數
                while(number[++i] < s) ;      // 運算後指派，遇到不符的就可以接著swap
                // 向左找直到沒有比s大的數
                while(number[--j] > s) ; 
                if(i >= j)                    // 當左右交錯時swap 
                    break; 
                swap(number, i, j);           // 若當前i, j都固定了就代表他們都是亂序的故swap
            } 

            sort(number, left, i-1);          // 對左邊進行遞迴 
            sort(number, j+1, right);         // 對右邊進行遞迴 
        }
    }
    
    private static void swap(int[] number, int i, int j) {
        int t = number[i]; 
        number[i] = number[j]; 
        number[j] = t;
    }
}