package clase.ejercicio4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import clase.ejercicio4.model.Producto;

@RestController
@RequestMapping("/api/productos")
public class ProductoRestController {

    private final List<Producto> productos = new ArrayList<>();

    @PostMapping("/registrar")
    public Producto registrarProducto(@RequestBody Producto producto) {
        productos.add(producto);
        return producto;
    }

    @GetMapping("/listar")
    public List<Producto> listarProductos() {
        return productos;
    }
}
