import java.util.Scanner;

public class idadeCamila {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] idades = new int[3];
        int idadeCamila;
        for(int i=0; i<3; i++){
            System.out.println("Insira a idade: ");
            idades[i]=scan.nextInt();
        }
        scan.close();
        for(int i=0; i<idades.length; i++){
            for(int j=0; j<(idades.length - 1); j++){
                if(idades[j] > idades[j+1]){
                    idadeCamila = idades[j];
                    idades[j] = idades[j+1];
                    idades[j+1] = idadeCamila;
                }
            }
        }
        System.out.println(idades[1]);
    }
}
