package main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
class Setup {
//    @Bean
//    BranchStorage create1() {
//        return new BranchStorage();
//    }
//     @Bean
//    BranchStorage create2() {
//        BranchStorage b = new BranchStorage();
//        b.list[3] = "Bangkok";
//        return b;
//    }
    @Bean
    String love() {
        return "I love you.";
    }
    @Bean
    String hate() {
        return "I hate you.";
    }
    @Bean("first")
    Manager manager1 () {
        Manager m = new Manager();
        m.name = "Frank Lampard";
        m.salary = 42000;
        return m;
    }
    @Bean("second")
    Manager manager2 () {
        Manager m = new Manager();
        m.name = "Stephen Gerrard";
        m.salary = 40000;
        return m;
    }
    @Bean("my-team")
    Branch team1(@Qualifier("second") Manager m) { //parameter injection
        Branch b = new Branch();
        b.name = "Arsenal";
        b.area = 350;
        b.manager = m;
        return b;
    }
}

class Branch {
    public String name;
    public double area;
    public Manager manager;
}

class Manager {
    public String name;
    double salary; // not public not show
}