class F 
{ 
  int i=10,j=20,x;
  public void add()
  {
    x=i+j;
  }
}
  class E extends F
  {
  int y;
 public void sub()
  { 
    y=i-j;
    }
   public void display()
    {
     System.out.println("x="+x);
     System.out.println("y="+y);
     }
   public static void main(String s[])
  { 
     E e=new E();
     e.add();
     e.sub();
     e.display();
   }
 }
      
    