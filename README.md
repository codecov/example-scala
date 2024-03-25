# [Codecov](https://codecov.io) Scala Example
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fcodecov%2Fexample-scala.svg?type=shield)](https://app.fossa.com/projects/git%2Bgithub.com%2Fcodecov%2Fexample-scala?ref=badge_shield)


## Guide

### GitHub Actions Setup
You should first get the repository upload token from [codecov](https://docs.codecov.com/docs/quick-start#step-2-get-the-repository-upload-token)

Add the following to your `.github/workflows/test.yml` file. 
```yml
name: Test workflow

on: [push, pull_request]

jobs:
  build:
    runs-on: ubuntu-latest
    name: Test scala
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          distribution: 'adopt'
          java-version: '21'
      - name: Run tests
        run: sbt coverage test coverageReport
      - uses: codecov/codecov-action@v4
        with:
          fail_ci_if_error: true
          token: ${{ secrets.CODECOV_TOKEN }}
```

Here we frist checkout the code, then setup java, run the tests and generate the coverage report. Finally, we upload the report to codecov using the codecov-action.

When all finished, you could also add a badge on readme like following.

```
[![codecov](https://codecov.io/gh/YOUR_ACCOUNT/YOUR_REPO/branch/YOUR_BRANCH/graph/badge.svg)](https://codecov.io/gh/YOUR_ACCOUNT/YOUR_REPO)
```

### Produce Coverage Reports

1. Add `scoverage` to plugin list
  - `addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.11")` as [seen here](https://github.com/codecov/example-scala/blob/master/project/plugins.sbt#L1)
1. Add `coverage` and `coverageReport` to `sbt`
  - `sbt clean coverage test coverageReport` as [seen here](https://github.com/codecov/example-scala/blob/master/.travis.yml#L7)

## Caveats
### Private Repo
Repository tokens are required for 
- (a) all private repos, 
- (b) public repos not using Travis-CI, CircleCI or AppVeyor. 

Find your repository token at Codecov and provide via appending `-t <your upload token>` to you where you upload reports.

## Links
- [Community Boards](https://community.codecov.io)
- [Support](https://codecov.io/support)
- [Documentation](https://docs.codecov.io)


## License
[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fcodecov%2Fexample-scala.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fcodecov%2Fexample-scala?ref=badge_large)