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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-b7c9af33-0b23-41a3-81d9-5b9659ea320c` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-f5a459b6-ab4b-4375-a071-8c49e1dff3df` |
| 3 | `GET /v1/accounts/me` | 503 | 12 | `qa-d764fdfe-82c0-4d09-956d-927941f49afd` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-1e8d8e80-6781-49e5-93c5-9ada735439d1` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-0135b453-bab1-4324-b632-0d52056929f0` |
| 6 | `POST /v1/auth/token` | 401 | 6 | `qa-f0417a25-f025-4de2-9aba-cf74bca8b4a3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7c9af33-0b23-41a3-81d9-5b9659ea320c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7c9af33-0b23-41a3-81d9-5b9659ea320c
Content-Type: application/json

--- request body ---
{"handle":"qa-802e6f52af58","displayName":"QA 802e6f52af58","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7c9af33-0b23-41a3-81d9-5b9659ea320c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-802e6f52af58
X-Served-Region: eu
Content-Length: 181

{"id":"acc_418546d8-6d7e-43aa-9415-f11786640668","handle":"qa-802e6f52af58","displayName":"QA 802e6f52af58","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.823418125Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f5a459b6-ab4b-4375-a071-8c49e1dff3df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5a459b6-ab4b-4375-a071-8c49e1dff3df
Content-Type: application/json

--- request body ---
{"handle":"qa-802e6f52af58","password":"****"}

--- response: 200 in 29 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5a459b6-ab4b-4375-a071-8c49e1dff3df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_418546d8-6d7e-43aa-9415-f11786640668"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d764fdfe-82c0-4d09-956d-927941f49afd

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0cb50620-b2e4-4fb1-89a5-a5e34166e89e
X-Correlation-Id: qa-d764fdfe-82c0-4d09-956d-927941f49afd
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d764fdfe-82c0-4d09-956d-927941f49afd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-d764fdfe-82c0-4d09-956d-927941f49afd"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e8d8e80-6781-49e5-93c5-9ada735439d1

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 0cb50620-b2e4-4fb1-89a5-a5e34166e89e
X-Correlation-Id: qa-1e8d8e80-6781-49e5-93c5-9ada735439d1
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e8d8e80-6781-49e5-93c5-9ada735439d1
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

{"id":"acc_418546d8-6d7e-43aa-9415-f11786640668","handle":"qa-802e6f52af58","displayName":"QA 802e6f52af58","region":"eu","role":"user","createdAt":"2026-11-23T10:55:02.823418125Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0135b453-bab1-4324-b632-0d52056929f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0135b453-bab1-4324-b632-0d52056929f0
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0135b453-bab1-4324-b632-0d52056929f0
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
correlation: qa-f0417a25-f025-4de2-9aba-cf74bca8b4a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f0417a25-f025-4de2-9aba-cf74bca8b4a3
Content-Type: application/json

--- request body ---
{"handle":"qa-802e6f52af58","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 23 Nov 2026 10:55:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f0417a25-f025-4de2-9aba-cf74bca8b4a3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f0417a25-f025-4de2-9aba-cf74bca8b4a3"}
```
