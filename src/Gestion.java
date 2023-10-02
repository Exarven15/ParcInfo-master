import java.util.Scanner;  // Import the Scanner class

public class Gestion {
    public static void main(String[] args) throws Exception {
        Materiel mat = new Materiel("ABCD:1234"); 
        Materiel mat1 = new Materiel("ABCD:1235"); 
        Switch sw1 = new Switch("ACDC6969", 24);
        OrdiFixe ordF = new OrdiFixe("ACDC6868","RTX 4090");
        OrdiPort ordP = new OrdiPort("ACDC6767", "G Hero 405");
        Smartphone phone = new Smartphone("ACDC6666","3.0");
        Parc nParc = new Parc("RT");

        System.out.println(mat);
        
        System.out.println(nParc);
        nParc.addM(mat);
        nParc.addM(phone);
        nParc.addM(ordP);
        nParc.addM(ordF);
        nParc.addM(sw1);
        System.out.println(nParc);
        nParc.addM(mat1);
        System.out.println(nParc);

        boolean boucle = true;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan21 = new Scanner(System.in);
        Scanner scan22 = new Scanner(System.in);
        Scanner scan23 = new Scanner(System.in);
        Scanner scan24 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        while(boucle == true){
            System.out.println("1. Create a new Parc");
            System.out.println("2. Create a new Materiel");
            System.out.println("3. Delete a materiel");
            System.out.print("What do you want to do ? ");
            int choice = scan.nextInt();
            
            if(choice == 1){
                System.out.println("Name your new parc : ");
                String nameParc = scan1.nextLine();
                
                System.out.print("You create your new Parc = "+ nameParc);
            }
            else if(choice == 2){
                System.out.println("1. Create a new Switch");
                System.out.println("2. Create a new Smartphone");
                System.out.println("3. Create a new Ordi Portable");
                System.out.println("4. Create a new Ordi Fixe");
                System.out.print("What do you want to do ? ");
                int choice2 = scan2.nextInt();
                
                if(choice2 == 1){
                    System.out.print("Name your new switch : ");
                    String nameSwitch = scan21.nextLine();
                    System.out.println("You create your new Switch = "+ nameSwitch);
                }
                else if(choice2 == 2){
                    System.out.print("Name your new smartphone : ");
                    String nameSmart = scan22.nextLine();
                    
                    System.out.println("You create your new Switch = "+ nameSmart);
                }
                else if(choice2 == 3){
                    System.out.print("Name your new ordi portable : ");
                    String nameOrdiP = scan23.nextLine();
                    
                    System.out.println("You create your new Switch = "+ nameOrdiP);
                }
                else if(choice2 == 4){
                    System.out.print("Name your new ordi Fixe : ");
                    String nameOrdiF = scan24.nextLine();
                    
                    System.out.println("You create your new Switch = "+ nameOrdiF);
                }
                else{
                    System.out.println("ERROR INPUT: invalid input");
                }

            }
            else if(choice == 3){

            }
            else{
                System.out.println("ERROR INPUT: invalid input");
            }
            
            
        }


    }
}
