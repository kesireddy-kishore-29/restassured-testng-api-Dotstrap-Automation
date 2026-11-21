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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-2d67956f-babb-4ac2-a2b6-91e75afafa55` |
| 2 | `POST /v1/auth/token` | 200 | 23 | `qa-9e18408b-9a17-401e-9dfa-9e0eb2f48e10` |
| 3 | `GET /v1/accounts/me` | 503 | 10 | `qa-1f48c3e8-a503-4ad0-b0c7-a8ad30172b7f` |
| 4 | `GET /v1/accounts/me` | 200 | 7 | `qa-f3aff084-c2ca-418a-b0b9-273a7096d96d` |
| 5 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-55568728-7bfe-462b-8a6b-14cf8fab221b` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-60c03614-739e-4b71-aa42-e64426f17073` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2d67956f-babb-4ac2-a2b6-91e75afafa55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d67956f-babb-4ac2-a2b6-91e75afafa55
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb24e47ff51","displayName":"QA 8cb24e47ff51","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d67956f-babb-4ac2-a2b6-91e75afafa55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Location: /v1/accounts/qa-8cb24e47ff51
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9cd288c-3fae-4e09-b7b7-f32a5c4af216","handle":"qa-8cb24e47ff51","displayName":"QA 8cb24e47ff51","region":"eu","role":"user","createdAt":"2026-11-12T09:56:36.890948306Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-9e18408b-9a17-401e-9dfa-9e0eb2f48e10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e18408b-9a17-401e-9dfa-9e0eb2f48e10
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb24e47ff51","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e18408b-9a17-401e-9dfa-9e0eb2f48e10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9cd288c-3fae-4e09-b7b7-f32a5c4af216"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f48c3e8-a503-4ad0-b0c7-a8ad30172b7f

--- request headers ---
Accept: application/json
X-Fault-Key: c818f521-2185-47a1-8742-bdf6197eaee5
X-Fault: unavailable-once
X-Correlation-Id: qa-1f48c3e8-a503-4ad0-b0c7-a8ad30172b7f
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Thu, 12 Nov 2026 09:56:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f48c3e8-a503-4ad0-b0c7-a8ad30172b7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-1f48c3e8-a503-4ad0-b0c7-a8ad30172b7f"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3aff084-c2ca-418a-b0b9-273a7096d96d

--- request headers ---
Accept: application/json
X-Fault-Key: c818f521-2185-47a1-8742-bdf6197eaee5
X-Fault: unavailable-once
X-Correlation-Id: qa-f3aff084-c2ca-418a-b0b9-273a7096d96d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3aff084-c2ca-418a-b0b9-273a7096d96d
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

{"id":"acc_e9cd288c-3fae-4e09-b7b7-f32a5c4af216","handle":"qa-8cb24e47ff51","displayName":"QA 8cb24e47ff51","region":"eu","role":"user","createdAt":"2026-11-12T09:56:36.890948306Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-55568728-7bfe-462b-8a6b-14cf8fab221b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55568728-7bfe-462b-8a6b-14cf8fab221b
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: text/plain
X-Correlation-Id: qa-55568728-7bfe-462b-8a6b-14cf8fab221b
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
correlation: qa-60c03614-739e-4b71-aa42-e64426f17073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60c03614-739e-4b71-aa42-e64426f17073
Content-Type: application/json

--- request body ---
{"handle":"qa-8cb24e47ff51","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 12 Nov 2026 09:56:38 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60c03614-739e-4b71-aa42-e64426f17073
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-60c03614-739e-4b71-aa42-e64426f17073"}
```
