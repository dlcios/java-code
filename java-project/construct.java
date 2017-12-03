public class construct
{
    public static void main(String args[])
    {
        // Math func = new Math();

        // func.nine();

        // System.out.println(calc(1, 2, 3));
        // Dog dog1 = new Dog("huang");

        // Person p1 = new Person(20, "ming");
        // p1.dog = dog1;
        // p1.speak();
        // p1.dog.name = "bao";

        // Person p2 = new Person(2);

        // p2.dog = dog1;
        // p2.speak();

        Game ball = new Game("ball", 2, 13);

        Child ming = new Child(13, "ming");

        Child tom = new Child(12, "tom");

        Child tracy = new Child(14, "tracy");

        ming.joinGame(ball);

        tom.joinGame(ball);

        tracy.joinGame(ball);

        ball.play();

    }

    public static int calc(int num1, int num2, int num3)
    {
        int result = num1 + num2 + num3;

        return result;
    }
}

class Child
{
    int age;
    String name;
    int playing = 0;

    public Child(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public void joinGame(Game game)
    {
        if(game.validAge(this))
        {
            game.total += 1;
            this.playing = 1;
        }
    }

}

class Game
{
    int total;
    String gameName;
    int need;
    int needAge;

    public Game(String gameName, int need, int needAge)
    {
        this.gameName = gameName;
        this.need = need;
        this.needAge = needAge;
    }

    public void play()
    {
        if( this.total < this.need ) 
        {
            System.out.printf("sorry, this game need %d player, here is only %d player\n", this.need, this.total);
        }else
        {
            System.out.println("Game start, have fun");
        }
    }

    public boolean validAge( Child child )
    {
        if(child.age < this.needAge)
        {
            return false;
        }else {
            return true;
        }
    }

    public void gameEnd()
    {
        
    }

}

class Math
{
    public void nine()
    {
        String sign = " * ";

        for( int i = 0; i <= 9; i++ ) 
        {
            for( int j = 0; j <= i; j++)
            {
                System.out.print( i + sign + j + " = " + (i * j) + "   " );
            }
            System.out.println("");
        }

    }
}

class Person 
{
    int age;
    String name;
    int sex;
    Dog dog;

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public Person(int sex)
    {
        this.sex = sex;
    }

    public void speak()
    {
        // System.out.
        System.out.println("Hello, my name is " + this.name + ", my dog is " + dog.name );

    }

}

class Dog
{
    String name;

    public Dog( String name )
    {
        this.name = name;
    }

    public void info()
    {
        System.out.println("dog's name is " + name);
    }
}

/**
 * 1、设计计算机类，属性：品牌，颜色，cpu型号，内存容量，硬盘大小，价格，工作状态
 *    方法：打开，关闭，休眠
 * 2、创建一个计算机对象，调用打开，关闭方法
 * 
 * 3、采用面向对象思想设计超级马里奥游戏人物
 *    人物特性：画星星，告诉行列，画圈
 * 例如：  ****************
 *        ***@************
 *        ****************
 */      
class computer
{
    String color;

}