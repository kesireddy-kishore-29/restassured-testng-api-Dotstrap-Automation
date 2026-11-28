# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/conversations]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[7]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-f67b609a-3228-4b7b-a01b-b4fbea9ea063` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-6ef98e75-7722-4bd4-b90a-7112f6fe3fa7` |
| 3 | `POST /v1/auth/token` | 200 | 27 | `qa-d240ac1b-5505-4955-a990-1efb322dba0a` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-4b02598e-a36d-476d-9a65-7d6414f68d12` |
| 5 | `GET /v1/conversations` | 503 | 19 | `qa-7476013b-cd9b-4b1f-96c7-031b94d90447` |
| 6 | `POST /v1/auth/token` | 200 | 18 | `qa-07ff3156-eb4c-4598-be4f-9e4ac1ff7054` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-edde2f31-6162-426a-9261-c6c7165cd47c` |
| 8 | `POST /v1/auth/token` | 401 | 14 | `qa-b7dc0d80-0f52-4168-a9d4-1eddc21dca11` |
| 9 | `DELETE /v1/accounts/me` | 204 | 24 | `qa-137f7b3c-f3c9-4ffe-8bb1-0a06a37a06ae` |
| 10 | `POST /v1/auth/token` | 401 | 16 | `qa-6ad187c6-4ec4-47f9-96fa-4d046b4fa4d7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f67b609a-3228-4b7b-a01b-b4fbea9ea063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f67b609a-3228-4b7b-a01b-b4fbea9ea063
Content-Type: application/json

--- request body ---
{"handle":"qa-18298b334a16","displayName":"QA 18298b334a16","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-f67b609a-3228-4b7b-a01b-b4fbea9ea063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 471
RateLimit-Reset: 8
Location: /v1/accounts/qa-18298b334a16
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b05fd16e-4e57-4c9e-aa51-535654190c2e","handle":"qa-18298b334a16","displayName":"QA 18298b334a16","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.279111855Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6ef98e75-7722-4bd4-b90a-7112f6fe3fa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ef98e75-7722-4bd4-b90a-7112f6fe3fa7
Content-Type: application/json

--- request body ---
{"handle":"qa-047d166d9b98","displayName":"QA 047d166d9b98","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ef98e75-7722-4bd4-b90a-7112f6fe3fa7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-047d166d9b98
X-Served-Region: eu
Content-Length: 181

{"id":"acc_77e8544d-a3ad-41a0-88f8-ee43648a5b1c","handle":"qa-047d166d9b98","displayName":"QA 047d166d9b98","region":"eu","role":"user","createdAt":"2026-11-28T10:37:24.322911551Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-d240ac1b-5505-4955-a990-1efb322dba0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d240ac1b-5505-4955-a990-1efb322dba0a
Content-Type: application/json

--- request body ---
{"handle":"qa-18298b334a16","password":"****"}

--- response: 200 in 27 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-d240ac1b-5505-4955-a990-1efb322dba0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 457
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b05fd16e-4e57-4c9e-aa51-535654190c2e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-4b02598e-a36d-476d-9a65-7d6414f68d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b02598e-a36d-476d-9a65-7d6414f68d12
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-047d166d9b98","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b02598e-a36d-476d-9a65-7d6414f68d12
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
Location: /v1/conversations/cnv_2157d0ef-6761-4f6d-bd8a-4e3e2787100d
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2157d0ef-6761-4f6d-bd8a-4e3e2787100d","subject":"Error contract","status":"open","region":"eu","participants":["qa-18298b334a16","qa-047d166d9b98"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-28T10:37:24.382895936Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-7476013b-cd9b-4b1f-96c7-031b94d90447

--- request headers ---
Accept: application/json
X-Fault-Key: 039d8f9b-0626-4124-becd-e8c7f0c95750
X-Fault: unavailable-once
X-Correlation-Id: qa-7476013b-cd9b-4b1f-96c7-031b94d90447
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7476013b-cd9b-4b1f-96c7-031b94d90447
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 261

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations","correlationId":"qa-7476013b-cd9b-4b1f-96c7-031b94d90447"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-07ff3156-eb4c-4598-be4f-9e4ac1ff7054

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-07ff3156-eb4c-4598-be4f-9e4ac1ff7054
Content-Type: application/json

--- request body ---
{"handle":"qa-047d166d9b98","password":"****"}

--- response: 200 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/json
X-Correlation-Id: qa-07ff3156-eb4c-4598-be4f-9e4ac1ff7054
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 443
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_77e8544d-a3ad-41a0-88f8-ee43648a5b1c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-edde2f31-6162-426a-9261-c6c7165cd47c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edde2f31-6162-426a-9261-c6c7165cd47c
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-edde2f31-6162-426a-9261-c6c7165cd47c
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
correlation: qa-b7dc0d80-0f52-4168-a9d4-1eddc21dca11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7dc0d80-0f52-4168-a9d4-1eddc21dca11
Content-Type: application/json

--- request body ---
{"handle":"qa-047d166d9b98","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7dc0d80-0f52-4168-a9d4-1eddc21dca11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 440
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b7dc0d80-0f52-4168-a9d4-1eddc21dca11"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-137f7b3c-f3c9-4ffe-8bb1-0a06a37a06ae

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-137f7b3c-f3c9-4ffe-8bb1-0a06a37a06ae
Content-Type: application/json

--- response: 204 in 24 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: text/plain
X-Correlation-Id: qa-137f7b3c-f3c9-4ffe-8bb1-0a06a37a06ae
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6ad187c6-4ec4-47f9-96fa-4d046b4fa4d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ad187c6-4ec4-47f9-96fa-4d046b4fa4d7
Content-Type: application/json

--- request body ---
{"handle":"qa-18298b334a16","password":"****"}

--- response: 401 in 16 ms ---
Date: Sat, 28 Nov 2026 10:37:24 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ad187c6-4ec4-47f9-96fa-4d046b4fa4d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 434
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6ad187c6-4ec4-47f9-96fa-4d046b4fa4d7"}
```
