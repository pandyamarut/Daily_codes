class addn {
  int num1;
  int num2;
  addn(int a, int b){
    num1 = a;
    num2 = b;
    }
  int ad(){
    int sum;
    sum = num1+num2;
    return sum;
  }
}
  class adddemo{
    public static void main(String args[])
    {
      addn sum1 = new addn(10,20);
      int sumn=sum1.ad();
      System.out.println(" "+sumn);
    }
  }
