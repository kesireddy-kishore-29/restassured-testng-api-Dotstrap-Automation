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
| 1 | `POST /v1/accounts` | 201 | 477 | `qa-c684da20-620d-47cc-8ee5-b05aadcbec91` |
| 2 | `POST /v1/auth/token` | 200 | 77 | `qa-d95cc960-11e7-447f-ad25-927abab83811` |
| 3 | `GET /v1/accounts/me` | 200 | 21 | `qa-ac927951-d638-4f31-b884-d971ab701683` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-7f1a186e-4866-4bef-9293-786c216aad49` |
| 5 | `GET /v1/accounts/me` | 200 | 10 | `qa-88373b99-c5e1-4d42-af8b-cae9062164cf` |
| 6 | `GET /v1/accounts/me` | 401 | 23 | `qa-2caf5c80-2c7f-4c6e-ab22-7f200b0b4494` |
| 7 | `GET /v1/accounts/me` | 401 | 13 | `qa-1f5b9b11-a3b4-404b-a70a-6bd18c38ff40` |
| 8 | `POST /v1/auth/token` | 200 | 11 | `qa-83fc7d8f-2ccc-425d-87ab-3102d617b1fa` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-c4e74a90-f5ad-4bf7-ba3a-e33d46f5bf1e` |
| 10 | `POST /v1/auth/token` | 401 | 14 | `qa-a0df546e-ee19-42f2-8aed-60ff3f48563b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c684da20-620d-47cc-8ee5-b05aadcbec91

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c684da20-620d-47cc-8ee5-b05aadcbec91
Content-Type: application/json

--- request body ---
{"handle":"qa-e60b22c85c50","displayName":"QA e60b22c85c50","password":"****","region":"eu"}

--- response: 201 in 477 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c684da20-620d-47cc-8ee5-b05aadcbec91
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
Location: /v1/accounts/qa-e60b22c85c50
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8050d063-8af3-485a-9462-a61ccb3e7f87","handle":"qa-e60b22c85c50","displayName":"QA e60b22c85c50","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.551854418Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d95cc960-11e7-447f-ad25-927abab83811

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d95cc960-11e7-447f-ad25-927abab83811
Content-Type: application/json

--- request body ---
{"handle":"qa-e60b22c85c50","password":"****","ttlSeconds":1}

--- response: 200 in 77 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d95cc960-11e7-447f-ad25-927abab83811
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_8050d063-8af3-485a-9462-a61ccb3e7f87"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac927951-d638-4f31-b884-d971ab701683

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac927951-d638-4f31-b884-d971ab701683
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac927951-d638-4f31-b884-d971ab701683
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

{"id":"acc_8050d063-8af3-485a-9462-a61ccb3e7f87","handle":"qa-e60b22c85c50","displayName":"QA e60b22c85c50","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.551854418Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-7f1a186e-4866-4bef-9293-786c216aad49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7f1a186e-4866-4bef-9293-786c216aad49
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7f1a186e-4866-4bef-9293-786c216aad49
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

{"id":"acc_8050d063-8af3-485a-9462-a61ccb3e7f87","handle":"qa-e60b22c85c50","displayName":"QA e60b22c85c50","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.551854418Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-88373b99-c5e1-4d42-af8b-cae9062164cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88373b99-c5e1-4d42-af8b-cae9062164cf
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sun, 15 Nov 2026 09:36:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-88373b99-c5e1-4d42-af8b-cae9062164cf
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

{"id":"acc_8050d063-8af3-485a-9462-a61ccb3e7f87","handle":"qa-e60b22c85c50","displayName":"QA e60b22c85c50","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.551854418Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-2caf5c80-2c7f-4c6e-ab22-7f200b0b4494

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2caf5c80-2c7f-4c6e-ab22-7f200b0b4494
Content-Type: application/json

--- response: 401 in 23 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2caf5c80-2c7f-4c6e-ab22-7f200b0b4494
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-2caf5c80-2c7f-4c6e-ab22-7f200b0b4494"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f5b9b11-a3b4-404b-a70a-6bd18c38ff40

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f5b9b11-a3b4-404b-a70a-6bd18c38ff40
Content-Type: application/json

--- response: 401 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f5b9b11-a3b4-404b-a70a-6bd18c38ff40
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-1f5b9b11-a3b4-404b-a70a-6bd18c38ff40"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-83fc7d8f-2ccc-425d-87ab-3102d617b1fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83fc7d8f-2ccc-425d-87ab-3102d617b1fa
Content-Type: application/json

--- request body ---
{"handle":"qa-e60b22c85c50","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-83fc7d8f-2ccc-425d-87ab-3102d617b1fa
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8050d063-8af3-485a-9462-a61ccb3e7f87"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c4e74a90-f5ad-4bf7-ba3a-e33d46f5bf1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e74a90-f5ad-4bf7-ba3a-e33d46f5bf1e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c4e74a90-f5ad-4bf7-ba3a-e33d46f5bf1e
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
correlation: qa-a0df546e-ee19-42f2-8aed-60ff3f48563b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0df546e-ee19-42f2-8aed-60ff3f48563b
Content-Type: application/json

--- request body ---
{"handle":"qa-e60b22c85c50","password":"****"}

--- response: 401 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0df546e-ee19-42f2-8aed-60ff3f48563b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0df546e-ee19-42f2-8aed-60ff3f48563b"}
```
