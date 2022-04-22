function y1=lagrange(x,y,x1)
%este programa obtiene el valor interpolado y1 correspondiente al valor x1
%empleando el polinomio interpolador de Lagrange de grado n, obtenido a
%partir de los vectores x e y (de longitud n)
%obtenemos el tama~no del conjunto de datos,
n=length(x);
%inicializamos la variable de salida
y1=0;
%construimos el valor a partir de los polinomios de Lagrange,
for j=1:n
%inicializamos el polinomio de Lagrange correspondiente al dato i
lj=1;
%y lo function y1=lagrange(x,y,x1)
%este programa obtiene el valor interpolado y1 correspondiente al valor x1
%empleando el polinomio interpolador de Lagrange de grado n, obtenido a
%partir de los vectores x e y (de longitud n)
%obtenemos el tama~no del conjunto de datos,
n=length(x);
%inicializamos la variable de salida
y1=0;
%construimos el valor a partir de los polinomios de Lagrange,
for j=1:n
%inicializamos el polinomio de Lagrange correspondiente al dato i
lj=1;
%y lo calculamos...
for i=1:j-1
lj=lj*(x1-x(i))/(x(i)-x(j));
end
for i=j+1:n
lj=lj*(x1-x(i))/(x(i)-x(j));
end
%sumamos la contribuci�n del polinomio de Lagrange lj
y1=y1+lj*y(j);
end
calculamos...
for i=1:j-1
lj=lj*(x1-x(i))/(x(i)-x(j));
end
for i=j+1:n
lj=lj*(x1-x(i))/(x(i)-x(j));
end
%sumamos la contribuci�n del polinomio de Lagrange lj
y1=y1+lj*y(j);
end