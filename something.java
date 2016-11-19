public interface PrintService
{
    public void print(String str);
}

public class PrintServiceImpl implements PrintService
{

    public void print(String str)
     {
         System.out.print(str);
     }

}

public class Client
{
    private String str="Hello world";
    private PrintService service;
    void printString()
     {
         service.print(str);
     }

}

public static void main(String [ ] args)
{
	Client client = new Client();
	client.printString();
}