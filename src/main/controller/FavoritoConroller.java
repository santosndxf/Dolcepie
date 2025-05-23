@RestController
@RequestMapping("/api/favoritos")
public class FavoritoController {

    @Autowired
    private FavoritoService favoritoService;

    @PostMapping
    public Favorito adicionarFavorito(@RequestBody Favorito favorito) {
        return favoritoService.adicionar(favorito);
    }

    @GetMapping("/{usuarioId}")
    public List<Produto> listarFavoritos(@PathVariable Long usuarioId) {
        return favoritoService.listarPorUsuario(usuarioId);
    }
}
