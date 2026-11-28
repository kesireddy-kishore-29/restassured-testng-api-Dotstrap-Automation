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
| 1 | `POST /v1/accounts` | 201 | 14 | `qa-6244dcf1-db1d-4900-9d33-8b366907ac69` |
| 2 | `POST /v1/auth/token` | 200 | 16 | `qa-050acc94-43dc-447d-ad04-74e2d968a8d6` |
| 3 | `GET /v1/accounts/me` | 503 | 10 | `qa-ee73eaff-974f-4ca9-89df-1895a23255e3` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-0f8072db-b3a1-4df2-b87e-cf624f09771c` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-643234b4-6863-4cf3-a0fe-62ae5a6e7aba` |
| 6 | `POST /v1/auth/token` | 401 | 9 | `qa-10042de9-3e34-4bc3-9ef4-c842b116ab1a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6244dcf1-db1d-4900-9d33-8b366907ac69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6244dcf1-db1d-4900-9d33-8b366907ac69
Content-Type: application/json

--- request body ---
{"handle":"qa-adaf5141b83a","displayName":"QA adaf5141b83a","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-6244dcf1-db1d-4900-9d33-8b366907ac69
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Location: /v1/accounts/qa-adaf5141b83a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c488a5dc-d3b7-469f-aa69-b71b5190bc7b","handle":"qa-adaf5141b83a","displayName":"QA adaf5141b83a","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.983416129Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-050acc94-43dc-447d-ad04-74e2d968a8d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-050acc94-43dc-447d-ad04-74e2d968a8d6
Content-Type: application/json

--- request body ---
{"handle":"qa-adaf5141b83a","password":"****"}

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-050acc94-43dc-447d-ad04-74e2d968a8d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c488a5dc-d3b7-469f-aa69-b71b5190bc7b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee73eaff-974f-4ca9-89df-1895a23255e3

--- request headers ---
Accept: application/json
X-Fault-Key: 01df3248-aba2-4d20-9293-652e0ae88dbf
X-Fault: unavailable-once
X-Correlation-Id: qa-ee73eaff-974f-4ca9-89df-1895a23255e3
Content-Type: application/json

--- response: 503 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee73eaff-974f-4ca9-89df-1895a23255e3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-ee73eaff-974f-4ca9-89df-1895a23255e3"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f8072db-b3a1-4df2-b87e-cf624f09771c

--- request headers ---
Accept: application/json
X-Fault-Key: 01df3248-aba2-4d20-9293-652e0ae88dbf
X-Fault: unavailable-once
X-Correlation-Id: qa-0f8072db-b3a1-4df2-b87e-cf624f09771c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f8072db-b3a1-4df2-b87e-cf624f09771c
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

{"id":"acc_c488a5dc-d3b7-469f-aa69-b71b5190bc7b","handle":"qa-adaf5141b83a","displayName":"QA adaf5141b83a","region":"eu","role":"user","createdAt":"2026-11-27T10:59:48.983416129Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-643234b4-6863-4cf3-a0fe-62ae5a6e7aba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-643234b4-6863-4cf3-a0fe-62ae5a6e7aba
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: text/plain
X-Correlation-Id: qa-643234b4-6863-4cf3-a0fe-62ae5a6e7aba
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
correlation: qa-10042de9-3e34-4bc3-9ef4-c842b116ab1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10042de9-3e34-4bc3-9ef4-c842b116ab1a
Content-Type: application/json

--- request body ---
{"handle":"qa-adaf5141b83a","password":"****"}

--- response: 401 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10042de9-3e34-4bc3-9ef4-c842b116ab1a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10042de9-3e34-4bc3-9ef4-c842b116ab1a"}
```
