# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 497 | `qa-31f2c483-e933-4354-9a70-2378105765ce` |
| 2 | `POST /v1/accounts` | 201 | 78 | `qa-3da52c22-5bd1-4528-89cd-2c23468eb9c3` |
| 3 | `POST /v1/accounts` | 201 | 53 | `qa-8c4ed7ea-1d2b-4cf3-90d8-d36a9ab1526a` |
| 4 | `POST /v1/auth/token` | 200 | 58 | `qa-0a9a9be4-2381-44fb-a18d-1e74b7c0c965` |
| 5 | `POST /v1/conversations` | 201 | 76 | `qa-704fb775-20a8-40e1-a080-60b26ea3b0bd` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-8abbce28-2dc1-4a60-b944-e4c6abfae00e` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 29 | `qa-6fada9d4-5abe-403e-86d0-c62bd2d86bf6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 31 | `qa-96acb68b-9e0f-4782-b2ac-e5320fb2698e` |
| 9 | `POST /v1/auth/token` | 401 | 13 | `qa-37272eaa-247f-4546-991a-9a9a8a6accbe` |
| 10 | `POST /v1/auth/token` | 200 | 43 | `qa-9ae08e00-5d55-44bf-8bdb-e3700e49ff0b` |
| 11 | `DELETE /v1/accounts/me` | 204 | 70 | `qa-09c6a263-4f00-4c8f-a5ad-afcd8a0cf7e8` |
| 12 | `POST /v1/auth/token` | 401 | 22 | `qa-0de27052-9515-4286-b13b-e44944e7adb0` |
| 13 | `DELETE /v1/accounts/me` | 204 | 38 | `qa-b27ddd97-6e2d-4755-9ebe-d6ce360d3811` |
| 14 | `POST /v1/auth/token` | 401 | 10 | `qa-721bd1e6-4036-4c6e-981e-4adb3c971bec` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-31f2c483-e933-4354-9a70-2378105765ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31f2c483-e933-4354-9a70-2378105765ce
Content-Type: application/json

--- request body ---
{"handle":"qa-692c6441fa33","displayName":"QA 692c6441fa33","password":"****","region":"eu"}

--- response: 201 in 497 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-31f2c483-e933-4354-9a70-2378105765ce
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
Location: /v1/accounts/qa-692c6441fa33
X-Served-Region: eu
Content-Length: 181

