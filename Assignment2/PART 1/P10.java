class P10
{
public static void main(String args[])
{
for(char i=70;i>=65;i--)
{
for(char j=65;j<=i;j++)
{
System.out.print(" ");
}
for(char j=i;j<70;j++)
{
System.out.print(" "+j);
}
System.out.println();
}	
} 
}