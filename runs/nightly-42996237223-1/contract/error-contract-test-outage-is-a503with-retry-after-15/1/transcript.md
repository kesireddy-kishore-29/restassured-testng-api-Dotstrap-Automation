# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/credits/purchases]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[15]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-35ab9a86-d4a3-4011-bec0-2ac6da667b3f` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-2d894538-633d-4d50-81bc-2656af172809` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-aec3888f-14a8-4762-bf6b-51f79a6eaba0` |
| 4 | `POST /v1/conversations` | 201 | 21 | `qa-f6f0c9dc-acc5-41ff-a0db-972e73bf21b5` |
| 5 | `POST /v1/credits/purchases` | 503 | 23 | `qa-5a15d982-d8f5-4db8-88de-9df5406fd0c8` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-0f3147e3-13f9-45af-83c6-1448bb0c5603` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-dcb4d138-6b66-4047-bb1a-7e728e7814b9` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-52500dbd-a72c-48cc-8b46-44f400de190e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-2cd375d3-ba18-4971-b856-f8acd3b65d23` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-a680f5d2-563a-4f1d-bed8-c4de38b662ac` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-35ab9a86-d4a3-4011-bec0-2ac6da667b3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35ab9a86-d4a3-4011-bec0-2ac6da667b3f
Content-Type: application/json

--- request body ---
{"handle":"qa-79a5d5d5b3e1","displayName":"QA 79a5d5d5b3e1","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-35ab9a86-d4a3-4011-bec0-2ac6da667b3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 7
Location: /v1/accounts/qa-79a5d5d5b3e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0e7ad943-e727-4a6e-a3bf-04161b37a146","handle":"qa-79a5d5d5b3e1","displayName":"QA 79a5d5d5b3e1","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.867781539Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2d894538-633d-4d50-81bc-2656af172809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d894538-633d-4d50-81bc-2656af172809
Content-Type: application/json

--- request body ---
{"handle":"qa-7be1cf156179","displayName":"QA 7be1cf156179","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d894538-633d-4d50-81bc-2656af172809
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 338
RateLimit-Reset: 7
Location: /v1/accounts/qa-7be1cf156179
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ae0e58ba-6fb0-41c2-85ae-340db23c37b5","handle":"qa-7be1cf156179","displayName":"QA 7be1cf156179","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.902644045Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-aec3888f-14a8-4762-bf6b-51f79a6eaba0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aec3888f-14a8-4762-bf6b-51f79a6eaba0
Content-Type: application/json

--- request body ---
{"handle":"qa-79a5d5d5b3e1","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-aec3888f-14a8-4762-bf6b-51f79a6eaba0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 336
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0e7ad943-e727-4a6e-a3bf-04161b37a146"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f6f0c9dc-acc5-41ff-a0db-972e73bf21b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6f0c9dc-acc5-41ff-a0db-972e73bf21b5
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7be1cf156179","subject":"Error contract","message":"Hi"}

--- response: 201 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6f0c9dc-acc5-41ff-a0db-972e73bf21b5
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
Location: /v1/conversations/cnv_ac6bffff-6fd7-4dff-b424-7ad985d05bb9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ac6bffff-6fd7-4dff-b424-7ad985d05bb9","subject":"Error contract","status":"open","region":"eu","participants":["qa-79a5d5d5b3e1","qa-7be1cf156179"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.966368248Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5a15d982-d8f5-4db8-88de-9df5406fd0c8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
Idempotency-Key: qa-39f804ca39a74cfbba7cda4ee1c16da5
X-Fault-Key: 66d73e2a-04c0-48ee-972b-173129e0005f
X-Correlation-Id: qa-5a15d982-d8f5-4db8-88de-9df5406fd0c8
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 503 in 23 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a15d982-d8f5-4db8-88de-9df5406fd0c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 265

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/credits/purchases","correlationId":"qa-5a15d982-d8f5-4db8-88de-9df5406fd0c8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0f3147e3-13f9-45af-83c6-1448bb0c5603

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f3147e3-13f9-45af-83c6-1448bb0c5603
Content-Type: application/json

--- request body ---
{"handle":"qa-7be1cf156179","password":"****"}

--- response: 200 in 30 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f3147e3-13f9-45af-83c6-1448bb0c5603
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ae0e58ba-6fb0-41c2-85ae-340db23c37b5"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dcb4d138-6b66-4047-bb1a-7e728e7814b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcb4d138-6b66-4047-bb1a-7e728e7814b9
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dcb4d138-6b66-4047-bb1a-7e728e7814b9
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
correlation: qa-52500dbd-a72c-48cc-8b46-44f400de190e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52500dbd-a72c-48cc-8b46-44f400de190e
Content-Type: application/json

--- request body ---
{"handle":"qa-7be1cf156179","password":"****"}

--- response: 401 in 16 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52500dbd-a72c-48cc-8b46-44f400de190e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 308
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-52500dbd-a72c-48cc-8b46-44f400de190e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2cd375d3-ba18-4971-b856-f8acd3b65d23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cd375d3-ba18-4971-b856-f8acd3b65d23
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2cd375d3-ba18-4971-b856-f8acd3b65d23
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
correlation: qa-a680f5d2-563a-4f1d-bed8-c4de38b662ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a680f5d2-563a-4f1d-bed8-c4de38b662ac
Content-Type: application/json

--- request body ---
{"handle":"qa-79a5d5d5b3e1","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a680f5d2-563a-4f1d-bed8-c4de38b662ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a680f5d2-563a-4f1d-bed8-c4de38b662ac"}
```
