# docker-java-dev

## Prerequisites

* [Vagrant + Docker + Docker Compose virtual machine](https://github.com/scaryPonens/vagrant-docker-base) (Windows/OSX) 
* Docker + Docker Compose (Linux)

## How to Use

**Step 1.** Clone project to desired folder:
```bash
> cd /Lab && git clone https://github.com/scaryPonens/docker-java-dev.git
> cd docker-java-dev.git
> docker-compose up -d
> ...
> # docker build output
> ...
> docker exec -it -u 1000 dockerjavadev_devenv_1 bash
```

## TO DO
* Add an eclipse/netbeans container to the docker environment
* Add source code to tdd-lab
