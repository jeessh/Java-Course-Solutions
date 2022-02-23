public class Pyramid 
{
    public static void main(String[] args)
    {
        double blockWeight = 2.5;
        int numBlocks = 2500000;
        
        double pyramidWeight = blockWeight * numBlocks;
        
        System.out.print("The pyramid weighs ");
        System.out.println(pyramidWeight);
    }
}
