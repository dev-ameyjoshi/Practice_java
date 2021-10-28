package com.company;

public class practiceProblem05 {

    public static class pattern
    {

        static int countPattern(String str)
        {
            int len = str.length();
            boolean oneSeen = false;

            int count = 0;
            for(int i = 0; i < len ; i++)
            {
                char getChar = str.charAt(i);


                if (getChar == '1' && oneSeen == true){
                    if (str.charAt(i - 1) == '0')
                        count++;
                }


                if(getChar == '1' && oneSeen == false)
                    oneSeen = true;


                if(getChar != '0' && str.charAt(i) != '1')
                    oneSeen = false;


            }
            return count;
        }


        public static void main(String[] args)
        {
            String str = "100001abc101";
            System.out.println(countPattern(str));
        }

    }


}
