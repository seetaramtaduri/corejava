import java.io.*;

public class serialization 
{
    public static void main(String args[]) 
    {
        NewString inobject, outobject;
        inobject = new NewString("");
        outobject = new NewString("Hello from Java!");

        try {
            FileOutputStream fileoutputstring = new FileOutputStream("serialized.dat");
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstring);
            objectoutputstream.writeObject(outobject);
            objectoutputstream.flush();
            objectoutputstream.close();

            FileInputStream fileinputstring = new FileInputStream("serialized.dat");
            ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstring);
            inobject = (NewString)objectinputstream.readObject();
            objectinputstream.close();
        }
        catch(Exception e) {}

        System.out.println(inobject);
    }
}

class NewString implements Serializable 
{
    String data;

    public NewString(String instring) 
    {
        data = instring;
    }
    public String toString() 
    {
        return data;
    }
}
