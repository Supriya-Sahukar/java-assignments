public class Program_3 {
    static int n = 3;

    static void rotate90DegreeClockwise(int arr[][])
    {
        for (int j = 0; j < n; j++)
        {
            for (int i = n - 1; i >= 0; i--)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3}, { 4, 5, 6}, { 7, 8, 9}};
        rotate90DegreeClockwise(arr);
    }
}
