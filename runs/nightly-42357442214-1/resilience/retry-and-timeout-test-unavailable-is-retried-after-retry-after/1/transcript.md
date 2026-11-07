# Transcript: A 503 with Retry-After is retried after the wait

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#unavailableIsRetriedAfterRetryAfter` |
| Features | FEAT-RES-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-15a2025a-75b4-4073-b1cf-3fad89efdec7` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-17d52a91-cf77-40c7-9fdc-abd414c7236d` |
| 3 | `GET /v1/accounts/me` | 503 | 15 | `qa-e1524618-d74e-4a5c-bb4a-a8032f03939f` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-955a565c-f938-4e22-9307-9b968862cf5b` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-d995b9d7-7227-4812-ae35-ce10334e43f8` |
| 6 | `POST /v1/auth/token` | 401 | 13 | `qa-d8d57849-6f85-4246-871a-eb4e18e378aa` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-15a2025a-75b4-4073-b1cf-3fad89efdec7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a2025a-75b4-4073-b1cf-3fad89efdec7
Content-Type: application/json

--- request body ---
{"handle":"qa-289b9451983a","displayName":"QA 289b9451983a","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-15a2025a-75b4-4073-b1cf-3fad89efdec7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Location: /v1/accounts/qa-289b9451983a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_610abc8f-4915-471b-bbc8-07c4684f54aa","handle":"qa-289b9451983a","displayName":"QA 289b9451983a","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.962725415Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-17d52a91-cf77-40c7-9fdc-abd414c7236d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d52a91-cf77-40c7-9fdc-abd414c7236d
Content-Type: application/json

--- request body ---
{"handle":"qa-289b9451983a","password":"****"}

--- response: 200 in 26 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d52a91-cf77-40c7-9fdc-abd414c7236d
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_610abc8f-4915-471b-bbc8-07c4684f54aa"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1524618-d74e-4a5c-bb4a-a8032f03939f

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0131f141-6bec-4e92-8a15-1f1665036ed1
X-Correlation-Id: qa-e1524618-d74e-4a5c-bb4a-a8032f03939f
Content-Type: application/json

--- response: 503 in 15 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1524618-d74e-4a5c-bb4a-a8032f03939f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-e1524618-d74e-4a5c-bb4a-a8032f03939f"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-955a565c-f938-4e22-9307-9b968862cf5b

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0131f141-6bec-4e92-8a15-1f1665036ed1
X-Correlation-Id: qa-955a565c-f938-4e22-9307-9b968862cf5b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-955a565c-f938-4e22-9307-9b968862cf5b
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
Content-Length: 181

{"id":"acc_610abc8f-4915-471b-bbc8-07c4684f54aa","handle":"qa-289b9451983a","displayName":"QA 289b9451983a","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.962725415Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d995b9d7-7227-4812-ae35-ce10334e43f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d995b9d7-7227-4812-ae35-ce10334e43f8
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d995b9d7-7227-4812-ae35-ce10334e43f8
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-d8d57849-6f85-4246-871a-eb4e18e378aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8d57849-6f85-4246-871a-eb4e18e378aa
Content-Type: application/json

--- request body ---
{"handle":"qa-289b9451983a","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 07 Nov 2026 08:55:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d8d57849-6f85-4246-871a-eb4e18e378aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d8d57849-6f85-4246-871a-eb4e18e378aa"}
```
