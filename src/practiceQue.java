import java.util.Arrays;

public class practiceQue {
    //find array element that repeat 2 times


    //using function
//     static void repeatElement(int[] arr, int count){
//        int i,j;
//        System.out.print("repeat number=");
//        for(i=0;i<count-1;i++){
//            for(j=i+1;j<count-1;j++){
//                if (arr[i]==arr[j]){
//                    System.out.print(arr[i]+",");
//                }
//            }
//        }
//
//    }
    //move all zeros to end of array

     static void moveZero(int[] arr){
        ;
        int i;
        int j=0;
        int size=arr.length;
        for(i=0;i<size;i++){
            if(arr[i]!=0){
              arr[j] = arr[i];
              j++;
            }

        }
        for (i=j;i<size;i++) {
            arr[i] = 0;

        }



    }


    public static void main(String[] args) {


        int[] array = {2, 4, 6, 5,2, 9, 4, 7, 5, 2, 7, 6};
        int i, j;
        int n = array.length;
        System.out.print("The element that repeat twice=\t ");
        for (i = 0; i < n ; i++) {
            int count =0;
            for (j = 0; j < n; j++) {
                if (array[i] == array[j]) {
                  count++;
                }
            }
            if(count==2){
                boolean flag=false;
                for(int k=0;k<i;k++){
                    if (array[k]==array[i]){
                        flag=true;
                        break;
                    }

                    }
                if(!flag){
                    System.out.print(array[i]+",");
                }
                
            }

        }
//        int[] arr={2,3,2,5,4,6,6,4,3,4};
//        int size =arr.length;
//       repeatElement(arr, size);

        int[] arr1={6,6,0,4,0,5,0,9,8,7,0};
        moveZero(arr1);
        System.out.println("\nArray with all zeros at end="+Arrays.toString(arr1));

        ////




    }
}





