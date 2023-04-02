package com.logical;

class ck_Exception extends RuntimeException
{
ck_Exception(String msg)
  {
super(msg);
   }
}

class Mychk_Exception
{
public static void main(String[] args)

{
int i=5;
if(i<12){

throw new ck_Exception("checking Exception");
}
else{
System.out.println("check pass");

}
}

}

  

