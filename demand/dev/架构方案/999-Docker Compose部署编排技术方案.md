# Docker Compose 部署编排技术方案

## 目标
- 使用 Docker Compose 快速构建本地/测试环境，编排 Nacos/MySQL/Redis/ES/MQ 与各服务容器。

## 结构
- `docker-compose.yml`：定义中间件与核心服务，网络与卷挂载。
- `.env`：端口、凭据、版本号。

## 服务编排（示例）
- `nacos`, `mysql`, `redis`, `elasticsearch`, `rocketmq`（namesrv + broker）。
- `gateway`, `auth`, `user`, `supply`, `demand`, `order`, `payment`, `message`, `file`, `search`, `admin`, `monitor`。

## 网络与存储
- 内部网络：`drone_net`；仅网关暴露外部端口。
- 卷：`mysql_data`, `es_data`, `nacos_data`，持久化。

## 构建镜像
- 每个服务添加 `Dockerfile`；多阶段构建减小体积。

## 验收标准
- 一条命令 `docker compose up -d` 即可完成环境启动与联通。