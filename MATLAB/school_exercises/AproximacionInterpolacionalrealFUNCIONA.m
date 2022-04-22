x=input('Introduce la funcion x ');
fx=input('Introduce la funcion fx ');
x=[50 60 70 80 90 100];
fx=[24.94 30.11 36.05 42.84 50.57 59.30];
N=6; h=10; 
for i=1 :N-1
	T(i,1)=fx(i+1)-fx(i);
	end
for j=2: N-1
    for i=j :N-1
	T(i,j)=T(i,j-1) -T(i-1,j-1);
    end 	
end
T
Xint=98;
s=(Xint-x(N))/h;
px=fx(6)+s*T(5,1);
fprintf(' T(%6.2f)= %6.2f \n ' ,Xint,px)
px=fx(6)+s*T(5,1)+s*(s-1)/2*T(4,2);
fprintf(' T(%6.2f)= %6.2f \n', Xint,px)
