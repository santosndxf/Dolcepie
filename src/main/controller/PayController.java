@RestController
@RequestMapping("/api/pagamentos")
public class PayController {

    @Autowired
    private PayService payService;

    @PostMapping
    public Pay processary(@RequestBody Pay pay) {
        return payService.processar(pay);
    }
}
