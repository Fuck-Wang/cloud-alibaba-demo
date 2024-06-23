进入本module下的lib目录执行如下命令行启动sentinel控制台：

java -Dserver.port=8084 -Dcsp.sentinel.dashboard.server=localhost:8084 -Dproject.name=sentinel-dashboard  -Dcsp.sentinel.api.port=8719 -jar sentinel-dashboard-1.8.8.jar
