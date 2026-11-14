# Transcript: Requests are served by the home region, whichever edge they arrive at [US, in]

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#servedByTheHomeRegionFromAnyEdge[2]` |
| Features | FEAT-REGION-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-269334c5-5efe-48e1-8340-b84fc60b5310` |
| 2 | `POST /v1/auth/token` | 200 | 10 | `qa-ed594546-e091-4e4c-a29b-93b37a1aafb4` |
| 3 | `GET /v1/accounts/me` | 200 | 14 | `qa-ce8f1386-7578-4738-852d-f8c99f70171e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-99ed6789-6842-467b-a4ec-e52a4af1cdc1` |
| 5 | `POST /v1/auth/token` | 401 | 8 | `qa-7ed6afd0-16f3-48b2-bbbf-895cd3069883` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-269334c5-5efe-48e1-8340-b84fc60b5310

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-269334c5-5efe-48e1-8340-b84fc60b5310
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d227cc3b55","displayName":"QA c4d227cc3b55","password":"****","region":"us"}

--- response: 201 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-269334c5-5efe-48e1-8340-b84fc60b5310
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Location: /v1/accounts/qa-c4d227cc3b55
X-Served-Region: us
Content-Length: 181

{"id":"acc_2c4eedec-c432-496a-bc5d-231672c0f6b6","handle":"qa-c4d227cc3b55","displayName":"QA c4d227cc3b55","region":"us","role":"user","createdAt":"2026-11-08T09:09:10.457381801Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ed594546-e091-4e4c-a29b-93b37a1aafb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed594546-e091-4e4c-a29b-93b37a1aafb4
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d227cc3b55","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed594546-e091-4e4c-a29b-93b37a1aafb4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2c4eedec-c432-496a-bc5d-231672c0f6b6"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce8f1386-7578-4738-852d-f8c99f70171e

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-ce8f1386-7578-4738-852d-f8c99f70171e
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce8f1386-7578-4738-852d-f8c99f70171e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
X-Edge-Region: in
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Content-Length: 181

{"id":"acc_2c4eedec-c432-496a-bc5d-231672c0f6b6","handle":"qa-c4d227cc3b55","displayName":"QA c4d227cc3b55","region":"us","role":"user","createdAt":"2026-11-08T09:09:10.457381801Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-99ed6789-6842-467b-a4ec-e52a4af1cdc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99ed6789-6842-467b-a4ec-e52a4af1cdc1
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-99ed6789-6842-467b-a4ec-e52a4af1cdc1
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
X-Served-Region: us
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-7ed6afd0-16f3-48b2-bbbf-895cd3069883

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ed6afd0-16f3-48b2-bbbf-895cd3069883
Content-Type: application/json

--- request body ---
{"handle":"qa-c4d227cc3b55","password":"****"}

--- response: 401 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7ed6afd0-16f3-48b2-bbbf-895cd3069883
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7ed6afd0-16f3-48b2-bbbf-895cd3069883"}
```
