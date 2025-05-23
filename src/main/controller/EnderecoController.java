@RestController
@RequestMapping("/api/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/{usuarioId}")
    public List<Endereco> listarEnderecos(@PathVariable Long usuarioId) {
        return enderecoService.listarPorUsuario(usuarioId);
    }

    @PostMapping
    public Endereco adicionarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.salvar(endereco);
    }
}
