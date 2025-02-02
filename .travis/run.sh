#!/usr/bin/env bash

if [ "$TRAVIS_OS_NAME" = "osx" ]; then
    .travis/test-all.sh
else
    docker run -it --net=host \
               -v $HOME/.ivy2:/root/.ivy2 \
               -v $HOME/.sbt:/root/.sbt \
               -v $TRAVIS_BUILD_DIR:/pdal-java \
               -e TRAVIS_SCALA_VERSION=$TRAVIS_SCALA_VERSION \
               -e TRAVIS_COMMIT=$TRAVIS_COMMIT \
               -e TRAVIS_JDK_VERSION=$TRAVIS_JDK_VERSION daunnc/pdal-debian:1.8.0 /bin/bash -c "cd /pdal-java; .travis/test-all.sh"
fi
