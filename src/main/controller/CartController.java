@RestController
@RequestMapping("/api/admins")
public class AdmController {

    @Autowired
    private AdministradorService admService;

    @GetMapping
    public List<Administrador> listarAdministradores() {
        return admService.listarTodos();
    }
}

