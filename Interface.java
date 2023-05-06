
interface Circle
{
    public final foat PI = 3.14f;

    public float CalculateArea(float Radius);
    public float CalculateCircumfarance(float Radius);
}

class Demo implements Circle
{
    public foat CalculateArea(float Radius);
    {
        return 2 * Radius * Radius;
    }
    public float CalculateCircumfarance(float Radius);
    {
        return 2 * PI * Radius;
    }

}
class Interface
{
    public static void main(String Arg[])
    {
        Demo obj = new Demo();
        
    }
}