package clase.ejercicio4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import clase.ejercicio4.model.Producto;

@Controller
public class ProductoController {
     @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "formulario";
    }

    @PostMapping("/registrar")
    public String registrarProducto(@ModelAttribute Producto producto, Model model) {
        model.addAttribute("producto", producto);
        return "confirmacion";
    }

    @PostMapping("/producto/json")
    @ResponseBody
    public Producto obtenerProductoJson(@RequestBody Producto producto) {
        return producto;
    }
}
