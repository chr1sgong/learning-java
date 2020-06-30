package io.chr1s;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int k = 0;
    public static App t1 = new App("t1");
    public static App t2 = new App("t2");
    public static int i = print("i");
    public static int n = 99;

    public int j = print("j");
    {
        print("Creat");
    }

    static {
        print("Static");
    }

    public App(String str) {
        System.out.println((++k) + ":" + str + "    i=" + i + "  n=" + n);
        ++n; ++ i;
    }

    public static int print(String str){
        System.out.println((++k) +":" + str + "   i=" + i + "   n=" + n);
        ++n;
        return ++ i;
    }


    public static void main( String[] args )
    {
        System.out.println("-------test-------");
        App t = new App("init");
    }
}
