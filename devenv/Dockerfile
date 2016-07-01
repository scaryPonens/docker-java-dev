FROM buildpack-deps:xenial-scm

RUN useradd -p $(openssl passwd -crypt JavaDev) -u 1000 -m javadev \
		&& chown -R 1000:1000 /home/javadev

ENV JAVA_HOME "/usr/lib/jvm/java-8-openjdk-amd64"
ENV MAVEN_HOME "/usr/share/maven"

ENV PATH $JAVA_HOME/bin:$MAVEN_HOME/bin:$PATH

WORKDIR /home/javadev
USER javadev
CMD ["bash"]
