
//ejemplo de estructuras cíclicas while
let n = 0;
let x = 0;

while (n<4) {
    n++;
    x += n;
    console.log('Este es el valor de  n: ', n);
    console.log('Este es el valor de  x: ', x);


}

//ejemplo de estructuras ciclicas for
for (let index = 0; index < 10; index++) {
   
    
}

for (let i = 0; i <= 10; i++) {
document.write(i);
document.write("<br>");

}
//factorial de 5

let factorial = 5;
let resultado = 1;
for (let i = factorial; i >= 1; i--) {

    resultado = resultado*i;
    
    
}
        
console.log('el resultado del factorial de 5 es', resultado); 

//estructuras condicionales 

const name = "PacoLuis" 

if(typeof name ==="string"){
    console.log(`Hola ${name}`);
}

else {
    console.log('Por favor escriba un caracter válido')
}

//condicionales múltiples

const num1 = 3;
const num2 = 4;

if(num1>num2 ){
    console.log("verdadero, "  ,num1 , "es mayor a  ", num2)
}else if (num1 === num2) {
    console.log( "Los valores son iguales")
} else {
    console.log("Falso," ,num1 ,"no es mayor a ", num2)
}
//Estructura de Switch Case
switch (num1) {
    case 3:
        console.log("el número es igual a 3")
        
        break;

    default:
        console.log("el número es diferente a 3")

    break;
}
//Operadores lógicos
const variable1 = 3;
const variable2 = '3';

//Igualdad

console.log(variable1 == variable2)

//Igualdad Estricta
 console.log(variable1 === variable2)
 