{"id":"acc_724be2f6-e2f4-4355-a5a6-f9c7a7507861","handle":"qa-692c6441fa33","displayName":"QA 692c6441fa33","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.649437079Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3da52c22-5bd1-4528-89cd-2c23468eb9c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da52c22-5bd1-4528-89cd-2c23468eb9c3
Content-Type: application/json

--- request body ---
{"handle":"qa-da64f216340e","displayName":"QA da64f216340e","password":"****","region":"eu"}

--- response: 201 in 78 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-3da52c22-5bd1-4528-89cd-2c23468eb9c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Location: /v1/accounts/qa-da64f216340e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_856336b8-46f5-43e3-bcad-70e9ed5cf2c0","handle":"qa-da64f216340e","displayName":"QA da64f216340e","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.135210075Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-8c4ed7ea-1d2b-4cf3-90d8-d36a9ab1526a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c4ed7ea-1d2b-4cf3-90d8-d36a9ab1526a
Content-Type: application/json

--- request body ---
{"handle":"qa-911e59f358ba","displayName":"QA 911e59f358ba","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c4ed7ea-1d2b-4cf3-90d8-d36a9ab1526a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 10
Location: /v1/accounts/qa-911e59f358ba
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80ec6d72-65bc-4b28-8811-d22206869df9","handle":"qa-911e59f358ba","displayName":"QA 911e59f358ba","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.214935267Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-0a9a9be4-2381-44fb-a18d-1e74b7c0c965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a9a9be4-2381-44fb-a18d-1e74b7c0c965
Content-Type: application/json

--- request body ---
{"handle":"qa-692c6441fa33","password":"****"}

--- response: 200 in 58 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a9a9be4-2381-44fb-a18d-1e74b7c0c965
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_724be2f6-e2f4-4355-a5a6-f9c7a7507861"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-704fb775-20a8-40e1-a080-60b26ea3b0bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-704fb775-20a8-40e1-a080-60b26ea3b0bd
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-da64f216340e","subject":"Error contract","message":"Hi"}

--- response: 201 in 76 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-704fb775-20a8-40e1-a080-60b26ea3b0bd
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
Location: /v1/conversations/cnv_a64eca55-da22-4f7e-9e7d-4f6ab72585e0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a64eca55-da22-4f7e-9e7d-4f6ab72585e0","subject":"Error contract","status":"open","region":"eu","participants":["qa-692c6441fa33","qa-da64f216340e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.470006385Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8abbce28-2dc1-4a60-b944-e4c6abfae00e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8abbce28-2dc1-4a60-b944-e4c6abfae00e
Content-Type: application/json

--- request body ---
{"handle":"qa-911e59f358ba","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8abbce28-2dc1-4a60-b944-e4c6abfae00e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80ec6d72-65bc-4b28-8811-d22206869df9"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a64eca55-da22-4f7e-9e7d-4f6ab72585e0/messages
correlation: qa-6fada9d4-5abe-403e-86d0-c62bd2d86bf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fada9d4-5abe-403e-86d0-c62bd2d86bf6
Content-Type: application/json

--- response: 403 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fada9d4-5abe-403e-86d0-c62bd2d86bf6
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_a64eca55-da22-4f7e-9e7d-4f6ab72585e0/messages","correlationId":"qa-6fada9d4-5abe-403e-86d0-c62bd2d86bf6"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96acb68b-9e0f-4782-b2ac-e5320fb2698e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96acb68b-9e0f-4782-b2ac-e5320fb2698e
Content-Type: application/json

--- response: 204 in 31 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96acb68b-9e0f-4782-b2ac-e5320fb2698e
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
correlation: qa-37272eaa-247f-4546-991a-9a9a8a6accbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37272eaa-247f-4546-991a-9a9a8a6accbe
Content-Type: application/json

--- request body ---
{"handle":"qa-911e59f358ba","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37272eaa-247f-4546-991a-9a9a8a6accbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-37272eaa-247f-4546-991a-9a9a8a6accbe"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-9ae08e00-5d55-44bf-8bdb-e3700e49ff0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ae08e00-5d55-44bf-8bdb-e3700e49ff0b
Content-Type: application/json

--- request body ---
{"handle":"qa-da64f216340e","password":"****"}

--- response: 200 in 43 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ae08e00-5d55-44bf-8bdb-e3700e49ff0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_856336b8-46f5-43e3-bcad-70e9ed5cf2c0"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-09c6a263-4f00-4c8f-a5ad-afcd8a0cf7e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09c6a263-4f00-4c8f-a5ad-afcd8a0cf7e8
Content-Type: application/json

--- response: 204 in 70 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-09c6a263-4f00-4c8f-a5ad-afcd8a0cf7e8
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
correlation: qa-0de27052-9515-4286-b13b-e44944e7adb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de27052-9515-4286-b13b-e44944e7adb0
Content-Type: application/json

--- request body ---
{"handle":"qa-da64f216340e","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0de27052-9515-4286-b13b-e44944e7adb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0de27052-9515-4286-b13b-e44944e7adb0"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b27ddd97-6e2d-4755-9ebe-d6ce360d3811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b27ddd97-6e2d-4755-9ebe-d6ce360d3811
Content-Type: application/json

--- response: 204 in 38 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b27ddd97-6e2d-4755-9ebe-d6ce360d3811
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
correlation: qa-721bd1e6-4036-4c6e-981e-4adb3c971bec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-721bd1e6-4036-4c6e-981e-4adb3c971bec
Content-Type: application/json

--- request body ---
{"handle":"qa-692c6441fa33","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-721bd1e6-4036-4c6e-981e-4adb3c971bec
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 504
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-721bd1e6-4036-4c6e-981e-4adb3c971bec"}
```
