# Transcript: Every operation answers an outage with a 503 problem and Retry-After [DELETE /v1/accounts/me]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[4]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-473a17b8-a68a-4702-8c44-84b24dc311cb` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-583802e1-4987-4313-aafb-7c64c67f952b` |
| 3 | `POST /v1/auth/token` | 200 | 39 | `qa-ce0fc50b-116c-457e-b92d-59200a59ef14` |
| 4 | `POST /v1/conversations` | 201 | 18 | `qa-19d02c48-6c54-4e16-814e-186c1f3483f6` |
| 5 | `DELETE /v1/accounts/me` | 503 | 16 | `qa-bcc37356-1c25-4ce2-a33c-e4eda1415b9c` |
| 6 | `POST /v1/auth/token` | 200 | 48 | `qa-bf9b828e-7b61-4174-ae3e-8d7b918d2adb` |
| 7 | `DELETE /v1/accounts/me` | 204 | 23 | `qa-f49696a5-aa22-4491-ac87-378ec5ff94ca` |
| 8 | `POST /v1/auth/token` | 401 | 20 | `qa-767c452d-ff74-45c5-80e4-35bbdd29d72f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-191fda47-cca6-4b64-90e7-191f88e7fff7` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-b9fcb6e2-54df-4995-8cd9-1bb20fa72c3d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-473a17b8-a68a-4702-8c44-84b24dc311cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-473a17b8-a68a-4702-8c44-84b24dc311cb
Content-Type: application/json

--- request body ---
{"handle":"qa-85ae55395408","displayName":"QA 85ae55395408","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-473a17b8-a68a-4702-8c44-84b24dc311cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 481
RateLimit-Reset: 8
Location: /v1/accounts/qa-85ae55395408
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3c682cd-bdfa-4253-a946-ff79a3f82eea","handle":"qa-85ae55395408","displayName":"QA 85ae55395408","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.065909455Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-583802e1-4987-4313-aafb-7c64c67f952b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-583802e1-4987-4313-aafb-7c64c67f952b
Content-Type: application/json

--- request body ---
{"handle":"qa-0b9d38d2306d","displayName":"QA 0b9d38d2306d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-583802e1-4987-4313-aafb-7c64c67f952b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Location: /v1/accounts/qa-0b9d38d2306d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0de1a78e-cf86-4621-8095-e5617e5eb9ac","handle":"qa-0b9d38d2306d","displayName":"QA 0b9d38d2306d","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.106181648Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ce0fc50b-116c-457e-b92d-59200a59ef14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce0fc50b-116c-457e-b92d-59200a59ef14
Content-Type: application/json

--- request body ---
{"handle":"qa-85ae55395408","password":"****"}

--- response: 200 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce0fc50b-116c-457e-b92d-59200a59ef14
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 472
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3c682cd-bdfa-4253-a946-ff79a3f82eea"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-19d02c48-6c54-4e16-814e-186c1f3483f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19d02c48-6c54-4e16-814e-186c1f3483f6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-0b9d38d2306d","subject":"Error contract","message":"Hi"}

--- response: 201 in 18 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-19d02c48-6c54-4e16-814e-186c1f3483f6
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
Location: /v1/conversations/cnv_d70c17a3-0125-4238-8773-abb992489b03
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d70c17a3-0125-4238-8773-abb992489b03","subject":"Error contract","status":"open","region":"eu","participants":["qa-85ae55395408","qa-0b9d38d2306d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.224266318Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-bcc37356-1c25-4ce2-a33c-e4eda1415b9c

--- request headers ---
Accept: application/json
X-Fault-Key: 4f6b13d3-81ea-485f-828a-3a45c9ce0aaa
X-Fault: unavailable-once
X-Correlation-Id: qa-bcc37356-1c25-4ce2-a33c-e4eda1415b9c
Content-Type: application/json

--- response: 503 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bcc37356-1c25-4ce2-a33c-e4eda1415b9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-bcc37356-1c25-4ce2-a33c-e4eda1415b9c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bf9b828e-7b61-4174-ae3e-8d7b918d2adb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf9b828e-7b61-4174-ae3e-8d7b918d2adb
Content-Type: application/json

--- request body ---
{"handle":"qa-0b9d38d2306d","password":"****"}

--- response: 200 in 48 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf9b828e-7b61-4174-ae3e-8d7b918d2adb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 447
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0de1a78e-cf86-4621-8095-e5617e5eb9ac"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f49696a5-aa22-4491-ac87-378ec5ff94ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f49696a5-aa22-4491-ac87-378ec5ff94ca
Content-Type: application/json

--- response: 204 in 23 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f49696a5-aa22-4491-ac87-378ec5ff94ca
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
correlation: qa-767c452d-ff74-45c5-80e4-35bbdd29d72f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-767c452d-ff74-45c5-80e4-35bbdd29d72f
Content-Type: application/json

--- request body ---
{"handle":"qa-0b9d38d2306d","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-767c452d-ff74-45c5-80e4-35bbdd29d72f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-767c452d-ff74-45c5-80e4-35bbdd29d72f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-191fda47-cca6-4b64-90e7-191f88e7fff7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-191fda47-cca6-4b64-90e7-191f88e7fff7
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-191fda47-cca6-4b64-90e7-191f88e7fff7
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
correlation: qa-b9fcb6e2-54df-4995-8cd9-1bb20fa72c3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9fcb6e2-54df-4995-8cd9-1bb20fa72c3d
Content-Type: application/json

--- request body ---
{"handle":"qa-85ae55395408","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9fcb6e2-54df-4995-8cd9-1bb20fa72c3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 439
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b9fcb6e2-54df-4995-8cd9-1bb20fa72c3d"}
```
