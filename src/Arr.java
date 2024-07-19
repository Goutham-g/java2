import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {


        int[] num= new int[5];   // intialise an array
        //add elemts to array

        num[0] = 6;
        num[2] = 8;
        num[1] = 2;
        num[4] = 9;
        System.out.println(Arrays.toString(num));

        // new method to intialize array
        int[] numm={5,43,6,2} ;
//        numm[1]=4;
        System.out.println(Arrays.toString(numm));


//  multi dimensional array
        int[][] mulArray={{1,2,3,4 },{6,5,7,3},{9,4,7,3}};
        System.out.println(Arrays.deepToString(mulArray));

        // multi dimensional array with loop

        String [] fruits= {"Apple","orange","grapes"};
        for (int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);

        }
        System.out.println("/n");

        // forEach
        int [] numbers={1,2,3,4,5,};
      for(String i:fruits){
          System.out.println(i);
      }
      for(int i:numbers){
          System.out.println(i);
      }
        //array example
        int[] ages={25,23,30,35,28,22,26};


        int summ=0;
        int arLen=ages.length;
        for(int i:ages){
             summ+=i;
        }
        int avg= summ/arLen;
        System.out.println("avg of ages=\t"+avg);
// array example 2

        int[] agess={23,43,11,35,66,5,35};

        int x=agess[0];
        for(int age:agess) {
            if(x>age){
                x=age;
            }

        }
        System.out.println("lowest age=\t"+x);



        int x1=1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        int a=4;
        a+=5;
        System.out.println(a);

        //explicit casting
        double x2 =1.1;
        double y1 =x2+2;
        System.out.println(y1);

        //implicit casting
        double x3 =2.1;
        int y2= (int) x3+4;
        System.out.println(y2);

        //conversion of string to

        String aa="210";
        String bb = "2.5";

        int sum = Integer.parseInt(aa)+3;
        double sum1 = Double.parseDouble(bb)+4;
        System.out.println("sum of string and integer=\t"+sum);
        System.out.println("sum of string and double=\t"+sum1);

        //java math
        int result = Math.round(1.1F);
        int result1 = (int)Math.ceil(1.1F);
        int result2 = (int)Math.floor(1.1F);
        int result3 = (int)Math.max(1,2);
        int result4 = (int)Math.max(1,2);

        double result22=Math.random()*1000;
        //to avoid decemal no
        int result31 =(int)Math.round(Math.random()*1000);
        long result312 =(int) (Math.random()*10000);
        System.out.println("result=\t"+result31);
    };
}
