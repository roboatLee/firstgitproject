# springboot

## springboot入手指南

### Web技术基础

#### 软件类型

目前市面上的软件主要可分为两种：
 	BS:(Browser/Server,浏览器/服务器架构模式)。
 	CS:(Client/Server,客户端/服务器架构模式)。

#### 架构对比

C/S架构主要特点是交互性强，具有安全访问模式，网络流量低，响应速度快，
因为客户端负责大多数业务逻辑和UI演示，所以也被称为胖客户端，C/S结构的
软件需要针对不同的操作系统开发不同版本的软件。

随着互联网的兴起，CS架构不适合Web，最大的原因是Web应用程序的修改和
升级非常迅速，而CS架构需要每个客户端逐个升级桌面App，因此，
Browser/Server模式开始流行，简称BS架构。

B/S架构的主要特点是分散性高、维护方便、开发简单、共享性高、总拥有成本
低。



#### Java环境配置

1.下载安装包：
https://www.oracle.com/java/technologies/downloads/#java8-windows

2.打开“高级系统设置”中的“环境变量”选项。

3.新建“JAVA_HOME”环境变量，变量值为JDK的安装目录

4.将“JAVA_HOME”环境变量添加到Path中