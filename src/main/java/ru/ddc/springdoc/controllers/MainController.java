package ru.ddc.springdoc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "",
        description = ""
)
@RestController
@RequestMapping("/")
public class MainController {

    @Operation(
            summary = "",
            description = ""
    )
    @PostMapping
    public void lskdfj(@RequestParam Long sdf) {

    }
}
