#	 Configurar tu perfil en Git Bash para la línea de comandos:
##	1.	Configurar nombre de usuario:
•	Establece tu nombre de usuario en Git. <br>
####	Ejemplo:
```sh
git config --global user.name "Tu Nombre" 
```

##	2.	Configurar dirección de correo electrónico:
•	Asocia tu dirección de correo electrónico con Git. <br>
####	Ejemplo:
```sh
git config --global user.email "tucorreo@example.com" 
```

##	3.	Configurar editor de texto (opcional):
•	Puedes configurar el editor de texto que prefieres para los mensajes de confirmación. <br>
####	Ejemplo:
```sh
git config --global core.editor "nombre_del_editor" 
```

##	4.	Ver la configuración global:
•	Para verificar la configuración global que has establecido. <br>
####	Ejemplo:
```sh
git config --global --list
```











#	Comandos GIT de uso cotidiano


##	1.	git init
•	Inicializa un repositorio GIT en el directorio actual. <br>
####	Ejemplo:
```sh
git init
```
##	2.	git clone <URL>
•	Clona un repositorio remoto en tu máquina local. <br>
####	Ejemplo:
```sh
git clone https://github.com/tuusuario/turepositorio.git
```
##	3.	git add <archivo>
•	Agrega cambios al área de preparación (staging). <br>
####	Ejemplo:
```sh
git add archivo.txt
```
##	4.	git status
•	Muestra el estado de los archivos en el repositorio. <br>
####	Ejemplo:
```sh
git status
```
##	5.	git commit -m "Mensaje"
•	Confirma cambios en el repositorio con un mensaje descriptivo. <br>
####	Ejemplo:
```sh
git commit -m "Agregado archivo de configuración"
```
##	6.	git pull
•	Actualiza el repositorio local con los cambios remotos. <br>
####	Ejemplo:
```sh
git pull
```
##	7.	git push
•	Envía los cambios locales al repositorio remoto. <br>
####	Ejemplo:
```sh
git push origin master
```
##	8.	git branch
•	Lista ramas locales y resalta la rama actual. <br>
####	Ejemplo:
```sh
git branch
```
##	9.	git checkout <nombre_rama>
•	Cambia a una rama existente. <br>
####	Ejemplo:
```sh
git checkout feature-nueva
```
##	10.	git merge <nombre_rama>
•	Fusiona cambios de una rama en la rama actual. <br>
####	Ejemplo:
```sh
git merge feature-nueva
```
##	11.	git log
•	Muestra el historial de confirmaciones (commits). <br>
####	Ejemplo:
```sh
git log
```
##	12.	git reset <archivo>
•	Desecha cambios en el área de preparación (staging) de un archivo. <br>
####	Ejemplo:
```sh
git reset archivo.txt
```
##	13.	git stash
•	Guarda cambios locales en una pila temporal. <br>
####	Ejemplo:
```sh
git stash
```
##	14.	git remote -v
•	Lista los repositorios remotos configurados. <br>
####	Ejemplo:
```sh
git remote -v
```
##	15.	git fetch
•	Obtiene información sobre cambios remotos sin fusionar. <br>
####	Ejemplo:
```sh
git fetch
```
##	16.	git diff
•	Muestra diferencias entre archivos sin confirmar. <br>
####	Ejemplo:
```sh
git diff
```

