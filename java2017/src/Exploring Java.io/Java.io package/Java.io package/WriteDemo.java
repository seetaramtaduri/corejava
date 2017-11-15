// Demonstrate System.out.write().

/*void write(int b) Writes a single byte to an output stream. Note that the parameter is an int, which allows you to call write with expressions without having to cast them back to byte.
*/
class WriteDemo
{
public static void main(String args[]) 
{
	int b;
	b = 'X';
	System.out.write(b);
	System.out.write('\n');
}
}