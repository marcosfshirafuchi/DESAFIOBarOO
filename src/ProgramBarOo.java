import java.util.Locale;
import java.util.Scanner;

public class ProgramBarOo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bill bill = new Bill();
        do{
            System.out.print("Sexo: ");
            bill.gender = sc.next().toUpperCase().trim().charAt(0);
        }while(bill.gender !='F'&& bill.gender !='f'&& bill.gender !='M'&& bill.gender !='m');

        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();
        System.out.println();
        System.out.println("RELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n",bill.Feeding());
        if(bill.Cover()==0){
            System.out.println("Isento de Couvert");
        }else{
            System.out.printf("Couvert = R$ %.2f%n",bill.Cover());
        }
        if(bill.gender == 'F'){
            System.out.printf("Ingresso = R$ %.2f%n",bill.Ticket());
        }else{
            System.out.printf("Ingresso = R$ %.2f%n",bill.Ticket());
        }
        System.out.println();
        System.out.printf("Valor a pagar = R$ %.2f%n",bill.Total());
        sc.close();
    }
}
