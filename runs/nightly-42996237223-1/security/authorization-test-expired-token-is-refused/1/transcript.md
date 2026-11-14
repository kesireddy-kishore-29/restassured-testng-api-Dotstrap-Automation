# Transcript: A token stops working when it expires

| | |
|---|---|
| Test | `com.qaautomation.tests.security.AuthorizationTest#expiredTokenIsRefused` |
| Features | FEAT-SEC-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 447 | `qa-fc4b6590-406e-4a5d-967e-b8a9c0993e21` |
| 2 | `POST /v1/auth/token` | 200 | 59 | `qa-7f79e53d-4164-4792-a769-f992cada7375` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-5b6a1a8a-708f-4ffa-95a6-39534d3bd939` |
| 4 | `GET /v1/accounts/me` | 200 | 18 | `qa-5d767211-93fc-4629-8eae-735ad6072eee` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-505b65ca-e299-4187-b421-c2bfb3ad9991` |
| 6 | `GET /v1/accounts/me` | 401 | 12 | `qa-5a7dc0ac-90f6-4588-b9fd-cd87ec034d12` |
| 7 | `GET /v1/accounts/me` | 401 | 21 | `qa-5dfd2c36-17ff-4b1f-9b73-6f283ff87207` |
| 8 | `POST /v1/auth/token` | 200 | 13 | `qa-ff396dfd-ce57-42dd-93ec-a863bf3d35ea` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-993e5052-1571-46ef-b737-b5f8afce28e1` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-f2fd27fb-6123-45bc-9282-2f0d4f417053` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fc4b6590-406e-4a5d-967e-b8a9c0993e21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc4b6590-406e-4a5d-967e-b8a9c0993e21
Content-Type: application/json

--- request body ---
{"handle":"qa-7eb73d2c9925","displayName":"QA 7eb73d2c9925","password":"****","region":"eu"}

--- response: 201 in 447 ms ---
Date: Wed, 11 Nov 2026 09:34:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc4b6590-406e-4a5d-967e-b8a9c0993e21
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-7eb73d2c9925
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e2914ce-8551-4153-9de6-d58aea3d5a80","handle":"qa-7eb73d2c9925","displayName":"QA 7eb73d2c9925","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.562386356Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-7f79e53d-4164-4792-a769-f992cada7375

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f79e53d-4164-4792-a769-f992cada7375
Content-Type: application/json

--- request body ---
{"handle":"qa-7eb73d2c9925","password":"****","ttlSeconds":1}

--- response: 200 in 59 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f79e53d-4164-4792-a769-f992cada7375
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_3e2914ce-8551-4153-9de6-d58aea3d5a80"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-5b6a1a8a-708f-4ffa-95a6-39534d3bd939

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b6a1a8a-708f-4ffa-95a6-39534d3bd939
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b6a1a8a-708f-4ffa-95a6-39534d3bd939
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

{"id":"acc_3e2914ce-8551-4153-9de6-d58aea3d5a80","handle":"qa-7eb73d2c9925","displayName":"QA 7eb73d2c9925","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.562386356Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d767211-93fc-4629-8eae-735ad6072eee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d767211-93fc-4629-8eae-735ad6072eee
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d767211-93fc-4629-8eae-735ad6072eee
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
Content-Length: 181

{"id":"acc_3e2914ce-8551-4153-9de6-d58aea3d5a80","handle":"qa-7eb73d2c9925","displayName":"QA 7eb73d2c9925","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.562386356Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-505b65ca-e299-4187-b421-c2bfb3ad9991

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-505b65ca-e299-4187-b421-c2bfb3ad9991
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-505b65ca-e299-4187-b421-c2bfb3ad9991
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_3e2914ce-8551-4153-9de6-d58aea3d5a80","handle":"qa-7eb73d2c9925","displayName":"QA 7eb73d2c9925","region":"eu","role":"user","createdAt":"2026-11-11T09:34:33.562386356Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a7dc0ac-90f6-4588-b9fd-cd87ec034d12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a7dc0ac-90f6-4588-b9fd-cd87ec034d12
Content-Type: application/json

--- response: 401 in 12 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5a7dc0ac-90f6-4588-b9fd-cd87ec034d12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-5a7dc0ac-90f6-4588-b9fd-cd87ec034d12"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-5dfd2c36-17ff-4b1f-9b73-6f283ff87207

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dfd2c36-17ff-4b1f-9b73-6f283ff87207
Content-Type: application/json

--- response: 401 in 21 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5dfd2c36-17ff-4b1f-9b73-6f283ff87207
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
WWW-Authenticate: Bearer error="invalid_token"
Content-Length: 223

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-5dfd2c36-17ff-4b1f-9b73-6f283ff87207"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-ff396dfd-ce57-42dd-93ec-a863bf3d35ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff396dfd-ce57-42dd-93ec-a863bf3d35ea
Content-Type: application/json

--- request body ---
{"handle":"qa-7eb73d2c9925","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff396dfd-ce57-42dd-93ec-a863bf3d35ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_3e2914ce-8551-4153-9de6-d58aea3d5a80"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-993e5052-1571-46ef-b737-b5f8afce28e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-993e5052-1571-46ef-b737-b5f8afce28e1
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-993e5052-1571-46ef-b737-b5f8afce28e1
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-f2fd27fb-6123-45bc-9282-2f0d4f417053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2fd27fb-6123-45bc-9282-2f0d4f417053
Content-Type: application/json

--- request body ---
{"handle":"qa-7eb73d2c9925","password":"****"}

--- response: 401 in 5 ms ---
Date: Wed, 11 Nov 2026 09:34:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f2fd27fb-6123-45bc-9282-2f0d4f417053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f2fd27fb-6123-45bc-9282-2f0d4f417053"}
```
