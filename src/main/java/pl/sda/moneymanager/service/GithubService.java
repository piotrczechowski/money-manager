package pl.sda.moneymanager.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.sda.moneymanager.dto.GithubRepoDto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
@Slf4j

public class GithubService {
    public static final String REPO_USER = "user";
    private static final String myReposUrl = String.format("https://api.github.com/users/{user}/repos", REPO_USER);
    private final RestTemplate restTemplate;

    public GithubService(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<GithubRepoDto> allUserRepos() {


//        List.class
//        List<String>.class
//        List<GithubRepoDto>.class
        return allRepoOfGivenUsers("piotrczechowski");
    }

    public List<GithubRepoDto> allRepoOfGivenUsers(String repoUser) {
        log.info("getting alle repos for use: [{}]", repoUser);

        Map<String,?> params = Map.of(REPO_USER, repoUser);

        var requestResult = restTemplate.getForObject(myReposUrl, GithubRepoDto[].class,
                params);

        log.info("number of element in result: [{}]", requestResult != null ? requestResult.length : 0);
        log.debug("all result: {}", Arrays.toString(requestResult));
//        return Arrays.asList(requestResult != null ? requestResult : new GithubRepoDto[0]);
        return requestResult != null ? Arrays.asList(requestResult) : Collections.emptyList();
    }
}
