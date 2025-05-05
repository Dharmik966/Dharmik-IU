public class Lion 
{
    String color;
    String name;
    int age;
    public Lion(String color, String name, int age) 
    {
        this.color = color;
        this.name = name;
        this.age = age;
    }
    public void play() 
    {
        System.out.println(name + " is " + color + " and" + " he's playing");
    }
     public void printInfo()
    {   System.out.println("Lion's color: " + color);
        System.out.println("Lion's age: " + age + " years old");
        System.out.println("His name is: " + name);
    }

}