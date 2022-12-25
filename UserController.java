@RestController
@RequestMapping("/users")
public class UserController {

   private List<User> users = new ArrayList<>();

   @GetMapping
   public List<User> getAllUsers() {
      return users;
   }

   @PostMapping
   public void addUser(@RequestBody User user) {
      users.add(user);
   }
}
