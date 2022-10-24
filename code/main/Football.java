
package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Football {
    
    @RequestMapping("/get/branch")
    Branch showBranch() {
        return b;
    }
    
    @RequestMapping({"/get/manager","/frank"})
    Manager showFrank() {
        return m;
    }
    @Autowired 
    Branch b;
    @Autowired 
    @Qualifier("first") // if only one manager this @Qualifier have to be disable
    Manager m;
}
