package JavaConceptOfTheDay;

// Non-Static Members And Their Memory Management In Java


class A
{
     int nonStaticVariable;
     static int staticVariable;
 
     static void staticMethod()
     {
          System.out.println(staticVariable);
     //  System.out.println(nonStaticVariable);
     }
 
     void nonStaticMethod()
     {
          System.out.println(staticVariable);
          System.out.println(nonStaticVariable);
     }
}
 