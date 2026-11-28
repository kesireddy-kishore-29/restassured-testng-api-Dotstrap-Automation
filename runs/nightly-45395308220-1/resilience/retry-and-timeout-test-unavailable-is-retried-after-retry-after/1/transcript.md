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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-57202f52-4505-4092-89ba-f1c16a2da5e0` |
| 2 | `POST /v1/auth/token` | 200 | 9 | `qa-d1c52ba9-a47a-4675-bb59-3e40a9e839bd` |
| 3 | `GET /v1/accounts/me` | 503 | 12 | `qa-c4ac03a9-3eea-4670-87d6-e651ed3d8402` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-b2725488-b3d8-40ea-b1d4-dbb1defb74e8` |
| 5 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-f7670cc5-9c12-4232-b648-7c328c5802d8` |
| 6 | `POST /v1/auth/token` | 401 | 11 | `qa-0c335b0d-8c42-473c-b5aa-95a00f45fe0d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-57202f52-4505-4092-89ba-f1c16a2da5e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57202f52-4505-4092-89ba-f1c16a2da5e0
Content-Type: application/json

--- request body ---
{"handle":"qa-31e8877dae8f","displayName":"QA 31e8877dae8f","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-57202f52-4505-4092-89ba-f1c16a2da5e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 10
Location: /v1/accounts/qa-31e8877dae8f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f694288-82d7-4aab-8bb4-53d6fedd533a","handle":"qa-31e8877dae8f","displayName":"QA 31e8877dae8f","region":"eu","role":"user","createdAt":"2026-11-24T12:37:59.636528664Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d1c52ba9-a47a-4675-bb59-3e40a9e839bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1c52ba9-a47a-4675-bb59-3e40a9e839bd
Content-Type: application/json

--- request body ---
{"handle":"qa-31e8877dae8f","password":"****"}

--- response: 200 in 9 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-d1c52ba9-a47a-4675-bb59-3e40a9e839bd
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f694288-82d7-4aab-8bb4-53d6fedd533a"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4ac03a9-3eea-4670-87d6-e651ed3d8402

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bc8b5b5a-ec3e-41ca-9276-c6ca5bf20a29
X-Correlation-Id: qa-c4ac03a9-3eea-4670-87d6-e651ed3d8402
Content-Type: application/json

--- response: 503 in 12 ms ---
Date: Tue, 24 Nov 2026 12:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4ac03a9-3eea-4670-87d6-e651ed3d8402
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 259

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/accounts/me","correlationId":"qa-c4ac03a9-3eea-4670-87d6-e651ed3d8402"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2725488-b3d8-40ea-b1d4-dbb1defb74e8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: bc8b5b5a-ec3e-41ca-9276-c6ca5bf20a29
X-Correlation-Id: qa-b2725488-b3d8-40ea-b1d4-dbb1defb74e8
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2725488-b3d8-40ea-b1d4-dbb1defb74e8
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

{"id":"acc_7f694288-82d7-4aab-8bb4-53d6fedd533a","handle":"qa-31e8877dae8f","displayName":"QA 31e8877dae8f","region":"eu","role":"user","createdAt":"2026-11-24T12:37:59.636528664Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f7670cc5-9c12-4232-b648-7c328c5802d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7670cc5-9c12-4232-b648-7c328c5802d8
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f7670cc5-9c12-4232-b648-7c328c5802d8
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
correlation: qa-0c335b0d-8c42-473c-b5aa-95a00f45fe0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c335b0d-8c42-473c-b5aa-95a00f45fe0d
Content-Type: application/json

--- request body ---
{"handle":"qa-31e8877dae8f","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 24 Nov 2026 12:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c335b0d-8c42-473c-b5aa-95a00f45fe0d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c335b0d-8c42-473c-b5aa-95a00f45fe0d"}
```
