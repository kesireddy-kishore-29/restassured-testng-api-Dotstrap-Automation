# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 354 | `qa-6b770f96-8ace-4bde-b8c8-5fd1efe7335c` |
| 2 | `POST /v1/accounts` | 201 | 70 | `qa-9fdf9f51-ac49-4eb1-ba97-3520780b19d7` |
| 3 | `POST /v1/accounts` | 201 | 20 | `qa-628cd21f-2301-4b37-91b7-a8d187ef1de6` |
| 4 | `POST /v1/auth/token` | 200 | 40 | `qa-d5a00cd8-f94e-41c2-93d0-95f2017e9952` |
| 5 | `POST /v1/conversations` | 201 | 27 | `qa-67d19d64-43a3-43b7-b489-4d4d7881d4e2` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-99f93db3-3d38-4fa3-9c04-00bc8c46c087` |
| 7 | `GET /v1/conversations/{id}` | 403 | 19 | `qa-e744cab3-f2f8-4e01-9a95-89774dd9498a` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 9 | `qa-152ae676-cad4-41db-8fbb-00c36957a238` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 23 | `qa-6388b1c3-15e9-4cb5-864e-270f2c5de474` |
| 10 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-5dac081c-2213-4852-9014-b636422cb4df` |
| 11 | `POST /v1/auth/token` | 401 | 16 | `qa-bc545416-6cb6-4f29-8eed-cf1b2b913467` |
| 12 | `POST /v1/auth/token` | 200 | 32 | `qa-f6c32526-eb7f-4a50-b30f-eef8675da06b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-bd554aa9-b06e-40f1-b858-80cf41d032fc` |
| 14 | `POST /v1/auth/token` | 401 | 13 | `qa-168f32da-74fb-4290-8066-1d018c687542` |
| 15 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-ac6f7aa6-f29c-4e91-82ba-cb1d993e6431` |
| 16 | `POST /v1/auth/token` | 401 | 17 | `qa-d973d09f-7488-4c14-8990-75609802adcc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6b770f96-8ace-4bde-b8c8-5fd1efe7335c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b770f96-8ace-4bde-b8c8-5fd1efe7335c
Content-Type: application/json

--- request body ---
{"handle":"qa-e4e901d7098a","displayName":"QA e4e901d7098a","password":"****","region":"eu"}

--- response: 201 in 354 ms ---
Date: Sat, 21 Nov 2026 09:56:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b770f96-8ace-4bde-b8c8-5fd1efe7335c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-e4e901d7098a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4fd8c141-cdc1-485b-b3f3-ca4cee45afba","handle":"qa-e4e901d7098a","displayName":"QA e4e901d7098a","region":"eu","role":"user","createdAt":"2026-11-21T09:56:58.666032588Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9fdf9f51-ac49-4eb1-ba97-3520780b19d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fdf9f51-ac49-4eb1-ba97-3520780b19d7
Content-Type: application/json

--- request body ---
{"handle":"qa-b56826f42fb2","displayName":"QA b56826f42fb2","password":"****","region":"eu"}

--- response: 201 in 70 ms ---
Date: Sat, 21 Nov 2026 09:56:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fdf9f51-ac49-4eb1-ba97-3520780b19d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-b56826f42fb2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c84516fe-050e-4e9a-973e-077e9f97b932","handle":"qa-b56826f42fb2","displayName":"QA b56826f42fb2","region":"eu","role":"user","createdAt":"2026-11-21T09:56:58.984256696Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-628cd21f-2301-4b37-91b7-a8d187ef1de6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-628cd21f-2301-4b37-91b7-a8d187ef1de6
Content-Type: application/json

