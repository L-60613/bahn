package com.example.bahn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BstController {
    private final BstProvider bstProvider;

    @Autowired
    public BstController(BstProvider bstProvider){
        this.bstProvider = bstProvider;
    }

    @GetMapping("/betriebsstelle/{code}")
    public Bst getBst(@PathVariable String code) {
        Bst bst = bstProvider.findByCode(code.toUpperCase());
        System.out.println(bst);                                //zur Kontrolle
        if (bst == null) {
            throw new BstNotFoundException(code);
        }
        return bst;
    }
}
