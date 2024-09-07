//program to calculate student #Marks and its #Average 

class Result
{

         public static void main(String []args)
         {

             int s1,s2,s3,s4,s5,s6,s7,total;
             float avg;

               s1=88;
               s2=67;
               s3=97;
               s4=79;
               s4=78;
               s5=86;
               s6=93;
               s7=87;

            total=(s1+s2+s3+s4+s5+s6+s7) ;
            avg=(float)total/7;    ///explicit cast to real answer 

            System.out.println("Total Marks Obtained ="+total);

            System.out.println("Total Average ="+avg);


         }


}
