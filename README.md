# Annotations 🎯

## 📄 Descripció - Enunciat de l'exercici

Aquest projecte està format per 3 exercicis que exploren annotations a Java:

### Nivell 1 ⭐
#### Exercici 1: @Override
L'exercici ensenya l'ús de l'anotació @Override en una jerarquia de classes, on una classe pare (Treballador) defineix un mètode calcularSou() que és sobreescrit per les classes filles (TreballadorOnline i TreballadorPresencial) amb diferents implementacions: una afegint una tarifa plana d'Internet (constant) i l'altra afegint despeses de benzina (static).

Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure,  emprant @Override. Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe. En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.

#### Exercici 2: @Deprecated
L'exercici ensenya a utilitzar les anotacions @Deprecated per marcar mètodes com obsolets en les classes filles i @SuppressWarnings("deprecation") per suprimir els avisos quan aquests mètodes són utilitzats des d'una altra classe.

Afegeix a les classes filles alguns mètodes obsolets (deprecated), i utilitza l’anotació corresponent. Invoca des d'una classe externa els mètodes obsolets, suprimint mitjançant l'anotació corresponent els “warnings” per ser obsolets.

### Nivell 2 ⭐⭐
#### Exercici 1: JSON
L'exercici ensenya a crear una anotació personalitzada (@JsonSerializable) que inclou un paràmetre per especificar el directori destí, i s'utilitza per marcar classes que poden ser serialitzades automàticament a format JSON.

Crea una anotació personalitzada que ha de permetre serialitzar un objecte Java en un fitxer JSON. L’anotació ha de rebre el directori on es col·locarà el fitxer resultant.

## 💻 Tecnologies Utilitzades

- Java SE Development Kit (JDK) 17
- IntelliJ IDEA
- Git
- GitHub

## 📋 Requisits

- Java JDK 17 o superior
- IntelliJ IDEA (Community o Ultimate Edition)
- Git instal·lat al sistema

## 🛠️ Instal·lació

1. Clona el repositori:
```bash
git clone https://github.com/EnricW/1.7-Annotations.git
```

2. Obre el projecte amb IntelliJ IDEA:
   - Obre IntelliJ IDEA
   - File -> Open
   - Selecciona la carpeta del projecte
   - Espera que el projecte s'indexi i es configurin les dependències

## ▶️ Execució

1. Navega fins a la classe principal que conté el mètode main
2. Fes clic dret sobre la classe
3. Selecciona "Run Main.main()"
