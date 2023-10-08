package ahmetdavresh.DemoAppSpringBoot.lab01tasks;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HashMapController {
    private List<String> arrayList = new ArrayList<>();
    private Map<Integer, String> hashMap = new HashMap<>();

    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam("s") String s) {
        if (arrayList.isEmpty()) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(s);
        return "Значение '" + s + "' было добавлено в ArrayList.";
    }
    @GetMapping("/show-array")
    public List<String> showArrayList() {
        return arrayList;
    }
    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam("s") String s) {
        if (hashMap.isEmpty()) {
            hashMap = new HashMap<>();
        }
        int key = hashMap.size() + 1;
        hashMap.put(key, s);

        return "Значение '" + s + "' было добавлено в HashMap с ключом " + key;
    }
    @GetMapping("/show-map")
    public Map<Integer, String> showHashMap() {
        return hashMap;
    }
    @GetMapping("/show-all-length")
    public String showAllLength() {
        int arrayListLength = arrayList.size();
        int hashMapLength = hashMap.size();
        return "Количество элементов в ArrayList: " + arrayListLength + "<br>Количество элементов в HashMap: " + hashMapLength;
    }
}

