
abstract class RBI
{
   public abstract float CalculateROI();

   public void DisplayRules()
   {
        System.out.println("You have to submit Adhar Card and PAN Card");
        System.out.println("Minimum balance is 10,000");
   }
}
class SBI extends RBI
{
    public float CalculateROI()
    {
        return 5.7f;
    }
}
class BOM extends RBI
{
    public float CalculateROI()
    {
        return 7.7f;
    }
}
class Abstractdemo
{
    public static void main(String Arg[])
    {
        SBI sobj = new SBI();
        BOM bobj = new BOM();

        sobj.DisplayRules();
        bobj.DisplayRules();

        float fRet = 0.0f;
        fRet = sobj.CalculateROI();
        System.out.println("ROI of SBI is : "+fRet);

        fRet = bobj.CalculateROI();
        System.out.println("ROI of BOM is : "+fRet);
    }
}