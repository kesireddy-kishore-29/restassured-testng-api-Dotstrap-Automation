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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-db2d4804-5b97-4c8f-a8f9-f3a520b1322e` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-86841686-bfac-4735-9aa5-5dbbe080b2c1` |
| 3 | `GET /v1/accounts/me` | 503 | 19 | `qa-f3c41ca7-2216-420b-adc1-24e8513ea5c0` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-ac11c9e7-e1ba-470c-8633-77c474ad6a31` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-9de1c25e-af72-40f7-9452-57dc87eef1fa` |
| 6 | `POST /v1/auth/token` | 401 | 7 | `qa-9be10340-f52b-4f6f-aa35-89b72d0e46fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-db2d4804-5b97-4c8f-a8f9-f3a520b1322e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db2d4804-5b97-4c8f-a8f9-f3a520b1322e
Content-Type: application/json

--- request body ---
{"handle":"qa-62a00c7772e6","displayName":"QA 62a00c7772e6","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-db2d4804-5b97-4c8f-a8f9-f3a520b1322e
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
Location: /v1/accounts/qa-62a00c7772e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_341489c1-d9d6-48ec-bc76-2e005988cf38","handle":"qa-62a00c7772e6","displayName":"QA 62a00c7772e6","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.358080837Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-86841686-bfac-4735-9aa5-5dbbe080b2c1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86841686-bfac-4735-9aa5-5dbbe080b2c1
Content-Type: application/json

--- request body ---
{"handle":"qa-62a00c7772e6","password":"****"}

--- response: 200 in 37 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/json
X-Correlation-Id: qa-86841686-bfac-4735-9aa5-5dbbe080b2c1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_341489c1-d9d6-48ec-bc76-2e005988cf38"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f3c41ca7-2216-420b-adc1-24e8513ea5c0

--- request headers ---
Accept: application/json
X-Fault-Key: e684d483-46ab-4094-ab8c-e6b790027371
X-Fault: unavailable-once
X-Correlation-Id: qa-f3c41ca7-2216-420b-adc1-24e8513ea5c0
Content-Type: application/json

--- response: 503 in 19 ms ---
Date: Tue, 17 Nov 2026 10:50:18 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f3c41ca7-2216-420b-adc1-24e8513ea5c0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-f3c41ca7-2216-420b-adc1-24e8513ea5c0"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac11c9e7-e1ba-470c-8633-77c474ad6a31

--- request headers ---
Accept: application/json
X-Fault-Key: e684d483-46ab-4094-ab8c-e6b790027371
X-Fault: unavailable-once
X-Correlation-Id: qa-ac11c9e7-e1ba-470c-8633-77c474ad6a31
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac11c9e7-e1ba-470c-8633-77c474ad6a31
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

{"id":"acc_341489c1-d9d6-48ec-bc76-2e005988cf38","handle":"qa-62a00c7772e6","displayName":"QA 62a00c7772e6","region":"eu","role":"user","createdAt":"2026-11-17T10:50:18.358080837Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9de1c25e-af72-40f7-9452-57dc87eef1fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9de1c25e-af72-40f7-9452-57dc87eef1fa
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9de1c25e-af72-40f7-9452-57dc87eef1fa
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
correlation: qa-9be10340-f52b-4f6f-aa35-89b72d0e46fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9be10340-f52b-4f6f-aa35-89b72d0e46fc
Content-Type: application/json

--- request body ---
{"handle":"qa-62a00c7772e6","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 17 Nov 2026 10:50:19 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9be10340-f52b-4f6f-aa35-89b72d0e46fc
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9be10340-f52b-4f6f-aa35-89b72d0e46fc"}
```
