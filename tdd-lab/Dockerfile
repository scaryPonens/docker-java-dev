FROM buildpack-deps:xenial-scm

RUN mkdir -p /home/javadev/tdd-lab \
    && git init /home/javadev/tdd-lab \
    && chown -R 1000:1000 /home/javadev

WORKDIR /home/javadev/tdd-lab
