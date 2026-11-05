import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //interfaz inicio*****************************************************
    
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int felicidad = 0;
        int hambre = 30;
        int inteligencia = 0;
        int energia = 30;
//añadir mas opciones en las futuras versiones //
        do {
            System.out.println("\n+                     _                              _   +");
            System.out.println("+                    | |                            | |  +");
            System.out.println("+ _ __ __ _ _ __   __| | ___  _ __ ___    _ __   ___| |_ +");
            System.out.println("+| '__/ _` | '_   / _` |/ _  | '_ ` _    | '_   / _  __ |+");
            System.out.println("+| | | (_| | | | | (_| | (_) | | | | | | | |_) |  __/ |_ +");
            System.out.println("+|_|   __,_|_| |_|_ _,_| ___/|_| |_| |_| | .__/  ___| __|+");
            System.out.println("+                                        | |             +"); 
            System.out.println("+                                        |_|             +");
            System.out.println("**********************************************************");

//en la siguiente version añadir un apartado de guardar partida 
            System.out.println("+                   1)nueva partida                      +");
            System.out.println("+                   2)Como jugar                          +");
            System.out.println("+                   3)salir                              +");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("¡Hola! Bienvenido a randompet.");
                    while (true) {
                        System.out.println("escoge el nombre de tu mascota ");
                        String nombre = teclado.next();
                        System.out.println("tu mascota se llama " + nombre );
                        System.out.println("1) Sí  2) No");
                       
                        int respuesta = teclado.nextInt();

                        if (respuesta == 1) {
                            System.out.println("¡Genial! Vamos a elegir tu mascota.");
                            
                              System.out.println("¿Qué mascota quieres?");
                                      System.out.println("1) Perro");
                                      System.out.println("2) tortuga");
                                      System.out.println("3) oso");

                              int mascota = teclado.nextInt();
                         switch (mascota) {
     //opciones del perro//                       
                                         case 1:
                                            
                                              System.out.println("^..^      /");  
                                              System.out.println("/_/\\_____/  ");
                                              System.out.println("   /\\   /\\  ");
                                              System.out.println("  /  \\ /  \\ ");  
                                              System.out.println(nombre + " te quiere mucho ,que vas a hacer?");
                                         
                                            while (true) {
                                                System.out.println("1) jugar con tu mascota");
                                                System.out.println("2) alimentar a tu mascota");
                                                System.out.println("3) enseñarle matematicas");
                                                System.out.println("4) descansar");
                                                System.out.println("5) estadisticas");
                                                System.out.println("6) salir");
                                                int accion = teclado.nextInt();

                                            switch (accion) {
   //jugar con la mascota//          
                                                     case 1:
                                                                  System.out.println("                _,)");
                                                                  System.out.println("         _..._.-;-'");
                                                                  System.out.println("      .-'     `(");
                                                                  System.out.println("    /      ;   \\");
                                                                  System.out.println("   ;.' ;`  ,;  ;");
                                                                  System.out.println("  .'' ``. (  \\ ;");
                                                                  System.out.println(" / f_ _L \\ ;  )\\");
                                                                  System.out.println(" \\/|` '|\\/;; <;/");
                                                                  System.out.println("((; \\_/  (()    ");
                                                        System.out.println(nombre + " Se lo esta pasando muy bien c: ");
                                                        felicidad++;
                                                        energia -=10;
  //contador muerte//                                                      
                                                         if (energia <= 0) {
                                                        System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                         System.exit(0);
                                                       }

                                                        break;
//alimentar a la mascota//
                                                    case 2:
                                                                  System.out.println("           ^\\");  
                                                                  System.out.println(" /        //o__o");
                                                                  System.out.println("/\\       /  __/");
                                                                  System.out.println("\\ \\______\\  /   ");
                                                                  System.out.println(" \\         /");
                                                                  System.out.println("  \\ \\----\\ \\       ___    ");
                                                                  System.out.println("   \\_\\_   \\_\\_    /___\\      ");
                                                                

                                                        System.out.println(nombre + " ha comido mucho ");
                                                        hambre--;
                                                        energia-=10;
  //contador muerte//                                                      
                                                   if (energia <= 0) {
                                                        System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                         System.exit(0);
                                                       }

                                                        break;               
           
                                                    case 3:
       //DECLARACION DE VARIABLES SUMAS Y RESTAS//
                                                                  System.out.println("    __    __");  
                                                                  System.out.println("    \\/----\\/");
                                                                  System.out.println("     \\0  0/ ");
                                                                  System.out.println("     _\\  /_");
                                                                  System.out.println("   _|  \\/  |_");
                                                                  System.out.println("  | | |  | | |");
                                                                  System.out.println(" _| | |  | | |_");
                                                                  System.out.println("\"---|_|--|_|---\"");
                
                                                         double num1;
                                                         double num2;
                                                         double resultado;
                                                         int operacion;
                                                         System.out.println("por alguna extraña razon " + nombre + " ahora sabe sumar y restar : ");
                                                          inteligencia +=20;
                                                          energia-=9;
                                                         System.out.println("1) Sumar  2) Restar");
                                                         operacion = teclado.nextInt();
                                                         System.out.println("Introduce el primer número:");
                                                         num1 = teclado.nextDouble();
                                                         System.out.println("Introduce el segundo número:");
                                                          num2 = teclado.nextDouble();
                                                             switch (operacion) {
   //si el usuario escribe una letra el programa da error    
   //no se como arreglarlo ,corregir en siguientes versiones                                                          
                                                                case 1:
                                                                    resultado = num1 + num2;
                                                                    System.out.println("El resultado de la suma es: " + resultado);
                                                                break;

                                                                case 2:
                                                                resultado = num1 - num2;
                                                                System.out.println("El resultado de la resta es: " + resultado);
                                                                break;

                                                                default:
                                                                  System.out.println("Opcion no valida");
                                                                     } 
 //contador muerte//                                                                    
                                                           if (energia <= 0) {
                                                             System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                             System.exit(0);
                                                            }
//para la siguente version añadir mas metodos para finalizar partida //
                                                        break;
                                                      
                                                       case 4:
                                                           System.out.println("           _");
                                                           System.out.println("         ,/A\\,");
                                                           System.out.println("       .//`_`\\\\,");
                                                           System.out.println("     ,//`____-`\\\\,");
                                                           System.out.println("    ,//`["+ nombre + "]`  \\\\,");
                                                           System.out.println("  ,//`=  ==  __-  _`\\\\,");
                                                           System.out.println(" //|__=  __- == _  __|\\\\");
                                                           System.out.println(" ` |  __ .-----.  _  | `");
                                                           System.out.println("   | - _/       \\-   |");
                                                           System.out.println("   |__  | .-\"-. | __=|");
                                                           System.out.println("   |  _=|/)   (\\|    |");
                                                           System.out.println("   |-__ (/ a a \\) -__|");
                                                           System.out.println("   |___ /`\\_Y_/`\\____|");
                                                           System.out.println("        \\)8===8(/");

                                                        System.out.println(nombre + " se está echando una siesta para recuperar energía.");
                                                        energia +=20;
                                                        break;    
                                                                            
   //estadisticas de la mascota//                                                                       
                                                    case 5:
                                                        System.out.println("Estadisticas de " + nombre + ":");
                                                        System.out.println("Felicidad: " + felicidad);
                                                        System.out.println("Hambre: " + hambre);
                                                        System.out.println("Inteligencia: " + inteligencia);
                                                        System.out.println("energia: " + energia);
                                                        break;                      
//salir del juego//

                                                    case 6:
                                                        System.out.println("Saliendo del juego...");
                                                        return; 
//opcion no valida//                                                      
                                                    default:
                                                        System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
                                                        break;
                                                                  
                                                         }
                                               }
   //opciones de la tortuga//
                                         case 2:
                                              System.out.println("                __");
                                              System.out.println("     .,-;-;-,. /'_\\ ");
                                              System.out.println("   _/_/_/_|_\\_\\) /              ");
                                              System.out.println(" '-<_><_><_><_>=/\\              ");
                                              System.out.println("  `/_/====/_/-'\\_\\              ");
                                              System.out.println("   \"\"     \"\"    \"\"              ");
                                          System.out.println(nombre + " esta un poco confuso ,pero te quiere mucho  ");
                                        
                                            while (true) {
                                                System.out.println("1) jugar con tu mascota");
                                                System.out.println("2) alimentar a tu mascota");
                                                System.out.println("3) enseñarle matematicas");
                                                System.out.println("4) descansar");
                                                System.out.println("5) estadisticas");
                                                System.out.println("6) salir");
                                                int accion = teclado.nextInt();

                                                switch (accion) {
   //jugar con la mascota//          
                                                     case 1:
                                                                  System.out.println("     _..---.--.");
                                                                  System.out.println("   .'\\ __|/O.__)");
                                                                  System.out.println("  /__.' _/ .-'_\\");
                                                                  System.out.println(" (____.'.-_\\____) ");
                                                                  System.out.println("  (_/ _)__(_ \\_)\\_");
                                                                  System.out.println("   (_..)--(.._)'--'");
                                                            
                                                        System.out.println(nombre + " está muy feliz de jugar contigo  ");
                                                        felicidad++;
                                                        energia -=10;
  //contador muerte//                                                      
                                                        if (energia <= 0) {
                                                        System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                         System.exit(0);
                                                       }

                                                        break;
//alimentar a la mascota//
                                                    case 2:
                                                                  System.out.println("  _____     ____");  
                                                                  System.out.println(" /      \\  |  o | ");
                                                                  System.out.println("|        |/ ___\\| ");
                                                                  System.out.println("|_________/          ___    ");   
                                                                  System.out.println("|_|_| |_|_|         /___\\    "); 
                              
                                                      System.out.println(nombre + " ha comido ");
                                                        hambre--;
                                                        energia-=10;
   //contador muerte//                                                     
                                                       if (energia <= 0) {
                                                        System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                         System.exit(0);
                                                       }

                                                        break;
                                                    case 3:
       //DECLARACION DE VARIABLES SUMAS Y RESTAS//
                                                                  System.out.println("    ._     .--.");  
                                                                  System.out.println("   (' \\  ,'    `.");
                                                                  System.out.println("    `._:^        \\:>");
                                                                  System.out.println("        ^T~~~~~~T'");
                                                                  System.out.println("        ~\"     ~\"");
                                                                 
                                                         double num1;
                                                         double num2;
                                                         double resultado;
                                                         int operacion;
                                                         System.out.println("por alguna extraña razon " + nombre + " ahora sabe sumar y restar : ");
                                                          inteligencia +=20;
                                                          energia-=9;
                                                         System.out.println("1) Sumar  2) Restar");
                                                         operacion = teclado.nextInt();
                                                         System.out.println("Introduce el primer número:");
                                                         num1 = teclado.nextDouble();
                                                         System.out.println("Introduce el segundo número:");
                                                          num2 = teclado.nextDouble();
                                                            switch (operacion) {
                                                            case 1:
                                                                 resultado = num1 + num2;
                                                               System.out.println("El resultado de la suma es: " + resultado);
                                                                break;
                                                                
                                                            case 2:
                                                                resultado = num1 - num2;
                                                                System.out.println("El resultado de la resta es: " + resultado);
                                                             break;  

                                                          default:
                                                           System.out.println("Opcion no valida");
                                                                    }
  //contador muerte//                                                                  
                                                        if (energia <= 0) {
                                                          System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                           System.exit(0);
                                                           }

                                                        break;
                                                     case 4:
                                                           System.out.println("           _");
                                                           System.out.println("         ,/A\\,");
                                                           System.out.println("       .//`_`\\\\,");
                                                           System.out.println("     ,//`____-`\\\\,");
                                                           System.out.println("    ,//`["+ nombre + "]`  \\\\,");
                                                           System.out.println("  ,//`=  ==  __-  _`\\\\,");
                                                           System.out.println(" //|__=  __- == _  __|\\\\");
                                                           System.out.println(" ` |  __ .-----.  _  | `");
                                                           System.out.println("   | - _/       \\-  |");
                                                           System.out.println("   |__  |        |__=|");
                                                           System.out.println("   |  _=|        |   |");
                                                           System.out.println("   |-__ |        | __|");
                                                           System.out.println("   |___ |        |___|");
                                                          

                                                        System.out.println(nombre + " se está echando una siesta para recuperar energía.");
                                                        energia +=20;
                                                        break;    
                                                                                   
   //estadisticas de la mascota//                                                                       
                                                    case 5:
                                                        System.out.println("Estadisticas de " + nombre + ":");
                                                        System.out.println("Felicidad: " + felicidad);
                                                        System.out.println("Hambre: " + hambre);
                                                        System.out.println("Inteligencia: " + inteligencia);
                                                        System.out.println("energia: " + energia);
                                                        break;                      
//salir del juego//

                                                    case 6:
                                                        System.out.println("Saliendo del juego...");
                                                        return; 
//opcion no valida//                                                      
                                                    default:
                                                        System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
                                                        break;
                                                                  
                                                         }
                                               }

    //opciones del oso//
                                        case 3:


                                              System.out.println(" __         __");
                                              System.out.println("/  \\.-\"\"\"-./  \\");
                                              System.out.println("\\    -   -    /");
                                              System.out.println(" |   o   o   |");
                                              System.out.println(" \\  .-'''-.  /");
                                              System.out.println("  '-\\__Y__/-'");
                                              System.out.println("     `---`");
                                          System.out.println(nombre + " es un oso bastante peligroso, pero será tu mascota  ");
                                        while (true) {
                                                System.out.println("1) jugar con tu mascota");
                                                System.out.println("2) alimentar a tu mascota");
                                                System.out.println("3) enseñarle matematicas");
                                                System.out.println("4) descanasar");
                                                System.out.println("5) estadisticas");
                                                System.out.println("6) salir");
                                                int accion = teclado.nextInt();

                                                switch (accion) {
   //jugar con la mascota//          
                                                     case 1:
                                                                  System.out.println("  (()__(()");
                                                                  System.out.println("    /       \\");
                                                                  System.out.println("   ( /    \\  \\");
                                                                  System.out.println("     \\ o o    /");
                                                                  System.out.println("     (_()_)__/ \\");
                                                                  System.out.println("    / _,==.____ \\");
                                                                  System.out.println("   (   |--|      )");
                                                                  System.out.println("   /\\_.|__|'-.__/\\_");
                                                                  System.out.println("  / (        /     \\");
                                                                  System.out.println("  \\  \\      (      /");
                                                                  System.out.println("   )  '._____)    /");
                                                                  System.out.println("(((____.--(((____/");
                                                        System.out.println(nombre + " Se lo esta pasando muy bien c: ");
                                                        felicidad++;
                                                        energia -=10;
                                                        
 //contador muerte//                                                       
                                                        if (energia <= 0) {
                                                        System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                         System.exit(0);
                                                       }

                                                        break;
//alimentar a la mascota//
                                                    case 2:
                                                                 System.out.println("  (()__(()");
                                                                  System.out.println("    /       \\");
                                                                  System.out.println("   ( /    \\  \\");
                                                                  System.out.println("     \\ o o    /");
                                                                  System.out.println("     (_()_)__/ \\");
                                                                  System.out.println("    / _,==.____ \\");
                                                                  System.out.println("   (   |--|      )");
                                                                  System.out.println("   /\\_.|__|'-.__/\\_");
                                                                  System.out.println("  / (        /     \\");
                                                                  System.out.println("  \\  \\      (      /");
                                                                  System.out.println("   )  '._____)    /");
                                                                  System.out.println("(((____.--(((____/");

                                                        System.out.println(nombre + " esta un poco saciado  ");
                                                        hambre--;
                                                        energia-=10;
//contador muerte//
                                                        if (energia <= 0) {
                                                        System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                         System.exit(0);
                                                       }
                                                        break;
           
                                                    case 3:
       //DECLARACION DE VARIABLES SUMAS Y RESTAS//
                                                        
                                                                  System.out.println(" __         __");
                                                                  System.out.println("/  \\.-\"\"\"-./  \\");
                                                                  System.out.println("\\    -   -    /");
                                                                  System.out.println(" |   o   o   |");
                                                                  System.out.println(" \\  .-'''-.  /");
                                                                  System.out.println("  '-\\__Y__/-'");
                                                                  System.out.println("     `---`");
                
                                                           double num1;
                                                         double num2;
                                                         double resultado;
                                                         int operacion;
                                                         System.out.println("por alguna extraña razon " + nombre + " ahora sabe sumar y restar : ");
                                                          inteligencia +=20;
                                                          energia-=9;
                                                         System.out.println("1) Sumar  2) Restar");
                                                         operacion = teclado.nextInt();
                                                         System.out.println("Introduce el primer número:");
                                                         num1 = teclado.nextDouble();
                                                         System.out.println("Introduce el segundo número:");
                                                          num2 = teclado.nextDouble();
                                                          switch (operacion) {
                                                             case 1:
                                                                 resultado = num1 + num2;
                                                               System.out.println("El resultado de la suma es: " + resultado);
                                                                break;

                                                                case 2:
                                                                resultado = num1 - num2;
                                                                System.out.println("El resultado de la resta es: " + resultado);
                                                                break;  

                                                          default:
                                                           System.out.println("Opcion no valida");
                                                                    }
  //contador muerte//                                                                  
                                                  if (energia <= 0) {
                                                           System.out.println(nombre + " está demasiado cansado ,se ha ido a dormir . ¡Fin del juego!");
                                                              System.exit(0);
                                                          }

                                                        break;       
                                                   case 4:
                                                           System.out.println("           _");
                                                           System.out.println("         ,/A\\,");
                                                           System.out.println("       .//`_`\\\\,");
                                                           System.out.println("     ,//`____-`\\\\,");
                                                           System.out.println("    ,//`["+ nombre + "]`  \\\\,");
                                                           System.out.println("  ,//`=  ==  __-  _`\\\\,");
                                                           System.out.println(" //|__=  __- == _  __|\\\\");
                                                           System.out.println(" ` |  __ .-----.  _  | `");
                                                           System.out.println("   | - _/       \\-   |");
                                                           System.out.println("   |__  |        | __=|");
                                                           System.out.println("   |  _=|        |    |");
                                                           System.out.println("   |-__ |        | -__|");
                                                           System.out.println("   |___ |        |____|");
                                                          

                                                        System.out.println(nombre + " se está echando una siesta para recuperar energía.");
                                                        energia +=20;
                                                        break;    
                                                                         
   //estadisticas de la mascota//                                                      
                                       
                                                    case 5:
                                                        System.out.println("Estadisticas de " + nombre + ":");
                                                        System.out.println("Felicidad: " + felicidad);
                                                        System.out.println("Hambre: " + hambre);
                                                        System.out.println("Inteligencia: " + inteligencia);
                                                        System.out.println("energia: " + energia);
                                                        break;     
                                                   
//salir del juego//

                                                    case 6:
                                                        System.out.println("Saliendo del juego...");
                                                        return; 
//opcion no valida//                                                      
                                                    default:
                                                        System.out.println("Opción no válida. Por favor, elige 1, 2 o 3.");
                                                        break;
                                                                  
                                                         }
                                               }
                                       }
                           
                        
                        } else {
                            System.out.println("ponle otro nombre ");
                        }
                    } 
//fin de las mascotas//
                case 2:
                    System.out.println("archivos (en proceso).");
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 3);

        teclado.close();







    }
}
