import java.util.Scanner;

public class ExecuteSingleLinkedList
{
    public void chooseOptions()
    {
        System.out.println("Choose one of the options:\n1.Insert\n2.Remove\n3.Display\n4.Exit");
    }

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        SList<String> myList=new SList<String>();

        SListIterator<String> iterator=myList.iterator();

        ExecuteSingleLinkedList exObj=new ExecuteSingleLinkedList();

        exObj.chooseOptions();
        System.out.println("Enter your choice:");
        int choice=scanner.nextInt();

        while(choice!=4)
        {
            if(choice==1)
            {
                System.out.print("Enter the element to add");
                String value=scanner.next();
                iterator.insert(value);
            }
            else if(choice==2)
            {
                iterator.remove();
            }
            else if(choice==3)
            {
                System.out.println("The elements present in the single linked list are:");
                while (iterator.hasNext())
                {
                    System.out.print(iterator.next() + " ");
                }
                System.out.println();
                iterator.setCurrentNode();
            }
            exObj.chooseOptions();
            System.out.println("Enter your choice:");
            choice=scanner.nextInt();
        }
    }
}
