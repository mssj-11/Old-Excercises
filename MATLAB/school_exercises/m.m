clear
x=input('INGRESA LA MATRIZ DE X: ');
%[5 20 40]
fx=input('INGRESA LA MATRIZ DE Y: ');
%[113 181 214.5]
M=3; N=M-1;

for i=1:N
T(i,1) = (fx(i+1)-fx(i))/(x(i+1)-x(i));
end
for j=2:N
for i=j:N
T(i,j) = (T(i,j-1)-T(i-1,j-1))/(x(i+1)-x(i-j+1));
end
end
T
Xint=30;
px2=fx(1) +T(1,1) *(Xint-x(1))+T(2,2)*(Xint-x(1))*(Xint-x(2));
fprintf('T(%2d) = %6.1f\n',Xint,px2)