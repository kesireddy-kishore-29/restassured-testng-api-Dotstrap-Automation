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
| 1 | `POST /v1/accounts` | 201 | 310 | `qa-124ef64b-37e2-46a1-a0a7-cf2ffabf6e76` |
| 2 | `POST /v1/auth/token` | 200 | 39 | `qa-39cda4d7-b768-4c31-93e0-1e45f15fbea6` |
| 3 | `GET /v1/accounts/me` | 503 | 69 | `qa-f179c6ed-1e6e-411d-b1de-28d1111b3e8d` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-a7857de5-6588-473e-a797-26ab60d2f0b3` |
| 5 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-a5e4f3ae-b4e0-462a-a4aa-f8c31a0f17e4` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-f4c744d0-6987-481d-843a-843c4ece5523` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-124ef64b-37e2-46a1-a0a7-cf2ffabf6e76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-124ef64b-37e2-46a1-a0a7-cf2ffabf6e76
Content-Type: application/json

--- request body ---
{"handle":"qa-1f1fa0ee1d6c","displayName":"QA 1f1fa0ee1d6c","password":"****","region":"eu"}

--- response: 201 in 310 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-124ef64b-37e2-46a1-a0a7-cf2ffabf6e76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-1f1fa0ee1d6c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a0a45f43-f332-4ed1-839c-0b7bd16bad58","handle":"qa-1f1fa0ee1d6c","displayName":"QA 1f1fa0ee1d6c","region":"eu","role":"user","createdAt":"2026-10-31T08:31:29.505641305Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-39cda4d7-b768-4c31-93e0-1e45f15fbea6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39cda4d7-b768-4c31-93e0-1e45f15fbea6
Content-Type: application/json

--- request body ---
{"handle":"qa-1f1fa0ee1d6c","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/json
X-Correlation-Id: qa-39cda4d7-b768-4c31-93e0-1e45f15fbea6
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a0a45f43-f332-4ed1-839c-0b7bd16bad58"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f179c6ed-1e6e-411d-b1de-28d1111b3e8d

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b5a03e71-90ba-498a-bbc2-d82b184638ab
X-Correlation-Id: qa-f179c6ed-1e6e-411d-b1de-28d1111b3e8d
Content-Type: application/json

--- response: 503 in 69 ms ---
Date: Sat, 31 Oct 2026 08:31:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f179c6ed-1e6e-411d-b1de-28d1111b3e8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-f179c6ed-1e6e-411d-b1de-28d1111b3e8d"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-a7857de5-6588-473e-a797-26ab60d2f0b3

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: b5a03e71-90ba-498a-bbc2-d82b184638ab
X-Correlation-Id: qa-a7857de5-6588-473e-a797-26ab60d2f0b3
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7857de5-6588-473e-a797-26ab60d2f0b3
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

{"id":"acc_a0a45f43-f332-4ed1-839c-0b7bd16bad58","handle":"qa-1f1fa0ee1d6c","displayName":"QA 1f1fa0ee1d6c","region":"eu","role":"user","createdAt":"2026-10-31T08:31:29.505641305Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5e4f3ae-b4e0-462a-a4aa-f8c31a0f17e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5e4f3ae-b4e0-462a-a4aa-f8c31a0f17e4
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 31 Oct 2026 08:31:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5e4f3ae-b4e0-462a-a4aa-f8c31a0f17e4
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
correlation: qa-f4c744d0-6987-481d-843a-843c4ece5523

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4c744d0-6987-481d-843a-843c4ece5523
Content-Type: application/json

--- request body ---
{"handle":"qa-1f1fa0ee1d6c","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 31 Oct 2026 08:31:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f4c744d0-6987-481d-843a-843c4ece5523
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f4c744d0-6987-481d-843a-843c4ece5523"}
```
