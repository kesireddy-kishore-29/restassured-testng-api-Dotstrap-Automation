# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/auth/token, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[2]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 492 | `qa-8c7b8be7-4f8b-4489-b068-cf0a6da744dc` |
| 2 | `POST /v1/accounts` | 201 | 79 | `qa-c1d75a0e-b64c-4cec-9c59-2848d9c391a4` |
| 3 | `POST /v1/auth/token` | 200 | 99 | `qa-63251d64-c73f-4174-bc5c-c053a28d78e1` |
| 4 | `POST /v1/conversations` | 201 | 91 | `qa-5c403cdf-5b3e-42b7-96ef-b85fb0e122c4` |
| 5 | `POST /v1/auth/token` | 422 | 81 | `qa-97bc9c48-0213-4663-a0a4-fc80c88358bd` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-d037daa9-1d74-419b-bc02-47fda436fbb0` |
| 7 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-b795de01-0783-4970-be82-66a1b1b79dce` |
| 8 | `POST /v1/auth/token` | 401 | 19 | `qa-e52fec89-e891-4727-bcb2-084c9f898511` |
| 9 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-c69dac74-c5f8-4c1f-927f-50dc6cc4b201` |
| 10 | `POST /v1/auth/token` | 401 | 36 | `qa-7942a1d8-7784-47e3-878b-b8bb3e7e27a4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8c7b8be7-4f8b-4489-b068-cf0a6da744dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c7b8be7-4f8b-4489-b068-cf0a6da744dc
Content-Type: application/json

--- request body ---
{"handle":"qa-903f8ef412fd","displayName":"QA 903f8ef412fd","password":"****","region":"eu"}

--- response: 201 in 492 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c7b8be7-4f8b-4489-b068-cf0a6da744dc
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
Location: /v1/accounts/qa-903f8ef412fd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_be30097c-f61f-4e2f-8eb7-6987a54e93f4","handle":"qa-903f8ef412fd","displayName":"QA 903f8ef412fd","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.634193735Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c1d75a0e-b64c-4cec-9c59-2848d9c391a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1d75a0e-b64c-4cec-9c59-2848d9c391a4
Content-Type: application/json

--- request body ---
{"handle":"qa-6b517d990c77","displayName":"QA 6b517d990c77","password":"****","region":"eu"}

--- response: 201 in 79 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1d75a0e-b64c-4cec-9c59-2848d9c391a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 10
Location: /v1/accounts/qa-6b517d990c77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65baa17f-3531-4f91-a0ab-ec9afe5a6fa0","handle":"qa-6b517d990c77","displayName":"QA 6b517d990c77","region":"eu","role":"user","createdAt":"2026-10-29T08:38:58.152973062Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-63251d64-c73f-4174-bc5c-c053a28d78e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-63251d64-c73f-4174-bc5c-c053a28d78e1
Content-Type: application/json

--- request body ---
{"handle":"qa-903f8ef412fd","password":"****"}

--- response: 200 in 99 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-63251d64-c73f-4174-bc5c-c053a28d78e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_be30097c-f61f-4e2f-8eb7-6987a54e93f4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5c403cdf-5b3e-42b7-96ef-b85fb0e122c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c403cdf-5b3e-42b7-96ef-b85fb0e122c4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6b517d990c77","subject":"Error contract","message":"Hi"}

--- response: 201 in 91 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c403cdf-5b3e-42b7-96ef-b85fb0e122c4
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
Location: /v1/conversations/cnv_c998d92f-1db9-4a4c-bca1-8a2c420ff39c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c998d92f-1db9-4a4c-bca1-8a2c420ff39c","subject":"Error contract","status":"open","region":"eu","participants":["qa-903f8ef412fd","qa-6b517d990c77"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:58.472928805Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-97bc9c48-0213-4663-a0a4-fc80c88358bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97bc9c48-0213-4663-a0a4-fc80c88358bd
Content-Type: application/json

--- request body ---
{"handle":"qa-903f8ef412fd","password":"****","ttlSeconds":0}

--- response: 422 in 81 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-97bc9c48-0213-4663-a0a4-fc80c88358bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 550
RateLimit-Reset: 9
Content-Length: 294

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/auth/token","correlationId":"qa-97bc9c48-0213-4663-a0a4-fc80c88358bd","errors":[{"field":"ttlSeconds","message":"1-3600"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d037daa9-1d74-419b-bc02-47fda436fbb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d037daa9-1d74-419b-bc02-47fda436fbb0
Content-Type: application/json

--- request body ---
{"handle":"qa-6b517d990c77","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d037daa9-1d74-419b-bc02-47fda436fbb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 546
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65baa17f-3531-4f91-a0ab-ec9afe5a6fa0"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b795de01-0783-4970-be82-66a1b1b79dce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b795de01-0783-4970-be82-66a1b1b79dce
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b795de01-0783-4970-be82-66a1b1b79dce
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
correlation: qa-e52fec89-e891-4727-bcb2-084c9f898511

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e52fec89-e891-4727-bcb2-084c9f898511
Content-Type: application/json

--- request body ---
{"handle":"qa-6b517d990c77","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e52fec89-e891-4727-bcb2-084c9f898511
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e52fec89-e891-4727-bcb2-084c9f898511"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c69dac74-c5f8-4c1f-927f-50dc6cc4b201

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c69dac74-c5f8-4c1f-927f-50dc6cc4b201
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c69dac74-c5f8-4c1f-927f-50dc6cc4b201
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
correlation: qa-7942a1d8-7784-47e3-878b-b8bb3e7e27a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7942a1d8-7784-47e3-878b-b8bb3e7e27a4
Content-Type: application/json

--- request body ---
{"handle":"qa-903f8ef412fd","password":"****"}

--- response: 401 in 36 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7942a1d8-7784-47e3-878b-b8bb3e7e27a4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 522
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7942a1d8-7784-47e3-878b-b8bb3e7e27a4"}
```
