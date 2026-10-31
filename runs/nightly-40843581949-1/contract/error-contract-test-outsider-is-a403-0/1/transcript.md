# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 516 | `qa-6e39f5b7-f92b-4068-b292-e725667e26d3` |
| 2 | `POST /v1/accounts` | 201 | 65 | `qa-0dab4170-43c4-407c-ae67-be6043b3f1c1` |
| 3 | `POST /v1/accounts` | 201 | 69 | `qa-fcfc67ee-2df8-4ee3-8ec9-77abe83574cc` |
| 4 | `POST /v1/auth/token` | 200 | 35 | `qa-d5f72351-8a2c-4a41-bd58-9289fbfe941b` |
| 5 | `POST /v1/conversations` | 201 | 82 | `qa-7f5762c6-ff55-4f5c-9cee-fc911b2651fc` |
| 6 | `POST /v1/auth/token` | 200 | 40 | `qa-397100db-fa7d-4aad-9f8e-86c59e3d61de` |
| 7 | `GET /v1/conversations/{id}` | 403 | 29 | `qa-a9797fbd-7b03-4ba0-addb-bccd29571459` |
| 8 | `DELETE /v1/accounts/me` | 204 | 55 | `qa-ba3cd7f2-20a1-4021-8c6a-3748c3cc6f3c` |
| 9 | `POST /v1/auth/token` | 401 | 36 | `qa-a872eefd-5fe9-477d-8a97-59130e445d30` |
| 10 | `POST /v1/auth/token` | 200 | 46 | `qa-9a6539b2-a8b1-4883-b82c-6d58c2243c5d` |
| 11 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-0eb01d52-0a46-4b39-b914-9e715c9f8db7` |
| 12 | `POST /v1/auth/token` | 401 | 35 | `qa-c39a7427-fc74-480f-9184-3028f59f37d4` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-4d984304-8e22-4073-baf6-d86c2b2c09a0` |
| 14 | `POST /v1/auth/token` | 401 | 19 | `qa-bca422ae-b32d-4233-99ef-afcdf15d09cd` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e39f5b7-f92b-4068-b292-e725667e26d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e39f5b7-f92b-4068-b292-e725667e26d3
Content-Type: application/json

--- request body ---
{"handle":"qa-b489dea1a51b","displayName":"QA b489dea1a51b","password":"****","region":"eu"}

--- response: 201 in 516 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e39f5b7-f92b-4068-b292-e725667e26d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Location: /v1/accounts/qa-b489dea1a51b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ebdecbb0-94e5-467e-8b7d-af361f65b11b","handle":"qa-b489dea1a51b","displayName":"QA b489dea1a51b","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.710958533Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0dab4170-43c4-407c-ae67-be6043b3f1c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dab4170-43c4-407c-ae67-be6043b3f1c1
Content-Type: application/json

