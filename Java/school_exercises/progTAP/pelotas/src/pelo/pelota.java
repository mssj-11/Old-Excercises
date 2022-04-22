/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelo;
import java.applet.*; 
import java.awt.*;

/**
 *
 * @author HP
 */
public class pelota extends Applet implements Runnable 
{ 
int PosX=20,PosY=50; //Posición de la pelota 

int DirX=PosX % 10 +1; //Dirección de la pelota 
int DirY=PosY % 10 +1; //Dirección de la pelota 
int radioPelota=10;	//Radio de la pelota 
Thread hilo; 

@Override
public void start() 
{ 
if(hilo== null) 
{ 
hilo= new Thread(this); 
hilo.start(); 
} 
} 

@Override
public void run() 
{ 
while(true) 
{ 
mover(); //Función que mueve la pelota 
repaint(); 

try { Thread.sleep(10); 
} catch (InterruptedException exc) { } 

} 
} 


public void mover() 
{ 
PosX+=DirX; 
PosY+=DirY; 

//Controlo que cuando toca el borde, cambie de direccion 
if ((PosX-radioPelota) <= 0) 
DirX*= -1; 
else if ((PosX+radioPelota) >= getWidth())
DirX*= -1; 

if ((PosY-radioPelota) <= 0) 
DirY*= -1; 
else if ((PosY+radioPelota) >= getHeight()) 
DirY*= -1; 
} 

public void paint(Graphics g) 
{ 
g.setColor(Color.RED); 
g.fillOval(PosX-radioPelota, PosY-radioPelota, radioPelota*2, radioPelota*2); 
} 
} 

