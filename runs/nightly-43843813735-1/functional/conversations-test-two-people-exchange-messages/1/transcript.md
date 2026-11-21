# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 352 | `qa-df368bf7-c7d3-41ce-993d-eaa195783603` |
| 2 | `POST /v1/accounts` | 201 | 21 | `qa-ba1f99f6-0954-4870-b6e0-52b6e1b42636` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-7eab27a8-7ec8-417b-a2e5-f428069a0493` |
| 4 | `POST /v1/conversations` | 201 | 83 | `qa-84ceaa5f-8f61-4078-a07f-3c4322e7ab30` |
| 5 | `POST /v1/auth/token` | 200 | 15 | `qa-400113f1-6b34-40d5-bfee-9044e600c635` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 20 | `qa-018514ee-910a-48d3-a8b6-1bc16e9b7eb9` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 17 | `qa-b076bce9-2459-449f-b873-e9036f0e1580` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-075fbd64-23c2-414f-a042-4ae2fe8c2e65` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-035d88e6-2ceb-4276-976b-77abd1f11780` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-3fcb8671-9568-4ed9-8826-7ba66850c67d` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-1b732bd4-c271-42dc-a798-a28ac0cd35f7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-df368bf7-c7d3-41ce-993d-eaa195783603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df368bf7-c7d3-41ce-993d-eaa195783603
Content-Type: application/json

--- request body ---
{"handle":"qa-c5b5c30590dc","displayName":"QA c5b5c30590dc","password":"****","region":"eu"}

--- response: 201 in 352 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-df368bf7-c7d3-41ce-993d-eaa195783603
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-c5b5c30590dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8d14e1b9-7ca4-490a-9063-9fa36eb50cdd","handle":"qa-c5b5c30590dc","displayName":"QA c5b5c30590dc","region":"eu","role":"user","createdAt":"2026-11-16T09:53:50.487488379Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ba1f99f6-0954-4870-b6e0-52b6e1b42636

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba1f99f6-0954-4870-b6e0-52b6e1b42636
Content-Type: application/json

--- request body ---
{"handle":"qa-73c2155ebc48","displayName":"QA 73c2155ebc48","password":"****","region":"eu"}

--- response: 201 in 21 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba1f99f6-0954-4870-b6e0-52b6e1b42636
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-73c2155ebc48
X-Served-Region: eu
Content-Length: 181

{"id":"acc_034093bd-3911-4674-9a82-646e0912aee8","handle":"qa-73c2155ebc48","displayName":"QA 73c2155ebc48","region":"eu","role":"user","createdAt":"2026-11-16T09:53:50.828305974Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7eab27a8-7ec8-417b-a2e5-f428069a0493

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eab27a8-7ec8-417b-a2e5-f428069a0493
Content-Type: application/json

--- request body ---
{"handle":"qa-c5b5c30590dc","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eab27a8-7ec8-417b-a2e5-f428069a0493
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8d14e1b9-7ca4-490a-9063-9fa36eb50cdd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-84ceaa5f-8f61-4078-a07f-3c4322e7ab30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84ceaa5f-8f61-4078-a07f-3c4322e7ab30
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-73c2155ebc48","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 83 ms ---
Date: Mon, 16 Nov 2026 09:53:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-84ceaa5f-8f61-4078-a07f-3c4322e7ab30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_d2ad9b29-6835-4ecc-aa06-ec174dd6a29a
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_d2ad9b29-6835-4ecc-aa06-ec174dd6a29a","subject":"Lunch?","status":"open","region":"eu","participants":["qa-c5b5c30590dc","qa-73c2155ebc48"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-16T09:53:50.948317684Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-400113f1-6b34-40d5-bfee-9044e600c635

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-400113f1-6b34-40d5-bfee-9044e600c635
Content-Type: application/json

--- request body ---
{"handle":"qa-73c2155ebc48","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-400113f1-6b34-40d5-bfee-9044e600c635
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_034093bd-3911-4674-9a82-646e0912aee8"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_d2ad9b29-6835-4ecc-aa06-ec174dd6a29a/messages
correlation: qa-018514ee-910a-48d3-a8b6-1bc16e9b7eb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-018514ee-910a-48d3-a8b6-1bc16e9b7eb9
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 20 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-018514ee-910a-48d3-a8b6-1bc16e9b7eb9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 203

{"id":"msg_22c65acd-9c6e-4a72-80b0-efa03b9a6cce","conversationId":"cnv_d2ad9b29-6835-4ecc-aa06-ec174dd6a29a","sender":"qa-73c2155ebc48","body":"Friday works","createdAt":"2026-11-16T09:53:51.048778130Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_d2ad9b29-6835-4ecc-aa06-ec174dd6a29a/messages
correlation: qa-b076bce9-2459-449f-b873-e9036f0e1580

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b076bce9-2459-449f-b873-e9036f0e1580
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b076bce9-2459-449f-b873-e9036f0e1580
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 432

{"items":[{"id":"msg_c3e30aa7-c3e4-4de9-b9c2-50cae1a82685","conversationId":"cnv_d2ad9b29-6835-4ecc-aa06-ec174dd6a29a","sender":"qa-c5b5c30590dc","body":"Free on Friday?","createdAt":"2026-11-16T09:53:50.948573717Z"},{"id":"msg_22c65acd-9c6e-4a72-80b0-efa03b9a6cce","conversationId":"cnv_d2ad9b29-6835-4ecc-aa06-ec174dd6a29a","sender":"qa-73c2155ebc48","body":"Friday works","createdAt":"2026-11-16T09:53:51.048778130Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-075fbd64-23c2-414f-a042-4ae2fe8c2e65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-075fbd64-23c2-414f-a042-4ae2fe8c2e65
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-075fbd64-23c2-414f-a042-4ae2fe8c2e65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-035d88e6-2ceb-4276-976b-77abd1f11780

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-035d88e6-2ceb-4276-976b-77abd1f11780
Content-Type: application/json

--- request body ---
{"handle":"qa-73c2155ebc48","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-035d88e6-2ceb-4276-976b-77abd1f11780
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-035d88e6-2ceb-4276-976b-77abd1f11780"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3fcb8671-9568-4ed9-8826-7ba66850c67d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3fcb8671-9568-4ed9-8826-7ba66850c67d
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3fcb8671-9568-4ed9-8826-7ba66850c67d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-1b732bd4-c271-42dc-a798-a28ac0cd35f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b732bd4-c271-42dc-a798-a28ac0cd35f7
Content-Type: application/json

--- request body ---
{"handle":"qa-c5b5c30590dc","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 16 Nov 2026 09:53:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1b732bd4-c271-42dc-a798-a28ac0cd35f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1b732bd4-c271-42dc-a798-a28ac0cd35f7"}
```
