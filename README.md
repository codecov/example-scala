# [Codecov](https://codecov.io) Scala Example

## Guide

### Travis Setup

Add to your `.travis.yml` file.
```yml
language: scala
after_success:
  - bash <(curl -s https://codecov.io/bash)
```

### Produce Coverage Reports

1. Add `scoverage` to plugin list
  - `addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")` as [seen here](https://github.com/codecov/example-scala/blob/master/project/plugins.sbt#L1)
1. Add `coverage` and `coverageReport` to `sbt`
  - `sbt clean coverage test coverageReport` as [seen here](https://github.com/codecov/example-scala/blob/master/.travis.yml#L7)

## Caveats
### Private Repo
Repository tokens are required for (a) all private repos, (b) public repos not using Travis-CI, CircleCI or AppVeyor. Find your repository token at Codecov and provide via appending `-t <your upload token>` to you where you upload reports.

## Links
- [Community Boards](https://community.codecov.io)
- [Support](https://codecov.io/support)
- [Documentation](https://docs.codecov.io)
