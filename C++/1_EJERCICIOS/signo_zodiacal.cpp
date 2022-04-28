/*Este programa muestra el signo zodiacal de una persona. Para ello el usuario debe introducir únicamente el día 
	y el mes de nacimiento y el programa determinará inmediatamente el signo zodiacal de la persona.*/
#include<conio.h> 
#include<stdio.h> 

int main() 
{      
      //Declaración de variables. 
      int mes, dia; 
       
      printf("Introduzca el mes de su nacimiento: "); 
      scanf("%i", &mes); 
       
      //Ciclo para evitar el ingreso de un mes inválido. 
      while(mes >= 13 || mes <= 0) 
      { 
      printf("Introduzca un mes de nacimiento v%clido: ", 160); 
      scanf("%i", &mes); 
      } 
       
      printf("\nIntroduzca el d%ca de su nacimiento: ", 161); 
      scanf("%i", &dia); 
       
      //Ciclo para evitar el ingreso de un día inválido. 
      while(dia >= 32 || dia <= 0) 
      { 
      printf("Introduzca un d%ca de nacimiento v%clido: ", 161, 160); 
      scanf("%i", &dia);           
      } 
       
      //Condicional, signo zodiacal Aries (21/3 - 20/4) 
      if((mes == 3 && dia >= 21) || (mes == 4 && dia <=20)) 
      printf("\nSu signo zodiacal es: Aries."); 
       
      //Condicional, signo zodiacal Tauro (21/4 - 21/5) 
      else if((mes == 4 && dia >=21) || (mes == 5 && dia <= 21)) 
      printf("\nSu signo zodiacal es: Tauro."); 
       
      //Condicional, signo zodiacal Géminis (22/5 - 21/6) 
      else if((mes == 5 && dia >= 5) || (mes == 6 && dia <= 21)) 
      printf("\nSu signo zodiacal es: G%cminis", 134); 
       
      //Condicional, signo zodiacal Cáncer (21/6 - 23/7) 
      else if((mes == 6 && dia >= 21) || (mes == 7 && dia <= 23)) 
      printf("\nSu signo zodiacal es: C%cncer.", 160); 
       
      //Condicional signo zodiacal Leo (24/7 - 23/8) 
      else if((mes == 7 && dia >= 24) || (mes == 8 && dia <= 23)) 
      printf("\nSu signo zodiacal es: Leo"); 
       
      //Condicional signo zodiacal Virgo (24/8 - 23/9) 
      else if((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) 
      printf("\nSu signo zodiacal es: Virgo."); 
       
      //Condicional signo zodiacal Libra (24/9 - 23/10) 
      else if((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) 
      printf("\nSu signo zodiacal es: Libra."); 
       
      //Condicional signo zodiacal Escorpio (24/10 - 22/11) 
      else if((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) 
      printf("\nSu signo zodiacal es: Escorpio"); 
       
      //Condicional signo zodiacal Sagitario (23/11 - 21/12) 
      else if((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) 
      printf("\nSu signo zodiacal es: Sagitario"); 
       
      //Condicional signo zodiacal Capricornio (22/12 - 20/1) 
      else if((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) 
      printf("\nSu signo zodiacal es: Capricornio."); 
       
      //Condiconal signo zodiacal Acuario (21/1 - 19/2) 
      else if((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) 
      printf("\nSu signo zodiacal es: Acuario."); 
       
      //Condicional signo zodiacal Picis (20/2 - 20/3) 
      else if((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) 
      printf("\nSu signo zodiacal es; Picis"); 
       
      getch(); 
      return 0; 
       
      }
      
      /*	OPCION 2
	  #include <iostream>
using namespace std;
int main()
{
      int mes, dia;
      cout<<"\t\t\tSIGNO ZODIACAL"<<endl;
      cout<<"(1)Enero  \t(2)Febrero  \t(3)Marzo  \t(4)Abril"<<endl;
      cout<<"(5)Mayo  \t(6)Junio     \t(7)Julio  \t(8)Agosto"<<endl;
      cout<<"(9)Septiembre  \t(10)Octubre  \t(11)Noviembre  \t(12)Diciembre"<<endl<<endl;
      cout<<"Ingrese la fecha de su cumplea"<<char(164)<<"o (dia y mes)"<<endl;
      cin>>dia>>mes;
      switch(mes)
      {
//enero     case 1:if(dia<21) cout<<"Capricornio"<<endl;
                        else      cout<<"Acuario"<<endl;break;
 
// febrero    case 2:if(dia<21) cout<<"Acuario"<<endl;
                        else      cout<<"Piscis"<<endl;break;
 
//marzo       case 3:if(dia<21) cout<<"Piscis"<<endl;
                        else      cout<<"Aries"<<endl;break;
 
//abril       case 4:if(dia<21) cout<<"Aries"<<endl;
                        else      cout<<"Tauro"<<endl;break;
 
//mayo        case 5:if(dia<22) cout<<"Tauro"<<endl;
                        else      cout<<"Geminis"<<endl;break;
 
//junio       case 6:if(dia<22) cout<<"Geminis"<<endl;
                        else      cout<<"Cancer"<<endl;break;
 
//julio       case 7:if(dia<23) cout<<"Cancer"<<endl;
                        else      cout<<"Leo"<<endl;break;
 
//agosto      case 8:if(dia<23) cout<<"Leo"<<endl;
                        else      cout<<"Virgo"<<endl;break;
 
//septiembre  case 9:if(dia<24) cout<<"Virgo"<<endl;
                        else      cout<<"Libra"<<endl;break;
 
//octubre     case 10:if(dia<25)cout<<"Libra"<<endl;
                        else      cout<<"Escorpio"<<endl;break;
 
//noviembre   case 11:if(dia<23)cout<<"Escorpio"<<endl;
                        else      cout<<"Sagitario"<<endl;break;
 
//diciembre   case 12:if(dia<22)cout<<"Sagitario"<<endl;
                        else      cout<<"Capricornio"<<endl;break;
 
                default:cout<<"INGRESE UNA FECHA VALIDA"<<endl;
      }
cin.ignore();return 0;
}
	  
	  
	  */