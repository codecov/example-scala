Codecov Scala Example
=====================

| [https://codecov.io][1] | [@codecov][2] | [hello@codecov.io][3] |
| ----------------------- | ------------- | --------------------- |

This repository serves as an **example** on how to use [Codecov Global][4] for Scala.

# Travis CI

Add to your `.travis.yml` file.
```yml
language: scala

script:
  - sbt clean coverage test

after_success:
  - pip install --user codecov && codecov
```

> All other CI you can simply run `pip install --user codecov && codecov`.

## Private Repos

Add to your `.travis.yml` file.
```yml
env:
  global:
    - CODECOV_TOKEN=:uuid-repo-token

after_success:
  - pip install --user codecov && codecov
```

View source and learn more about [Codecov Global Uploader][4]

[1]: https://codecov.io/
[2]: https://twitter.com/codecov
[3]: mailto:hello@codecov.io
[4]: https://github.com/codecov/codecov-python
