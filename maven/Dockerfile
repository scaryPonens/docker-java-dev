FROM java:8u91

ENV MAVEN_VERSION 3.3.3

RUN mkdir -p /usr/share/maven \
    && curl -fsSL http://apache.osuosl.org/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz \
    | tar -xzC /usr/share/maven --strip-components=1 

RUN mkdir -p /home/javadev/.m2 \
    && chown -R 1000:1000 /home/javadev

VOLUME /usr/share/maven
VOLUME /root/.m2
