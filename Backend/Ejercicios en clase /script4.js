const mensaje = confirm ("Digite la cantidad de productos");
console.log(mensaje)
let cantidad_productos = parseInt(prompt());    
let lista_nombre = []
let subtotal = 0
let total_a_pagar = 0

for (let i = 1; i <= cantidad_productos; i++) {
    const mensaje_nombre = confirm ("Digite el nombre del producto");
    let nombre_producto = prompt(); 
    lista_nombre.push(nombre_producto);
    console.log (lista_nombre)
    const mensaje_precio = confirm ("Digite el precio del producto");
    let precio_producto = parseInt(prompt());
    if (precio_producto > 20000){
          let precio_final= precio_producto - (precio_producto* 0.20)
          console.log(precio_final)
          alert(`El producto ${nombre_producto} tiene un valor de ${ precio_final}`)
          subtotal += precio_producto
          total_a_pagar += precio_final

    }

    else if (precio_producto > 10000){
        let precio_final = precio_producto - (precio_producto * 0.10);
        console.log (precio_final)
        alert(`El producto ${nombre_producto} tiene un valor final de ${precio_final}`)
        subtotal += precio_producto
        total_a_pagar += precio_final
    
    }

    else if (precio_producto > 5000){
        let precio_final = precio_producto - (precio_producto*0.05);
        console.log (precio_final)
        alert(`El producto ${nombre_producto} tiene un valor final de ${precio_final}`)
        subtotal += precio_producto
        total_a_pagar += precio_final

    }
}

alert(`el subtotal de toda la cuenta es de ${subtotal} y el total, con descuento,  es de ${total_a_pagar} `);

