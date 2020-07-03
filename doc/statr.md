#### docker 容器启动命令
```
//生成镜像
mvn clean package dockerfile:build -e
//查看镜像
docker images
//根据容器id启动容器
docker run -itd --name zhiji -p 8888:8888 containerId
```