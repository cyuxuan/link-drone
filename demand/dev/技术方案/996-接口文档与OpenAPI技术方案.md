# 接口文档与 OpenAPI 技术方案

## 目标
- 为各服务提供可视化接口文档与交互式调试能力，提升研发与联调效率。

## 技术选型
- `springdoc-openapi` + `knife4j` UI；分组展示各微服务接口。

## 配置要点
- 每个服务启用 OpenAPI，并设置 `title/version/description`。
- 网关聚合，提供统一文档入口（可选）。
- 安全：支持填入 `Authorization` 进行鉴权测试。

## 注解与约定
- `@Operation` 描述、`@Parameter` 参数、`@Schema` 模型；
- 统一响应包装与错误码枚举；示例请求/响应。

## 发布与使用
- 本地：`http://localhost:<port>/doc.html`（Knife4j）。
- 测试/生产：限制访问，需登录或内网。

## 验收标准
- 所有核心接口有文档与示例；登录鉴权流程可在文档中自测。