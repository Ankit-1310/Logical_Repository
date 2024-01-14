package langpackage;

public class ConvertArray {

public static void main(String[] args)
{
int a[][]={{10,50,40},{15,25,10},{25,14,19}};
for(int i=0;i<a.length;i++)
{
for(int j = 0;j<a[i].length;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}

}
}

