package pl.sda.moneymanager.controller.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.moneymanager.dto.GithubRepoDto;
import pl.sda.moneymanager.service.GithubService;

import java.util.List;

@RestController
@RequestMapping("/github-int")
@Slf4j
public class GitHubIntegrationController {

    private final GithubService githubService;

    public GitHubIntegrationController(final GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/my-repos")
    public List<GithubRepoDto> myRepos() {
        log.info("my repos");
        return githubService.allUserRepos();
    }

    @GetMapping("/repos/{userName}")
    public List<GithubRepoDto> userRepos(@PathVariable("userName") String userName) {
        log.info("user repos, user name = [{}]", userName);
        return githubService.allReposOfGivenUser(userName);
    }
}
