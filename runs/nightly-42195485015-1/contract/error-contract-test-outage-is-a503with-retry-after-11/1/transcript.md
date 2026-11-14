# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[11]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-af3046c1-f6f9-48be-a661-94813f402b35` |
| 2 | `POST /v1/accounts` | 201 | 45 | `qa-e3e83808-70cd-4529-8d32-c41c714d12cc` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-77952734-443a-44c7-bfc1-bc99ef6f03ac` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-91032ce3-a2a8-4298-9ef6-32fa9857235e` |
| 5 | `POST /v1/conversations/{id}/read` | 503 | 26 | `qa-92a40794-3b09-472b-9708-6892027aba7c` |
| 6 | `POST /v1/auth/token` | 200 | 19 | `qa-bce6d5a9-88bd-4221-8a09-e5e50696d2ea` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-a7978817-b878-4cc5-a435-aeed6d06b208` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-701c25b0-6702-4374-9047-ec47169a9758` |
| 9 | `DELETE /v1/accounts/me` | 204 | 22 | `qa-4b355a48-be90-4bbd-8580-5c4bb0e414e7` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-618cc782-d1ba-4d76-9588-820f518871b1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-af3046c1-f6f9-48be-a661-94813f402b35

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af3046c1-f6f9-48be-a661-94813f402b35
Content-Type: application/json

--- request body ---
{"handle":"qa-f861bcb8b681","displayName":"QA f861bcb8b681","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-af3046c1-f6f9-48be-a661-94813f402b35
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 401
RateLimit-Reset: 7
Location: /v1/accounts/qa-f861bcb8b681
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0274a5a3-d576-4148-9e81-d5843f990856","handle":"qa-f861bcb8b681","displayName":"QA f861bcb8b681","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.721182114Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e3e83808-70cd-4529-8d32-c41c714d12cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3e83808-70cd-4529-8d32-c41c714d12cc
Content-Type: application/json

--- request body ---
{"handle":"qa-15cc7d3b37c6","displayName":"QA 15cc7d3b37c6","password":"****","region":"eu"}

--- response: 201 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3e83808-70cd-4529-8d32-c41c714d12cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Location: /v1/accounts/qa-15cc7d3b37c6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b772fea5-26dc-4242-97fd-2edf27a10624","handle":"qa-15cc7d3b37c6","displayName":"QA 15cc7d3b37c6","region":"eu","role":"user","createdAt":"2026-11-06T09:30:33.780168600Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-77952734-443a-44c7-bfc1-bc99ef6f03ac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77952734-443a-44c7-bfc1-bc99ef6f03ac
Content-Type: application/json

--- request body ---
{"handle":"qa-f861bcb8b681","password":"****"}

--- response: 200 in 31 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-77952734-443a-44c7-bfc1-bc99ef6f03ac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 390
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0274a5a3-d576-4148-9e81-d5843f990856"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-91032ce3-a2a8-4298-9ef6-32fa9857235e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91032ce3-a2a8-4298-9ef6-32fa9857235e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15cc7d3b37c6","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-91032ce3-a2a8-4298-9ef6-32fa9857235e
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
Location: /v1/conversations/cnv_c965eb32-e76a-4910-b16a-49b699ef28b0
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_c965eb32-e76a-4910-b16a-49b699ef28b0","subject":"Error contract","status":"open","region":"eu","participants":["qa-f861bcb8b681","qa-15cc7d3b37c6"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:33.866504547Z"}
```

## 5. POST /v1/conversations/{id}/read

```text
#5 POST http://localhost:7070/v1/conversations/cnv_c965eb32-e76a-4910-b16a-49b699ef28b0/read
correlation: qa-92a40794-3b09-472b-9708-6892027aba7c

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 1a27571b-f6cc-43c3-ab8a-8d2d7dcf1cd3
X-Correlation-Id: qa-92a40794-3b09-472b-9708-6892027aba7c
Content-Type: application/json

--- response: 503 in 26 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92a40794-3b09-472b-9708-6892027aba7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 307

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/conversations/cnv_c965eb32-e76a-4910-b16a-49b699ef28b0/read","correlationId":"qa-92a40794-3b09-472b-9708-6892027aba7c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bce6d5a9-88bd-4221-8a09-e5e50696d2ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bce6d5a9-88bd-4221-8a09-e5e50696d2ea
Content-Type: application/json

--- request body ---
{"handle":"qa-15cc7d3b37c6","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-bce6d5a9-88bd-4221-8a09-e5e50696d2ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 374
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b772fea5-26dc-4242-97fd-2edf27a10624"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a7978817-b878-4cc5-a435-aeed6d06b208

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7978817-b878-4cc5-a435-aeed6d06b208
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a7978817-b878-4cc5-a435-aeed6d06b208
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
correlation: qa-701c25b0-6702-4374-9047-ec47169a9758

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-701c25b0-6702-4374-9047-ec47169a9758
Content-Type: application/json

--- request body ---
{"handle":"qa-15cc7d3b37c6","password":"****"}

--- response: 401 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-701c25b0-6702-4374-9047-ec47169a9758
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 369
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-701c25b0-6702-4374-9047-ec47169a9758"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b355a48-be90-4bbd-8580-5c4bb0e414e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b355a48-be90-4bbd-8580-5c4bb0e414e7
Content-Type: application/json

--- response: 204 in 22 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b355a48-be90-4bbd-8580-5c4bb0e414e7
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
correlation: qa-618cc782-d1ba-4d76-9588-820f518871b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-618cc782-d1ba-4d76-9588-820f518871b1
Content-Type: application/json

--- request body ---
{"handle":"qa-f861bcb8b681","password":"****"}

--- response: 401 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-618cc782-d1ba-4d76-9588-820f518871b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 362
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-618cc782-d1ba-4d76-9588-820f518871b1"}
```
