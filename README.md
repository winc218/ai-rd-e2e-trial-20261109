# AI 研发平台 E2E 试用测试仓库

本仓库是用于真实 AI 研发平台端到端（E2E）试用验证的**隔离测试项目**，后续需求为“企业网银批量转账结果通知增强”。当前仅提供最小可运行的 Spring Boot 骨架，完整业务需求留给平台在后续试验中生成。

## 重要限制

- 仅用于 E2E 测试与平台能力验证。
- 所有银行、账户、转账及通知相关外部系统均应使用模拟实现，不连接真实外部系统。
- 不包含真实客户数据、凭据或生产配置。
- **不得用于生产环境。**

## 技术栈

- Java 17
- Spring Boot 3.2.5
- Maven
- JUnit 5、MockMvc、JaCoCo

## 本地验证

```bash
mvn test
```

启动应用：

```bash
mvn spring-boot:run
```

只读健康检查接口：

```bash
curl http://localhost:8080/api/health
```

预期响应：

```json
{"status":"UP"}
```
