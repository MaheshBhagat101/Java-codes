// 1
// 1 2
// 1 2 3
// 1 2 3 4
public class Q_4 
{
    public static void main(String[] args) 
    {
        pattern4(4);
    }

    static void pattern4(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print(col+ " ");
            }
            System.out.println();
        }

    }

    
}
