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
| 1 | `POST /v1/accounts` | 201 | 8 | `qa-aeb7de6a-4667-47fc-9093-b10b64110072` |
| 2 | `POST /v1/auth/token` | 200 | 7 | `qa-5d4a66b0-b492-47bc-83a1-7043d9217c6d` |
| 3 | `GET /v1/accounts/me` | error | 803 | `qa-2caf10b8-e06b-42d6-9368-7a803370140b` |
| 4 | `GET /v1/accounts/me` | error | 803 | `qa-e169e515-92fb-480f-88fc-ecc18498c23e` |
| 5 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-dd2f3856-11c7-46d1-a5b1-91235ebf5e54` |
| 6 | `POST /v1/auth/token` | 401 | 3 | `qa-c3f61a9e-4b7f-4d67-8524-00706ac759fe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-aeb7de6a-4667-47fc-9093-b10b64110072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeb7de6a-4667-47fc-9093-b10b64110072
Content-Type: application/json

--- request body ---
{"handle":"qa-b8d71971bfde","displayName":"QA b8d71971bfde","password":"****","region":"eu"}

--- response: 201 in 8 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-aeb7de6a-4667-47fc-9093-b10b64110072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 10
Location: /v1/accounts/qa-b8d71971bfde
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4dd2e037-fca8-4665-b5b9-fc5c7e3b08b2","handle":"qa-b8d71971bfde","displayName":"QA b8d71971bfde","region":"eu","role":"user","createdAt":"2026-11-10T09:59:28.725369437Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-5d4a66b0-b492-47bc-83a1-7043d9217c6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d4a66b0-b492-47bc-83a1-7043d9217c6d
Content-Type: application/json

--- request body ---
{"handle":"qa-b8d71971bfde","password":"****"}

--- response: 200 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d4a66b0-b492-47bc-83a1-7043d9217c6d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4dd2e037-fca8-4665-b5b9-fc5c7e3b08b2"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2caf10b8-e06b-42d6-9368-7a803370140b

--- request headers ---
Accept: application/json
X-Fault-Key: e3363d5f-cc87-4573-bc98-85eba1964331
X-Fault: latency=4000
X-Correlation-Id: qa-2caf10b8-e06b-42d6-9368-7a803370140b
Content-Type: application/json

--- response: none in 803 ms ---
error: SocketTimeoutException: Read timed out
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-e169e515-92fb-480f-88fc-ecc18498c23e

--- request headers ---
Accept: application/json
X-Fault-Key: e3363d5f-cc87-4573-bc98-85eba1964331
X-Fault: latency=4000
X-Correlation-Id: qa-e169e515-92fb-480f-88fc-ecc18498c23e
Content-Type: application/json

--- response: none in 803 ms ---
error: SocketTimeoutException: Read timed out
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dd2f3856-11c7-46d1-a5b1-91235ebf5e54

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd2f3856-11c7-46d1-a5b1-91235ebf5e54
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 10 Nov 2026 09:59:30 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dd2f3856-11c7-46d1-a5b1-91235ebf5e54
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
correlation: qa-c3f61a9e-4b7f-4d67-8524-00706ac759fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3f61a9e-4b7f-4d67-8524-00706ac759fe
Content-Type: application/json

--- request body ---
{"handle":"qa-b8d71971bfde","password":"****"}

--- response: 401 in 3 ms ---
Date: Tue, 10 Nov 2026 09:59:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c3f61a9e-4b7f-4d67-8524-00706ac759fe
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c3f61a9e-4b7f-4d67-8524-00706ac759fe"}
```
