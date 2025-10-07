class Strings
{
	public static void main(String []args)
	{
	 String a = "Sam";
        String b = "Sam";
        String c = new String("Sam");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println(a==c.intern());
	}
}