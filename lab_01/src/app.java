import java.util.Scanner;

public class app {
    public static House[] Houses = new House[10];

    public static void main(String[] args) {

        Houses[0] = new House(0,1,25,1,2,"Гоголя","Кирпичное",10);
        Houses[1] = new House(1,25,50,2,4,"Пушкина","Бетонное",10);
        Houses[2] = new House(2,4,60,2,5,"Пушкина","Кирпичное",10);
        Houses[3] = new House(3,7,15,1,1,"Пушкина","Кирпичное",10);
        Houses[4] = new House(4,63,26,3,2,"Ленина","Кирпичное",10);
        Houses[5] = new House(5,35,34,3,2,"Ленина","Кирпичное",10);
        Houses[6] = new House(6,6,78,1,6,"Севастопольская","Кирпичное",10);
        Houses[7] = new House(7,77,30,5,3,"Киевская","Кирпичное",10);
        Houses[8] = new House(8,49,43,4,3,"Севастопольская","Кирпичное",10);
        Houses[9] = new House(9,50,20,4,2,"Киевская","Кирпичное",10);
        //Houses[10] = new House(10,16,25,1,2,"Полупанова","Кирпичное",10);

        //SearchByNumberOfRooms();
        //Search2();
        Search3();
    }

    public static void SearchByNumberOfRooms()
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i=0; i<Houses.length; i++)
        {
            if (Houses[i].number_of_rooms == num)
            {
                System.out.println(Houses[i].toString());
            }
        }
    }

    public static void Search2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число комнат: ");
        int num = scanner.nextInt();
        System.out.print("Введите промежуток этажей: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();



        for (int i=0; i<Houses.length; i++)
        {
            if (Houses[i].number_of_rooms == num)
            {
                if (num2 > num1)
                {
                    if (Houses[i].level >= num1 && Houses[i].level <= num2)
                    {
                        System.out.println(Houses[i].toString());
                    }
                } else if (num2 < num1)
                {
                    if (Houses[i].level <= num1 && Houses[i].level >= num2)
                    {
                        System.out.println(Houses[i].toString());
                    }
                }

            }
        }
    }

    public static void Search3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите площадь: ");
        int s = scanner.nextInt();



        for (int i=0; i<Houses.length; i++)
        {
            if (Houses[i].area > s) {
                System.out.println(Houses[i].toString());
            }
        }
    }
}
