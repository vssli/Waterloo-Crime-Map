public class Client
{
    private String str="Hello world";
    private PrintService service;
     @Inject
    void injectPrintService(PrintService service)
     {
        this.service=service;
     }

    void printString()
     {
         service.print(str);
     }

}

public class MyModule implements Module
{

    public void configure(Binder binder)
     {
         binder.bind(PrintService.class).to(PrintServiceImpl.class);
     }

}

public static void main(String [ ] args)
{

   MyModule mo=new MyModule();
         Injector in=Guice.createInjector(mo);
         Client client=new Client();
         in.injectMembers(client);
         client.printString();
}