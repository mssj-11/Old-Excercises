fprintf('Interpolacion con el Metodo del Polinomio de Lagrange\n\n');
n=input('grado del polinolio: ');
for i=1:n+1 
    x(1,i)=input('dame los valores de xi: '); 
end
for i=1:n+1 
    xi(1,i)=input('dame los valores de f(xi): '); 
end
x; 
xi 
xint=input('Numero para el que desea interpolar x: '); 
