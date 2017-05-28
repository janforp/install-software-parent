package com.janita.docker.docker_install;

/**
 * Created by Janita on 2017-05-28 19:42
 *
 * docker 的安装配置
 */
public class DockerInstall {

    /**
     * 一:安装环境 : 阿里云ECS Ubuntu 16.04.5,其他版本可以测试一下
     */


    /**
     * 二:参考文档
     *
     http://blog.csdn.net/mickjoust/article/details/51578629

     */

    /**
     * 三:安装 docker
     * * 1.切换到root权限或者用sudo
     * 2.升级source列表并保证https和ca证书成功安装
     *      2.1:    apt-get update
     *      2.2:    apt-get install apt-transport-https ca-certificates
     *
     * 3.增加新的GPG 密钥
     *      3.1:    apt-key adv --keyserver hkp://p80.pool.sks-keyservers.net:80 --recv-keys 58118E89F3A912897C070ADBF76221572C52609D
     *
     * 4.新增或编辑source列表里的docker.list文件
     *      4.1:    vi /etc/apt/sources.list.d/docker.list  //如果不存在就新增
     *
     * 5.删除已有的entries
     * 6.按照系统版本增加entry(Ubuntu Xenial 16.04 (LTS)）
     *      6.1:    在上面打开的文件中粘贴 : deb https://apt.dockerproject.org/repo ubuntu-xenial main
     *
     * 7.重新执行更新操作，并删除老的repo
     *      7.1:    apt-get purge lxc-docker  //没有安装的话，跳过
     *
     *
     * 8.apt-cache policy docker-engine
     * 9.apt-get install linux-image-extra-$(uname -r)
     * 10.安装docker
     *      10.1:   apt-get update
     *      10.2:   apt-get install docker-engine
     *      10.3:   service docker start
     */


    /**
     * 四: docker 国内镜像仓库: https://c.163.com/hub#/m/home/
     */
}
