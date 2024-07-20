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

     public static void moveZero(int[] arr){
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
      //merge two arrays of  same size and sort in decending
        int [] ar1={8,4,3,5,2,6};
        int [] ar2={2,5,4,3,7,5};

        int tSize= ar1.length+ar2.length; //total len of 2 array

        //create new array
        int[] ar3 = new int[tSize];

        int index = 0;
        //copy ar1 to a3
        for(i=0;i<ar1.length;i++){
            ar3[index]=ar1[i];
            index++;
        }
        //copy ar2 to a3
        for(i=0;i<ar2.length;i++){
            ar3[index]=ar2[i];
            index++;
        }
        //sort
        for(i=0;i<ar3.length;i++){
            for(j=i+1;j<ar3.length;j++){

                 if(ar3[i]<ar3[j]){
                      int temp=ar3[i];
                      ar3[i]=ar3[j];
                      ar3[j]=temp;
                 }
            }
        }
        System.out.print("array merged and sorted:");
        for(i=0;i<ar3.length;i++){
            System.out.print(ar3[i]+",");
        }

        // delete multiple of 5

        int[] mArr={1,5,12,15,23,20};

        int[] tempAr=new int[mArr.length];
      int count1 =0;
        for(i=0;i<mArr.length;i++){

            if(mArr[i] % 5 != 0){
                tempAr[count1]=mArr[i];
                   count1++;
                }
        }

        int[] newArr = new int[count1];

          for(i=0;i<count1;i++){
              newArr[i]=tempAr[i];
          }
          //print
        System.out.print
                ("\nArray removed multiples of 5:\t");
          for(i=0;i<newArr.length;i++){
              System.out.print(newArr[i]+",");
          }










    }
}





