public class object
{
    public static void main(String args[])
    {
        System.out.println("object progam");
        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.name = "jojo";
        cat1.color = "blue";
        
        System.out.println(cat1.name);

        Person perter = new Person();
        perter.speak();
        perter.calc();
        perter.calcate(100);

        System.out.println("result is :" + perter.calcate2(29, 54));
    }
}

class Cat
{
    int age;
    String name;
    String color;
    String master;
}

class Person
{
    int age;
    String name;
    String color;
    String cat;

    public void speak()
    {
        System.out.println("I'm david");
    }

    public void calc()
    {
        int result = 0;
        for(int i = 1; i <= 1000; i++) 
        {
            result += i;
        }
        System.out.println("the result is :" + result);
    }

    public void calcate(int n)
    {
        int result = 0;
        for(int i = 1; i <= n; i++)
        {
            result += i;
        }
        System.out.println("the result is:" + result);
    }

    public int calcate2(int num, int num2)
    {
        int sum = num + num2;

        return sum;
    }

}
