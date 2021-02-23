import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Number implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient int num1,num2;
	int num3,num4,num5;
	
	public Number(int num1, int num2, int num3, int num4, int num5) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
		this.num5 = num5;
	}

	@Override
	public String toString() {
		return "Number [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", num5=" + num5 + "]";
	}
	
}

public class SerializationDeserialization {
	public static void main(String args[])
	{
		Number number = new Number(10,20,30,40,50);
		
		System.out.println("Serialization");
		try
		{
			FileOutputStream file = new FileOutputStream ("./Nisarg.txt"); 
			ObjectOutputStream out = new ObjectOutputStream (file); 
			out.writeObject(number); 
            out.close(); 
            file.close();
		}
		catch (Exception e) { 
            System.out.println(e); 
        } 
		
		System.out.println("Serialization Complete");
		
		System.out.println("Serialized object: " + number.toString());
		
		System.out.println("Deserialization");
		try
		{
			Number number2 = null;
			FileInputStream file = new FileInputStream ("./Nisarg.txt"); 
			ObjectInputStream in = new ObjectInputStream(file); 
			number2 = (Number)in.readObject();
			System.out.println("Deserialization Complete");
			System.out.println("Deserialized object: " + number2.toString());
			in.close();
			file.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
