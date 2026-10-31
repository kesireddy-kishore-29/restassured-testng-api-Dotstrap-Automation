# Transcript: Every operation answers an outage with a 503 problem and Retry-After [GET /v1/admin/stats]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[16]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-857f0c0e-4b3b-4648-8883-276bec53a21f` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-29d9c880-acc1-4cf6-8f7c-075f3756a643` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-c1806c13-991a-457a-85d0-37fc76d50324` |
| 4 | `POST /v1/conversations` | 201 | 5 | `qa-37056a8a-b27e-4145-8779-b58a1f8cc540` |
| 5 | `GET /v1/admin/stats` | 503 | 3 | `qa-4c3e83a9-5aef-4e3b-9821-1c42ce85ab1e` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-d2b0497d-26ec-4db6-ae6e-ef6fabf9bc46` |
| 7 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-e7e2d45c-5635-4e92-9727-a360714e3add` |
| 8 | `POST /v1/auth/token` | 401 | 6 | `qa-630f28cc-00f2-4828-860d-75f0b6e1ff96` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-0604a423-a478-4055-8cde-e01dcb36da6e` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-a98dc83b-c876-4f24-8906-5fdaecb2d032` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-857f0c0e-4b3b-4648-8883-276bec53a21f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-857f0c0e-4b3b-4648-8883-276bec53a21f
Content-Type: application/json

--- request body ---
{"handle":"qa-39679eac21d1","displayName":"QA 39679eac21d1","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-857f0c0e-4b3b-4648-8883-276bec53a21f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 321
RateLimit-Reset: 8
Location: /v1/accounts/qa-39679eac21d1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_32c06f67-7d47-45af-81f5-078380bda1ef","handle":"qa-39679eac21d1","displayName":"QA 39679eac21d1","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.352656002Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-29d9c880-acc1-4cf6-8f7c-075f3756a643

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29d9c880-acc1-4cf6-8f7c-075f3756a643
Content-Type: application/json

--- request body ---
{"handle":"qa-c5bcc4fcb099","displayName":"QA c5bcc4fcb099","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-29d9c880-acc1-4cf6-8f7c-075f3756a643
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 8
Location: /v1/accounts/qa-c5bcc4fcb099
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5411a8d4-a92f-4973-8fc1-b3b94c5c257a","handle":"qa-c5bcc4fcb099","displayName":"QA c5bcc4fcb099","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.367928672Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-c1806c13-991a-457a-85d0-37fc76d50324

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1806c13-991a-457a-85d0-37fc76d50324
Content-Type: application/json

--- request body ---
{"handle":"qa-39679eac21d1","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1806c13-991a-457a-85d0-37fc76d50324
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_32c06f67-7d47-45af-81f5-078380bda1ef"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-37056a8a-b27e-4145-8779-b58a1f8cc540

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37056a8a-b27e-4145-8779-b58a1f8cc540
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-c5bcc4fcb099","subject":"Error contract","message":"Hi"}

--- response: 201 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-37056a8a-b27e-4145-8779-b58a1f8cc540
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
Location: /v1/conversations/cnv_77928b3a-899a-4fab-9230-f3cb1de239c5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_77928b3a-899a-4fab-9230-f3cb1de239c5","subject":"Error contract","status":"open","region":"eu","participants":["qa-39679eac21d1","qa-c5bcc4fcb099"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:42:53.400459106Z"}
```

## 5. GET /v1/admin/stats

```text
#5 GET http://localhost:7070/v1/admin/stats
correlation: qa-4c3e83a9-5aef-4e3b-9821-1c42ce85ab1e

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 432d50af-f093-4a26-be8d-dad463ed87a5
X-Correlation-Id: qa-4c3e83a9-5aef-4e3b-9821-1c42ce85ab1e
Content-Type: application/json

--- response: 503 in 3 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c3e83a9-5aef-4e3b-9821-1c42ce85ab1e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/admin/stats","correlationId":"qa-4c3e83a9-5aef-4e3b-9821-1c42ce85ab1e"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d2b0497d-26ec-4db6-ae6e-ef6fabf9bc46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2b0497d-26ec-4db6-ae6e-ef6fabf9bc46
Content-Type: application/json

--- request body ---
{"handle":"qa-c5bcc4fcb099","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2b0497d-26ec-4db6-ae6e-ef6fabf9bc46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5411a8d4-a92f-4973-8fc1-b3b94c5c257a"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7e2d45c-5635-4e92-9727-a360714e3add

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7e2d45c-5635-4e92-9727-a360714e3add
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7e2d45c-5635-4e92-9727-a360714e3add
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
correlation: qa-630f28cc-00f2-4828-860d-75f0b6e1ff96

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-630f28cc-00f2-4828-860d-75f0b6e1ff96
Content-Type: application/json

--- request body ---
{"handle":"qa-c5bcc4fcb099","password":"****"}

--- response: 401 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-630f28cc-00f2-4828-860d-75f0b6e1ff96
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 298
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-630f28cc-00f2-4828-860d-75f0b6e1ff96"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0604a423-a478-4055-8cde-e01dcb36da6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0604a423-a478-4055-8cde-e01dcb36da6e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0604a423-a478-4055-8cde-e01dcb36da6e
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
correlation: qa-a98dc83b-c876-4f24-8906-5fdaecb2d032

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a98dc83b-c876-4f24-8906-5fdaecb2d032
Content-Type: application/json

--- request body ---
{"handle":"qa-39679eac21d1","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a98dc83b-c876-4f24-8906-5fdaecb2d032
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a98dc83b-c876-4f24-8906-5fdaecb2d032"}
```
