package ahmetdavresh.DemoAppSpringBoot.lab01tasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ArrayListController {
    private List<String> stringList = new ArrayList<>();
    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam("s") String s) {
        if (stringList.isEmpty()) {
            stringList = new ArrayList<>();
        }
        stringList.add(s);
        return "Значение '" + s + "' было добавлено в список.";
    }
    @GetMapping("/show-array")
    public List<String> showArrayListController() {
        return stringList;
    }
}
