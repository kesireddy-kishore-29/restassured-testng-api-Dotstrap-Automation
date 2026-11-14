# Transcript: A slow server cannot hang the client

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.RetryAndTimeoutTest#clientTimeoutIsEnforcedWithinItsBudget` |
| Features | FEAT-RES-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 315 | `qa-aaa26aaf-69de-439e-be5f-ac46f17dcffb` |
| 2 | `POST /v1/auth/token` | 200 | 20 | `qa-59fc1e11-49d1-4c48-a590-8092a9835491` |
| 3 | `GET /v1/accounts/me` | error | 808 | `qa-9a03ee35-fc16-4d8e-a0f2-4c2283a7f13f` |
| 4 | `GET /v1/accounts/me` | error | 809 | `qa-66765b49-710a-43a6-8868-fc6c93711829` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-12620aa9-6e82-4db7-b2fb-87ea51ee66ce` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-68ac83a3-0758-4de8-844e-a95592db7997` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aaa26aaf-69de-439e-be5f-ac46f17dcffb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaa26aaf-69de-439e-be5f-ac46f17dcffb
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0960273a01","displayName":"QA 0f0960273a01","password":"****","region":"eu"}

--- response: 201 in 315 ms ---
Date: Thu, 05 Nov 2026 09:37:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-aaa26aaf-69de-439e-be5f-ac46f17dcffb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-0f0960273a01
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d0c4e3f-8b31-4165-ab0b-deba9d8d5320","handle":"qa-0f0960273a01","displayName":"QA 0f0960273a01","region":"eu","role":"user","createdAt":"2026-11-05T09:37:42.751435266Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-59fc1e11-49d1-4c48-a590-8092a9835491

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59fc1e11-49d1-4c48-a590-8092a9835491
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0960273a01","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-59fc1e11-49d1-4c48-a590-8092a9835491
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 587
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d0c4e3f-8b31-4165-ab0b-deba9d8d5320"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a03ee35-fc16-4d8e-a0f2-4c2283a7f13f

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: f8426c8c-2b13-47c8-8697-bb351f2ccc2e
X-Correlation-Id: qa-9a03ee35-fc16-4d8e-a0f2-4c2283a7f13f
Content-Type: application/json

--- response: none in 808 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-66765b49-710a-43a6-8868-fc6c93711829

--- request headers ---
Accept: application/json
X-Fault: latency=4000
X-Fault-Key: f8426c8c-2b13-47c8-8697-bb351f2ccc2e
X-Correlation-Id: qa-66765b49-710a-43a6-8868-fc6c93711829
Content-Type: application/json

--- response: none in 809 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-12620aa9-6e82-4db7-b2fb-87ea51ee66ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12620aa9-6e82-4db7-b2fb-87ea51ee66ce
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: text/plain
X-Correlation-Id: qa-12620aa9-6e82-4db7-b2fb-87ea51ee66ce
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

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-68ac83a3-0758-4de8-844e-a95592db7997

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68ac83a3-0758-4de8-844e-a95592db7997
Content-Type: application/json

--- request body ---
{"handle":"qa-0f0960273a01","password":"****"}

--- response: 401 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-68ac83a3-0758-4de8-844e-a95592db7997
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-68ac83a3-0758-4de8-844e-a95592db7997"}
```
