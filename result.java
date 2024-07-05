//program to calculate student #Marks and its #Average 

class Result
{

         public static void main(String []args)
         {

             int s1,s2,s3,s4,s5,s6,total;
             float avg;

               s1=88;
               s2=67;
               s3=97;
               s4=79;
               s4=48;
               s5=86;
               s6=93;

            total=(s1+s2+s3+s4+s5+6) ;
            avg=(float)total/6;    ///explicit cast to real answer 

            System.out.println("Total Marks Obtained ="+total);

            System.out.println("Total Average ="+avg);


         }


}