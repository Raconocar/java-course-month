package su.medsoft;
public  class Calculate{
  public static void main(String[] arg) {
    int first = Integer.valueOf(arg[0]);
    int second = Integer.valueOf(arg[1]);
    System.out.println("calculate!  " + first +"  "+ second);
    // int sum = first + second;
    System.out.println(String.format("$s + $s = $s", first,second,add(first,second)));
    System.out.println(String.format("$s - $s = $s", first,second,sub(first,second)));
    System.out.println(String.format("$s * $s = $s", first,second,mul(first,second)));
    System.out.println(String.format("$s / $s = $s", first,second,div(first,second)));
    System.out.println(String.format("$s ^ $s = $s", first,second,exp(first,second)));
  }
  public static short add(short first, short second){return first+second;}
  public static int add(int first, int second){return first+second;}
  public static long add(long first, long second){return first+second;}
  public static float add (float first, float second){return first+second;}
  public static double add (double first, double second){return first+second;}


  public static short sub (short first, short second){return first-second;}
  public static int sub (int first, int second){return first-second;}
  public static long sub (long first, long second){return first-second;}
  public static float sub (float first, float second){return first-second;}
  public static double sub (double first, double second){return first-second;}

  public static short mul (short first, short second){return first*second;}
  public static int mul (int first, int second){return first*second;}
  public static long mul (long first, long second){return first*second;}
  public static float mul (float first, float second){return first*second;}
  public static double mul (double first, double second){return first*second;}

  public static short div (short first, short second){return first/second;}
  public static int div (int first, int second){return first/second;}
  public static long div (long first, long second){return first/second;}
  public static float div (float first, float second){return first/second;}
  public static double div (double first, double second){return first/second;}

  public static short exp (short first, short second){return Math.pow(first,second);}
  public static int exp (int first, int second){return Math.pow(first,second);}
  public static long exp (long first, long second){return Math.pow(first,second);}
  public static float exp (float first, float second){return Math.pow(first,second);}
  public static double exp (double first, double second){return Math.pow(first,second);}





}