--- request body ---
{"handle":"qa-cc67b50b1665","displayName":"QA cc67b50b1665","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-628cd21f-2301-4b37-91b7-a8d187ef1de6
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
Location: /v1/accounts/qa-cc67b50b1665
X-Served-Region: eu
Content-Length: 181

{"id":"acc_50d18403-174d-45f7-8cbe-37e993cf0183","handle":"qa-cc67b50b1665","displayName":"QA cc67b50b1665","region":"eu","role":"user","createdAt":"2026-11-21T09:56:59.024509295Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d5a00cd8-f94e-41c2-93d0-95f2017e9952

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5a00cd8-f94e-41c2-93d0-95f2017e9952
Content-Type: application/json

--- request body ---
{"handle":"qa-e4e901d7098a","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5a00cd8-f94e-41c2-93d0-95f2017e9952
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4fd8c141-cdc1-485b-b3f3-ca4cee45afba"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-67d19d64-43a3-43b7-b489-4d4d7881d4e2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67d19d64-43a3-43b7-b489-4d4d7881d4e2
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b56826f42fb2","subject":"Private","message":"Just us"}

--- response: 201 in 27 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-67d19d64-43a3-43b7-b489-4d4d7881d4e2
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
Location: /v1/conversations/cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4","subject":"Private","status":"open","region":"eu","participants":["qa-e4e901d7098a","qa-b56826f42fb2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:56:59.162024253Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-99f93db3-3d38-4fa3-9c04-00bc8c46c087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99f93db3-3d38-4fa3-9c04-00bc8c46c087
Content-Type: application/json

--- request body ---
{"handle":"qa-cc67b50b1665","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-99f93db3-3d38-4fa3-9c04-00bc8c46c087
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_50d18403-174d-45f7-8cbe-37e993cf0183"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4
correlation: qa-e744cab3-f2f8-4e01-9a95-89774dd9498a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e744cab3-f2f8-4e01-9a95-89774dd9498a
Content-Type: application/json

--- response: 403 in 19 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e744cab3-f2f8-4e01-9a95-89774dd9498a
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4","correlationId":"qa-e744cab3-f2f8-4e01-9a95-89774dd9498a"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4/messages
correlation: qa-152ae676-cad4-41db-8fbb-00c36957a238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-152ae676-cad4-41db-8fbb-00c36957a238
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-152ae676-cad4-41db-8fbb-00c36957a238
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4/messages","correlationId":"qa-152ae676-cad4-41db-8fbb-00c36957a238"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4/messages
correlation: qa-6388b1c3-15e9-4cb5-864e-270f2c5de474

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6388b1c3-15e9-4cb5-864e-270f2c5de474
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 23 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6388b1c3-15e9-4cb5-864e-270f2c5de474
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8d5dbb12-498f-417b-b83f-a9ab591df9b4/messages","correlationId":"qa-6388b1c3-15e9-4cb5-864e-270f2c5de474"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5dac081c-2213-4852-9014-b636422cb4df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dac081c-2213-4852-9014-b636422cb4df
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5dac081c-2213-4852-9014-b636422cb4df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-bc545416-6cb6-4f29-8eed-cf1b2b913467

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc545416-6cb6-4f29-8eed-cf1b2b913467
Content-Type: application/json

--- request body ---
{"handle":"qa-cc67b50b1665","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bc545416-6cb6-4f29-8eed-cf1b2b913467
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bc545416-6cb6-4f29-8eed-cf1b2b913467"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-f6c32526-eb7f-4a50-b30f-eef8675da06b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6c32526-eb7f-4a50-b30f-eef8675da06b
Content-Type: application/json

--- request body ---
{"handle":"qa-b56826f42fb2","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6c32526-eb7f-4a50-b30f-eef8675da06b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c84516fe-050e-4e9a-973e-077e9f97b932"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bd554aa9-b06e-40f1-b858-80cf41d032fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd554aa9-b06e-40f1-b858-80cf41d032fc
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-bd554aa9-b06e-40f1-b858-80cf41d032fc
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-168f32da-74fb-4290-8066-1d018c687542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-168f32da-74fb-4290-8066-1d018c687542
Content-Type: application/json

--- request body ---
{"handle":"qa-b56826f42fb2","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-168f32da-74fb-4290-8066-1d018c687542
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-168f32da-74fb-4290-8066-1d018c687542"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ac6f7aa6-f29c-4e91-82ba-cb1d993e6431

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac6f7aa6-f29c-4e91-82ba-cb1d993e6431
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ac6f7aa6-f29c-4e91-82ba-cb1d993e6431
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-d973d09f-7488-4c14-8990-75609802adcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d973d09f-7488-4c14-8990-75609802adcc
Content-Type: application/json

--- request body ---
{"handle":"qa-e4e901d7098a","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 21 Nov 2026 09:56:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d973d09f-7488-4c14-8990-75609802adcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d973d09f-7488-4c14-8990-75609802adcc"}
```
