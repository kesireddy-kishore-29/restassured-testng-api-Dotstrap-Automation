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
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-ea5a0c18-49eb-4ef5-ad2d-ddf97005bd21` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-4ee6bf9d-9fc6-4d6f-8045-79ff163d3a44` |
| 3 | `GET /v1/accounts/me` | 503 | 18 | `qa-fd29ee34-7758-4c40-9cc4-f3678db6a450` |
| 4 | `GET /v1/accounts/me` | 200 | 10 | `qa-90fbdcf7-b017-4517-aa37-9eda8f6d9135` |
| 5 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-7a12d033-645e-4fe4-9e92-30f3c231cfd1` |
| 6 | `POST /v1/auth/token` | 401 | 19 | `qa-f2fc55ef-18ae-4c6b-ab89-67ce1e417b06` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ea5a0c18-49eb-4ef5-ad2d-ddf97005bd21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ea5a0c18-49eb-4ef5-ad2d-ddf97005bd21
Content-Type: application/json

--- request body ---
{"handle":"qa-b36c60798092","displayName":"QA b36c60798092","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ea5a0c18-49eb-4ef5-ad2d-ddf97005bd21
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
Location: /v1/accounts/qa-b36c60798092
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02a4b6f6-df8f-4d66-a77e-2d8b58debcd2","handle":"qa-b36c60798092","displayName":"QA b36c60798092","region":"eu","role":"user","createdAt":"2026-11-22T09:54:54.176655656Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4ee6bf9d-9fc6-4d6f-8045-79ff163d3a44

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4ee6bf9d-9fc6-4d6f-8045-79ff163d3a44
Content-Type: application/json

--- request body ---
{"handle":"qa-b36c60798092","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-4ee6bf9d-9fc6-4d6f-8045-79ff163d3a44
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02a4b6f6-df8f-4d66-a77e-2d8b58debcd2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd29ee34-7758-4c40-9cc4-f3678db6a450

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6cf3c548-3a96-4a71-84e0-c461d4f9eff5
X-Correlation-Id: qa-fd29ee34-7758-4c40-9cc4-f3678db6a450
Content-Type: application/json

--- response: 503 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-fd29ee34-7758-4c40-9cc4-f3678db6a450
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-fd29ee34-7758-4c40-9cc4-f3678db6a450"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-90fbdcf7-b017-4517-aa37-9eda8f6d9135

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: 6cf3c548-3a96-4a71-84e0-c461d4f9eff5
X-Correlation-Id: qa-90fbdcf7-b017-4517-aa37-9eda8f6d9135
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-90fbdcf7-b017-4517-aa37-9eda8f6d9135
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

{"id":"acc_02a4b6f6-df8f-4d66-a77e-2d8b58debcd2","handle":"qa-b36c60798092","displayName":"QA b36c60798092","region":"eu","role":"user","createdAt":"2026-11-22T09:54:54.176655656Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7a12d033-645e-4fe4-9e92-30f3c231cfd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a12d033-645e-4fe4-9e92-30f3c231cfd1
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7a12d033-645e-4fe4-9e92-30f3c231cfd1
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
correlation: qa-f2fc55ef-18ae-4c6b-ab89-67ce1e417b06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2fc55ef-18ae-4c6b-ab89-67ce1e417b06
Content-Type: application/json

--- request body ---
{"handle":"qa-b36c60798092","password":"****"}

--- response: 401 in 19 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2fc55ef-18ae-4c6b-ab89-67ce1e417b06
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2fc55ef-18ae-4c6b-ab89-67ce1e417b06"}
```
