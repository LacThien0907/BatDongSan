import java.util.Scanner;

import entities.*;

public class App {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("So luong manh dat can nhap");
        int n = Integer.parseInt(sc.nextLine());

        Shape[] list = new Shape[n];
        for( int i = 0; i < n; i++){
            System.out.format("Manh dat thu %d,\n", i+1);
            System.out.print("Loai hinh manh dat (0. Rectagle/1. Square/2. Circle/3. Triagle): ");
            int type = Integer.parseInt(sc.nextLine());

            if (type == 0){
                list [i] = new Rectangle();
            }
            if (type == 1){
                list [i] = new Square();
            }
            if (type == 2){
                list [i] = new Circle();
            }else{
                list [i] = new Triangle();
            }

            list[i].fromConSole();
        }
        // Xuat tat ca
        for(Shape sh : list){
            System.out.println(sh);
        }
        for(Shape sh : list){
            if(sh instanceof Rectangle){
                System.out.println(sh);
            }
        }

        for(Shape sh : list){
            if(sh instanceof Square){
                System.out.println(sh);
            }
        }

        for(Shape sh : list){
            if(sh instanceof Circle){
                System.out.println(sh);
            }
        }

        for(Shape sh : list){
            if(sh instanceof Triangle){
                System.out.println(sh);
            }
        }

        int total = 0;
        for(Shape sh : list){
            total +=sh.caculatorArea();
        }

        int pricePerUnit = 1000;
        System.out.println("Total = " + total*pricePerUnit);

    }
}
