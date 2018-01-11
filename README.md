# [Codecov][1] Scala Example

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
  - `addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")` as [seen here](https://github.com/codecov/example-scala/blob/master/project/plugins.sbt#L1)
2. Add `coverage` and `coverageReport` to `sbt`
  - `sbt clean coverage test coverageReport` as [seen here](https://github.com/codecov/example-scala/blob/master/.travis.yml#L7)
## Caveats
### Private Repos
Add to your `.travis.yml` file.
```yml
after_success:
  - bash <(curl -s https://codecov.io/bash) -t uuid-repo-token
```
## Support

### Contact
- Intercom (in-app messanger)
- Email: support@codecov.io
- Slack: slack.codecov.io
- [gh/codecov/support](https://github.com/codecov/support)

1. More documentation at https://docs.codecov.io
2. Configure codecov through the `codecov.yml`  https://docs.codecov.io/docs/codecov-yaml



[1]: https://codecov.io/
[2]: https://github.com/codecov/example-php/blob/master/.travis.yml#L15
[3]: https://github.com/codecov/example-php/blob/master/.travis.yml#L18
[4]: https://github.com/codecov/codecov-python
