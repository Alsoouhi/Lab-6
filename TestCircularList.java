import java.util.Scanner;

public class TestCircularList {
    public static void main(String[] args) {
        CircularLinkList<String> list=new CircularLinkList<>();
        Scanner in=new Scanner(System.in);
        int choice =-1;

        while (choice!=0){
            System.out.println(" 1 add first\n 2 add last\n 3 remove first \n 4 Rotate \n 0 exit");
            choice=in.nextInt();
            switch (choice){
                case 1:
                    System.out.println("input name ");
                    list.addfirst(in.next());
                    break;
                case 2:
                    System.out.println("input name");
                    list.addlast(in.next());
                    break;
                case 3:
                    System.out.println("remove "+ list.removeFirst());
                    break;
                case 4:
                    list.Rotate();
                default:
                    System.exit(0);
            }
            System.out.println();
            System.out.println("first :"+list.first()+"\t "+"last :"+ list.last()+ "\t"+"size :"+list.size()+"\n");
        }

    }



}
