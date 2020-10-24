package pl.sda.moneymanager.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.moneymanager.dto.GithubRepoDto;
import pl.sda.moneymanager.service.GithubService;

import java.util.List;

@RestController
@RequestMapping("/github-int")
public class GitHubIntegrationController {

    private final GithubService githubService;

    public GitHubIntegrationController(final GithubService githubService) {
        this.githubService = githubService;
    }

    @GetMapping("/my-repos")
    public List<GithubRepoDto> myRepos() {

        return githubService.allUserRepos();
    }
}