--- request body ---
{"handle":"qa-b0e19482dbf5","displayName":"QA b0e19482dbf5","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dab4170-43c4-407c-ae67-be6043b3f1c1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Location: /v1/accounts/qa-b0e19482dbf5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e256324-2aa3-4e5f-8ba2-91de6a486810","handle":"qa-b0e19482dbf5","displayName":"QA b0e19482dbf5","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.137809182Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-fcfc67ee-2df8-4ee3-8ec9-77abe83574cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcfc67ee-2df8-4ee3-8ec9-77abe83574cc
Content-Type: application/json

--- request body ---
{"handle":"qa-bee854fb11c6","displayName":"QA bee854fb11c6","password":"****","region":"eu"}

--- response: 201 in 69 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcfc67ee-2df8-4ee3-8ec9-77abe83574cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Location: /v1/accounts/qa-bee854fb11c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_08fe928c-75b8-42b3-82bc-099c9707d155","handle":"qa-bee854fb11c6","displayName":"QA bee854fb11c6","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.247766769Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-d5f72351-8a2c-4a41-bd58-9289fbfe941b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5f72351-8a2c-4a41-bd58-9289fbfe941b
Content-Type: application/json

--- request body ---
{"handle":"qa-b489dea1a51b","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5f72351-8a2c-4a41-bd58-9289fbfe941b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ebdecbb0-94e5-467e-8b7d-af361f65b11b"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-7f5762c6-ff55-4f5c-9cee-fc911b2651fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f5762c6-ff55-4f5c-9cee-fc911b2651fc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b0e19482dbf5","subject":"Error contract","message":"Hi"}

--- response: 201 in 82 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f5762c6-ff55-4f5c-9cee-fc911b2651fc
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
Location: /v1/conversations/cnv_2be117a4-5ae1-486e-a8e5-cd849cbe98a1
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2be117a4-5ae1-486e-a8e5-cd849cbe98a1","subject":"Error contract","status":"open","region":"eu","participants":["qa-b489dea1a51b","qa-b0e19482dbf5"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.461936262Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-397100db-fa7d-4aad-9f8e-86c59e3d61de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-397100db-fa7d-4aad-9f8e-86c59e3d61de
Content-Type: application/json

--- request body ---
{"handle":"qa-bee854fb11c6","password":"****"}

--- response: 200 in 40 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-397100db-fa7d-4aad-9f8e-86c59e3d61de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 551
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_08fe928c-75b8-42b3-82bc-099c9707d155"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_2be117a4-5ae1-486e-a8e5-cd849cbe98a1
correlation: qa-a9797fbd-7b03-4ba0-addb-bccd29571459

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9797fbd-7b03-4ba0-addb-bccd29571459
Content-Type: application/json

--- response: 403 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9797fbd-7b03-4ba0-addb-bccd29571459
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_2be117a4-5ae1-486e-a8e5-cd849cbe98a1","correlationId":"qa-a9797fbd-7b03-4ba0-addb-bccd29571459"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ba3cd7f2-20a1-4021-8c6a-3748c3cc6f3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba3cd7f2-20a1-4021-8c6a-3748c3cc6f3c
Content-Type: application/json

--- response: 204 in 55 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ba3cd7f2-20a1-4021-8c6a-3748c3cc6f3c
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
correlation: qa-a872eefd-5fe9-477d-8a97-59130e445d30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a872eefd-5fe9-477d-8a97-59130e445d30
Content-Type: application/json

--- request body ---
{"handle":"qa-bee854fb11c6","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a872eefd-5fe9-477d-8a97-59130e445d30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a872eefd-5fe9-477d-8a97-59130e445d30"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9a6539b2-a8b1-4883-b82c-6d58c2243c5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6539b2-a8b1-4883-b82c-6d58c2243c5d
Content-Type: application/json

--- request body ---
{"handle":"qa-b0e19482dbf5","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a6539b2-a8b1-4883-b82c-6d58c2243c5d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 528
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e256324-2aa3-4e5f-8ba2-91de6a486810"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0eb01d52-0a46-4b39-b914-9e715c9f8db7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eb01d52-0a46-4b39-b914-9e715c9f8db7
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0eb01d52-0a46-4b39-b914-9e715c9f8db7
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-c39a7427-fc74-480f-9184-3028f59f37d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c39a7427-fc74-480f-9184-3028f59f37d4
Content-Type: application/json

--- request body ---
{"handle":"qa-b0e19482dbf5","password":"****"}

--- response: 401 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c39a7427-fc74-480f-9184-3028f59f37d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 519
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c39a7427-fc74-480f-9184-3028f59f37d4"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4d984304-8e22-4073-baf6-d86c2b2c09a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d984304-8e22-4073-baf6-d86c2b2c09a0
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4d984304-8e22-4073-baf6-d86c2b2c09a0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-bca422ae-b32d-4233-99ef-afcdf15d09cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca422ae-b32d-4233-99ef-afcdf15d09cd
Content-Type: application/json

--- request body ---
{"handle":"qa-b489dea1a51b","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bca422ae-b32d-4233-99ef-afcdf15d09cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-bca422ae-b32d-4233-99ef-afcdf15d09cd"}
```
