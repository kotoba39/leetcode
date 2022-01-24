public class MinArray {
    public int minArray(int[] numbers) {
        if(numbers.length<=0){
            return -1;
        }
        int min=numbers[0];
        for(int i:numbers){
            if(min>i){
                return i;
            }
        }
        return min;
    }
}
