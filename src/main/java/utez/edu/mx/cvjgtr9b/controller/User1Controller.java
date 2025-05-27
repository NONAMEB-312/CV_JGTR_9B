package utez.edu.mx.cvjgtr9b.controller;

@RestController
@RequestMapping("/api/user1")
@CrossOrigin("*")
public class User1Controller {
    @GetMapping("")
    public String getMessage(){
        return "Hola desde el controlador 1";
    }
}
