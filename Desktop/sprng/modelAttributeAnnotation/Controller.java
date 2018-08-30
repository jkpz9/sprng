@Controller
@ControllerAdvice
public class EmployeeController {
 
    private Map<Long, Employee> employeeMap = new HashMap<>();
 
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public String submit(
      @ModelAttribute("employee") Employee employee,
      BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", employee.getName());
        model.addAttribute("id", employee.getId());
 
        employeeMap.put(employee.getId(), employee);
 
        return "employeeView";
    }
 
    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("msg", "Welcome to the Netherlands!");
    }
}