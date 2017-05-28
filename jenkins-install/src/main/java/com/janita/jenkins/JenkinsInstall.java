package com.janita.jenkins;

/**
 * Created by Janita on 2017-05-28 19:10
 *  jenkins安装配置
 */
public class JenkinsInstall {

    /**
     * 一:安装环境 : 阿里云ECS Ubuntu 16.04.5,其他版本可以测试一下
     */

    /**
     * 二:安装 java
     * 1.jenkins 依赖java,先下载配置java环境变量
     *

     export JAVA_HOME=/janita/itTools/java8/jdk8
     export JRE_HOME=/janita/itTools/java8/jdk8/jre
     export CLASSPATH=.:$JAVA_HOME/lib:$JAVA_HOME/jre/lib:$CLASSPATH
     export PATH=$JAVA_HOME/bin:$JAVA_HOME/jre/bin:$PATH

     export M2_HOME=/janita/itTools/maven/maven3.5
     export PATH=$M2_HOME/bin:$PATH

     */


    /**
     * 三:安装 jenkins
     * 1.   wget -q -O - https://pkg.jenkins.io/debian/jenkins-ci.org.key | sudo apt-key add -
     * 2.   sudo sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list'
     * 3.   sudo apt-get update
     * 4.   sudo apt-get install jenkins
     *
     * 安装完毕,之后的事情到浏览器上完成
     */

    /**
     * 四.访问 服务器的 8080 端口
     *
     * 1.   安装完毕之后就可以访问 8080 端口了,首次访问的页面见 图1
     *      cat /var/lib/jenkins/secrets/initialAdminPassword
     *      获取密码  复制密码粘贴至输入框
     *      点击 页面右下角的 continue
     *      之后页面会加载一段时间
     *      之后会出现 图2:安装插件
     *
     * 2.  点击图2左边的 安装 系统建议安装的插件
     *      之后会出现 图3
     *           最后进入 Create First Admin User 页面,如图4
     *                点击 save and finish
     *                     出现图5
     *                          点击 开始使用 jenkins
     *                               出现图6
     */


    /**
     * 五.裸ejnkins安装完毕了
     *
     * 1.若需要配合 gitlab 使用,则可以安装 gitlab 或者在 docker中运行 gitlab 镜像
     * 2.具体见 gitlab 安装模块
     */
}
