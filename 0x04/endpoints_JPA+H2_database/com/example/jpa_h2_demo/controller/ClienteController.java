@RestController
        public class ClienteController {

          @Autowired
          private ClienteRepository clienteRepository;

          @PostMapping("/addClient")
          public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente) {
            // TODO
          }

          @GetMapping("/findAllClients")
          public ResponseEntity<List<Cliente>> findAllClients() {
            // TODO
          }

          @GetMapping("/findClientById/{id}")
          public ResponseEntity<Cliente> findClientById(@PathVariable("id") Long idClient) {
            // TODO
          }

          @DeleteMapping("/removeClientById/{id}")
            @ResponseStatus(HttpStatus.NO_CONTENT)
            public void removerCliente(@PathVariable("id") Long idClient){
            // TODO
            }

          @PutMapping("/updateClientById/{id}")
            @ResponseStatus(HttpStatus.NO_CONTENT)
            public void updateCliente(@PathVariable("id") Long id, @RequestBody Cliente cliente){
            // TODO
            }
        }