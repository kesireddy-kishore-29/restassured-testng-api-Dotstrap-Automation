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
| 1 | `POST /v1/accounts` | 201 | 471 | `qa-bca2b976-e5a2-42bb-a40a-56507d58f8c2` |
| 2 | `POST /v1/auth/token` | 200 | 72 | `qa-bab361ca-2a8c-4f85-8921-7add43717ea8` |
| 3 | `GET /v1/accounts/me` | 200 | 67 | `qa-d440e7a9-1313-461b-b749-407213042a8d` |
| 4 | `DELETE /v1/accounts/me` | 204 | 29 | `qa-c3a8e578-2daa-4dfd-a29a-eadd44a860cb` |
| 5 | `POST /v1/auth/token` | 401 | 26 | `qa-dc4a2818-9981-43bb-9a97-09b6eb9cd40f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bca2b976-e5a2-42bb-a40a-56507d58f8c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bca2b976-e5a2-42bb-a40a-56507d58f8c2
Content-Type: application/json

--- request body ---
{"handle":"qa-205520ae879e","displayName":"QA 205520ae879e","password":"****","region":"us"}

--- response: 201 in 471 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bca2b976-e5a2-42bb-a40a-56507d58f8c2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 11
Location: /v1/accounts/qa-205520ae879e
X-Served-Region: us
Content-Length: 181

{"id":"acc_47892d74-1510-4391-9006-ecca7a172042","handle":"qa-205520ae879e","displayName":"QA 205520ae879e","region":"us","role":"user","createdAt":"2026-11-25T11:27:53.284053465Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bab361ca-2a8c-4f85-8921-7add43717ea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bab361ca-2a8c-4f85-8921-7add43717ea8
Content-Type: application/json

--- request body ---
{"handle":"qa-205520ae879e","password":"****"}

--- response: 200 in 72 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-bab361ca-2a8c-4f85-8921-7add43717ea8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47892d74-1510-4391-9006-ecca7a172042"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-d440e7a9-1313-461b-b749-407213042a8d

--- request headers ---
Accept: application/json
X-Edge-Region: in
X-Correlation-Id: qa-d440e7a9-1313-461b-b749-407213042a8d
Content-Type: application/json

--- response: 200 in 67 ms ---
Date: Wed, 25 Nov 2026 11:27:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-d440e7a9-1313-461b-b749-407213042a8d
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

{"id":"acc_47892d74-1510-4391-9006-ecca7a172042","handle":"qa-205520ae879e","displayName":"QA 205520ae879e","region":"us","role":"user","createdAt":"2026-11-25T11:27:53.284053465Z"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c3a8e578-2daa-4dfd-a29a-eadd44a860cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3a8e578-2daa-4dfd-a29a-eadd44a860cb
Content-Type: application/json

--- response: 204 in 29 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c3a8e578-2daa-4dfd-a29a-eadd44a860cb
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
correlation: qa-dc4a2818-9981-43bb-9a97-09b6eb9cd40f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc4a2818-9981-43bb-9a97-09b6eb9cd40f
Content-Type: application/json

--- request body ---
{"handle":"qa-205520ae879e","password":"****"}

--- response: 401 in 26 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dc4a2818-9981-43bb-9a97-09b6eb9cd40f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dc4a2818-9981-43bb-9a97-09b6eb9cd40f"}
```
