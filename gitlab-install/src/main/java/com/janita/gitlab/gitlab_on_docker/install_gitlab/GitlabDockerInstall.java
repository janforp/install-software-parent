package com.janita.gitlab.gitlab_on_docker.install_gitlab;

/**
 * Created by Janita on 2017-05-28 19:27
 * 通过 docker 的 gitlab 镜像的方式安装 gitlab
 */
public class GitlabDockerInstall {


    /**
     * 一:首先当然是安装好 docker ,具体见 docker 安装模块
     */

    /**
     * 二:下载 gitlab 镜像文件
     *  因为该镜像是依赖了 postgresql 数据库 及 redis,所以这两个镜像也需要下载安装
     *
     * 1.redis 镜像
     *     1.1: 下载镜像    在网易蜂巢上面直接搜索链接即可
     *     1.2: 运行该镜像:
                docker run --name redis --restart=always -d -p 6379:6379 --volume /janita/docker/gitlab/redis:/var/lib/redis hub.c.163.com/library/redis
     *
     * 2.postgresql 镜像
     *      2.1:    下载镜像     在网易蜂巢上面直接搜索链接即可
     *      2.2:    运行镜像
                docker run --name postgresql --restart=always -d -p 5432:5432 -e POSTGRES_PASSWORD=123456 -e POSTGRES_USER=postgres -e POSTGRES_DB=gitlabhq_production --volume /janita/docker/gitlab/postgresql:/var/lib/postgresql hub.c.163.com/library/postgres
     *
     * 3.gitlab 镜像
     *      3.1: 下载镜像   docker pull sameersbn/gitlab:8.16.6
     *      3.2:  运行镜像


                     docker run --name gitlab -d \
                     --link postgresql:postgresql --link redis:redisio \
                     --publish 10022:22 --publish 10080:80 \
                     --env 'GITLAB_HOST=106.14.67.100' \
                     --env 'GITLAB_REGISTRY_API_URL=http://localhost:5001' \
                     --env 'SMTP_ENABLED=false' --env 'IMAP_ENABLED=false' --env 'LDAP_ENABLED=false' \
                     --env 'GITLAB_GRAVATAR_ENABLED=false' \
                     --env 'GITLAB_PORT=10080' --env 'GITLAB_SSH_PORT=10022' \
                     --env 'GITLAB_SECRETS_DB_KEY_BASE=MJJdwpqphRH7pcL9dcdmJpzPr4Wjf9cMKgk3jjNcRKhcbWjRNCWW47rPX9MmRp3M' \
                     --env 'GITLAB_SECRETS_SECRET_KEY_BASE=MJJdwpqphRH7pcL9dcdmJpzPr4Wjf9cMKgk3jjNcRKhcbWjRNCWW47rPX9MmRp3M' \
                     --env 'GITLAB_SECRETS_OTP_KEY_BASE=MJJdwpqphRH7pcL9dcdmJpzPr4Wjf9cMKgk3jjNcRKhcbWjRNCWW47rPX9MmRp3M' \
                     --volume /janita/docker/gitlab/gitlab:/home/git/data \
                     sameersbn/gitlab:8.16.6


     *
     */


    /**
     * 三:使用 docker 命令查看上面的三个镜像的情况
     * 1.docker images 查看 docker 下面有几个镜像可以使用,见图1
     * 2.docker ps -a 查看容器运行情况,并获得容器 id
     */


    /**
     * 四:确认正常运行指挥,即可访问页面
     *
     * 1.访问     http://106.14.67.100:10080 即可见到 图2：　gitlab 登录页面
     *  修改初始密码即可
     *
     * 2.可以通过本地的 postgresql 图形化工具访问上面安装的 postgresql 数据库
     *  其中的 users 表就是该 gitlab 的所有用户
     *  见图3
     *
     */












}
