mvn -v

mvn package

mvn install

Maven Properties Guide
针对用到的每个module，执行mvn install操作，默认将module安装到%HOMEPATH%\.m2\repository下。
一个朋友那的maven项目打包报错，今天没事，就建个项目，跑下看看是否能重现。结果一路顺利。
新建maven项目，新建module: common、framework，不需要选择parent module。

