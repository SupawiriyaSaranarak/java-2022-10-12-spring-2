package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Sample {
    @RequestMapping("/show")
    String show() {
        return "I love you";
    }
     
//    @RequestMapping("/api/list/branch") // Java method
//    String[] listBranch() {
//        BranchStorage b = new BranchStorage();
//        return b.list;
//    }
    
    @RequestMapping("/api/branch/list")
    String[] branchList() {
        return branchStorage.list;
    }
    
    @RequestMapping("/player")
    PlayerStorage show1 () {
        return playerStorage;
    }
    
    // 1. Field Injection --------------------------
//    @Autowired // Bean already create since add @Repository, but @Autowired use to introduce the address of this bean to this class or wiring the bean to this class 
////    @Qualifier("create2") // if there are more than 2 bean @Autowired wil cause a problem so we need to specified which bean we need to use
//    BranchStorage storage; 
//    @Autowired
//    PlayerStorage playerStorge;
    // ------------------------------ end 1.
    
    // 2. Method Injection --------------------------
//    BranchStorage branchStorage;
//    @Autowired
//    void setBranchStorage(BranchStorage bs) {
//        branchStorage = bs;
//    }
    
    // ------------------------------- end 2.
    
    
    // 3. Constructor Injection --------------------------
    BranchStorage branchStorage;
    PlayerStorage playerStorage;
    Sample(BranchStorage bs, PlayerStorage ps) {
        branchStorage = bs;
        playerStorage = ps;
    }
    
    // ------------------------------- end 3.
    
}

@Repository 
class BranchStorage {
    String[] list = {"London", "New York", "Paris", "Sydney"};
}

@Repository 
class PlayerStorage {
    public String player = "Bill Gates";
}