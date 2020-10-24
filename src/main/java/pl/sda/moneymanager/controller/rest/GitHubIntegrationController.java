package pl.sda.moneymanager.controller.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.sda.moneymanager.dto.GithubRepoDto;
import pl.sda.moneymanager.service.GithubService;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/github-int")
@Slf4j
public class GitHubIntegrationController {

    private static final String myReposUrl = "https://api.github.com/users/mariuszpastuszka/repos";

    private final GithubService githubService;

    public GitHubIntegrationController(final GithubService githubService) {

        this.githubService = githubService;
    }

    @GetMapping("/my-repos")
    public List<GithubRepoDto> myRepos() {
        log.info("my repos");
        return githubService.allUserRepos();
//
    }

    @GetMapping("/repos/{userName}")
    public List<GithubRepoDto> userRepos(@PathVariable("userName") String userName) {
        log.info("user repos, user name =[{}]", userName);
        return githubService.allRepoOfGivenUsers(userName);
    }

    @PostMapping("/repos")
    public ResponseEntity<GithubRepoDto> createReo (@RequestBody GithubRepoDto repoToCreate) {
        log.info("github  repo to create: [{}]",repoToCreate);
        return ResponseEntity.created(URI.create("/repos/1")).build();
    }

}
