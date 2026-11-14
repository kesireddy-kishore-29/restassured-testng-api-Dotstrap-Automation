# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 65 | `qa-d767b4a4-1e78-4b0a-a281-463e44ed2776` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-6bc17afd-db80-4638-be1d-fad84e276f8d` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-2f04ccad-1401-4489-a6e7-392fda9fd35e` |
| 4 | `POST /v1/conversations` | 201 | 30 | `qa-df99a1b7-26d4-46cb-a8ef-5fa193a6aef9` |
| 5 | `POST /v1/auth/token` | 503 | 30 | `qa-9d298f49-8aa7-45df-b1d3-aeeeebc337f5` |
| 6 | `POST /v1/auth/token` | 200 | 25 | `qa-149a92ab-3008-4ef4-acb3-8c0a09042275` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-03a77a41-72b8-470c-a30f-b9befe62d401` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-e0fc7538-578d-4d2f-b1a6-c7cbe77f482a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-6397f407-0aab-431d-bf2d-e459cf385ca0` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-67e08b7f-9fb0-48be-b681-045aa2f6c6ca` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d767b4a4-1e78-4b0a-a281-463e44ed2776

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d767b4a4-1e78-4b0a-a281-463e44ed2776
Content-Type: application/json

--- request body ---
{"handle":"qa-fc99f5096032","displayName":"QA fc99f5096032","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-d767b4a4-1e78-4b0a-a281-463e44ed2776
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-fc99f5096032
X-Served-Region: eu
Content-Length: 181

{"id":"acc_feba044e-f42b-4ee7-ae53-473093ec98fd","handle":"qa-fc99f5096032","displayName":"QA fc99f5096032","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.036681467Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6bc17afd-db80-4638-be1d-fad84e276f8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc17afd-db80-4638-be1d-fad84e276f8d
Content-Type: application/json

--- request body ---
{"handle":"qa-ddcdcd75f61c","displayName":"QA ddcdcd75f61c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bc17afd-db80-4638-be1d-fad84e276f8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-ddcdcd75f61c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_573d9478-7a1c-486d-ab19-125b06f2fe4f","handle":"qa-ddcdcd75f61c","displayName":"QA ddcdcd75f61c","region":"eu","role":"user","createdAt":"2026-11-11T09:34:36.104354287Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2f04ccad-1401-4489-a6e7-392fda9fd35e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f04ccad-1401-4489-a6e7-392fda9fd35e
Content-Type: application/json

--- request body ---
{"handle":"qa-fc99f5096032","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f04ccad-1401-4489-a6e7-392fda9fd35e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 556
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_feba044e-f42b-4ee7-ae53-473093ec98fd"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-df99a1b7-26d4-46cb-a8ef-5fa193a6aef9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df99a1b7-26d4-46cb-a8ef-5fa193a6aef9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-ddcdcd75f61c","subject":"Error contract","message":"Hi"}

--- response: 201 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-df99a1b7-26d4-46cb-a8ef-5fa193a6aef9
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
Location: /v1/conversations/cnv_f79a6ce2-43a3-4e4a-a706-d12e98e1b19d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f79a6ce2-43a3-4e4a-a706-d12e98e1b19d","subject":"Error contract","status":"open","region":"eu","participants":["qa-fc99f5096032","qa-ddcdcd75f61c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:36.181045418Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-9d298f49-8aa7-45df-b1d3-aeeeebc337f5

--- request headers ---
Accept: application/json
X-Fault-Key: 6acc166e-a4ee-4435-80bc-a54f7f61fdd0
X-Fault: unavailable-once
X-Correlation-Id: qa-9d298f49-8aa7-45df-b1d3-aeeeebc337f5
Content-Type: application/json

--- request body ---
{"handle":"qa-fc99f5096032","password":"****"}

--- response: 503 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9d298f49-8aa7-45df-b1d3-aeeeebc337f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-9d298f49-8aa7-45df-b1d3-aeeeebc337f5"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-149a92ab-3008-4ef4-acb3-8c0a09042275

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-149a92ab-3008-4ef4-acb3-8c0a09042275
Content-Type: application/json

--- request body ---
{"handle":"qa-ddcdcd75f61c","password":"****"}

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-149a92ab-3008-4ef4-acb3-8c0a09042275
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_573d9478-7a1c-486d-ab19-125b06f2fe4f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-03a77a41-72b8-470c-a30f-b9befe62d401

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03a77a41-72b8-470c-a30f-b9befe62d401
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-03a77a41-72b8-470c-a30f-b9befe62d401
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e0fc7538-578d-4d2f-b1a6-c7cbe77f482a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0fc7538-578d-4d2f-b1a6-c7cbe77f482a
Content-Type: application/json

--- request body ---
{"handle":"qa-ddcdcd75f61c","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0fc7538-578d-4d2f-b1a6-c7cbe77f482a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e0fc7538-578d-4d2f-b1a6-c7cbe77f482a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6397f407-0aab-431d-bf2d-e459cf385ca0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6397f407-0aab-431d-bf2d-e459cf385ca0
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6397f407-0aab-431d-bf2d-e459cf385ca0
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-67e08b7f-9fb0-48be-b681-045aa2f6c6ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67e08b7f-9fb0-48be-b681-045aa2f6c6ca
Content-Type: application/json

--- request body ---
{"handle":"qa-fc99f5096032","password":"****"}

--- response: 401 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67e08b7f-9fb0-48be-b681-045aa2f6c6ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 493
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-67e08b7f-9fb0-48be-b681-045aa2f6c6ca"}
```
