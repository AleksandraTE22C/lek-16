public class metoder_arrayer{
    public static void main(String[] args) {
        int[] fält = {4, 5, 13, 9, 8, 1, 15, 3, 1, 7};
        skriv_ut_array(fält);
        System.out.println();
        reset_array(fält);
    }
    
    static void skriv_ut_array(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    static void antal_över_8(int[] array){
        for(int i=0; i<array.length; i++){
            if(array[i]>8){
                System.out.println();
            }
        }
    }

    static void reset_array(int[] array){
        for(int i=0; i<array.length; i++){
            array[i]=0;
            System.out.print(array[i]+" ");
        }
    }
}