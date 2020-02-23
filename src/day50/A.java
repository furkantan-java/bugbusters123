package day50;

class A
{
    static String s = "AAA";

    static
    {
        s = s + "BBB";
    }
static
    {
        s = "AAABBB";
    }
}
class B extends A
{
    static
    {
        s = s + "BBBAAA";
    }

    static {
        System.out.println(s);
    }
}

