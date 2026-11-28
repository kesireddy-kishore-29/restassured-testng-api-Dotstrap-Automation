# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/credits/balance]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[13]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-2164b16b-359d-44d2-9001-746fe05eab13` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-9cfe283e-d908-415c-b458-7d4cc51937bb` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-711547d0-8bd8-49c8-b588-49fc524ed355` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-ddb39c3e-e8fb-4b41-b07b-faeb4def0ec9` |
| 5 | `GET /v1/credits/balance` | 503 | 20 | `qa-d4bcace6-e8f1-4d1f-b17d-c4fa8e0b5ac1` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-70af488a-9008-450a-b28c-ce77c9f8585a` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-7ca2ddfc-1887-4fdd-8ad6-e6cdc9f224f0` |
| 8 | `POST /v1/auth/token` | 401 | 21 | `qa-09327581-8a43-4b6e-a57f-38f1c3866fc6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-00a43161-3099-4c7b-8903-854dc56082a7` |
| 10 | `POST /v1/auth/token` | 401 | 55 | `qa-f09dc5fe-aaed-4fdd-b3cb-8082d471dfc9` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2164b16b-359d-44d2-9001-746fe05eab13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2164b16b-359d-44d2-9001-746fe05eab13
Content-Type: application/json

--- request body ---
{"handle":"qa-6dd81ef13570","displayName":"QA 6dd81ef13570","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-2164b16b-359d-44d2-9001-746fe05eab13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Location: /v1/accounts/qa-6dd81ef13570
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8bad1d3b-b519-46cb-9e8d-6d23c8e2e11d","handle":"qa-6dd81ef13570","displayName":"QA 6dd81ef13570","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.425283043Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-9cfe283e-d908-415c-b458-7d4cc51937bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cfe283e-d908-415c-b458-7d4cc51937bb
Content-Type: application/json

--- request body ---
{"handle":"qa-0268b4da95da","displayName":"QA 0268b4da95da","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cfe283e-d908-415c-b458-7d4cc51937bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-0268b4da95da
X-Served-Region: eu
Content-Length: 181

{"id":"acc_38e3ed57-6f82-48e4-96fc-f774ebb45235","handle":"qa-0268b4da95da","displayName":"QA 0268b4da95da","region":"eu","role":"user","createdAt":"2026-11-26T11:02:46.483114025Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-711547d0-8bd8-49c8-b588-49fc524ed355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-711547d0-8bd8-49c8-b588-49fc524ed355
Content-Type: application/json

--- request body ---
{"handle":"qa-6dd81ef13570","password":"****"}

--- response: 200 in 53 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-711547d0-8bd8-49c8-b588-49fc524ed355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 342
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8bad1d3b-b519-46cb-9e8d-6d23c8e2e11d"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ddb39c3e-e8fb-4b41-b07b-faeb4def0ec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddb39c3e-e8fb-4b41-b07b-faeb4def0ec9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0268b4da95da","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddb39c3e-e8fb-4b41-b07b-faeb4def0ec9
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
Location: /v1/conversations/cnv_d6950f9f-52f5-4cc1-847c-c7217a9dc9ad
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d6950f9f-52f5-4cc1-847c-c7217a9dc9ad","subject":"Error contract","status":"open","region":"eu","participants":["qa-6dd81ef13570","qa-0268b4da95da"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:46.584619526Z"}
```

## 5. GET /v1/credits/balance

```text
#5 GET http://localhost:7070/v1/credits/balance
correlation: qa-d4bcace6-e8f1-4d1f-b17d-c4fa8e0b5ac1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 151bbb81-35dd-4449-b28e-c3aa7452a7b7
X-Correlation-Id: qa-d4bcace6-e8f1-4d1f-b17d-c4fa8e0b5ac1
Content-Type: application/json

--- response: 503 in 20 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d4bcace6-e8f1-4d1f-b17d-c4fa8e0b5ac1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 263

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/balance","correlationId":"qa-d4bcace6-e8f1-4d1f-b17d-c4fa8e0b5ac1"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-70af488a-9008-450a-b28c-ce77c9f8585a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70af488a-9008-450a-b28c-ce77c9f8585a
Content-Type: application/json

--- request body ---
{"handle":"qa-0268b4da95da","password":"****"}

--- response: 200 in 39 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-70af488a-9008-450a-b28c-ce77c9f8585a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_38e3ed57-6f82-48e4-96fc-f774ebb45235"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7ca2ddfc-1887-4fdd-8ad6-e6cdc9f224f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ca2ddfc-1887-4fdd-8ad6-e6cdc9f224f0
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7ca2ddfc-1887-4fdd-8ad6-e6cdc9f224f0
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
correlation: qa-09327581-8a43-4b6e-a57f-38f1c3866fc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09327581-8a43-4b6e-a57f-38f1c3866fc6
Content-Type: application/json

--- request body ---
{"handle":"qa-0268b4da95da","password":"****"}

--- response: 401 in 21 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09327581-8a43-4b6e-a57f-38f1c3866fc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 324
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09327581-8a43-4b6e-a57f-38f1c3866fc6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00a43161-3099-4c7b-8903-854dc56082a7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00a43161-3099-4c7b-8903-854dc56082a7
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00a43161-3099-4c7b-8903-854dc56082a7
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
correlation: qa-f09dc5fe-aaed-4fdd-b3cb-8082d471dfc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f09dc5fe-aaed-4fdd-b3cb-8082d471dfc9
Content-Type: application/json

--- request body ---
{"handle":"qa-6dd81ef13570","password":"****"}

--- response: 401 in 55 ms ---
Date: Thu, 26 Nov 2026 11:02:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f09dc5fe-aaed-4fdd-b3cb-8082d471dfc9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f09dc5fe-aaed-4fdd-b3cb-8082d471dfc9"}
```
