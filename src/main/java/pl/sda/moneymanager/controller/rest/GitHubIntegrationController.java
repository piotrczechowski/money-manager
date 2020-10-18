package pl.sda.moneymanager.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pl.sda.moneymanager.dto.GithubRepoDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/github-int")
public class GitHubIntegrationController {

    private static final String myReposUrl = "https://api.github.com/users/mariuszpastuszka/repos";
    private final RestTemplate restTemplate;

    public GitHubIntegrationController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/my-repos")
    public List<GithubRepoDto> myRepos() {

//        String[].class
//        List.class
//        List<String>.class
//        List<GithubRepoDto>.class
        var requestResult = restTemplate.getForObject(myReposUrl, GithubRepoDto[].class);
        return Arrays.asList(requestResult);
    }
}
