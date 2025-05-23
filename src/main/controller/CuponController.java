@RestController
@RequestMapping("/api/cupons")
public class CuponController {

    @Autowired
    private CuponService cuponService;

    @PostMapping
    public Cupon criarCupon(@RequestBody Cupon cupon) {
        return cuponService.salvar(cupon);
    }

    @GetMapping("/validar/{codigo}")
    public boolean validarCupon(@PathVariable String codigo) {
        return cuponService.validar(codigo);
    }
}
