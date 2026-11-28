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
| 1 | `POST /v1/accounts` | 201 | 370 | `qa-ef0c47c5-b5b0-44d0-8cac-4d0fef9613a5` |
| 2 | `POST /v1/auth/token` | 200 | 60 | `qa-84bcb0aa-418b-426f-b1bf-9cde9f9c5af3` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-232dc70c-7048-44de-8f9c-bb371e40e80b` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-94f8d976-55d7-4bf5-b713-c797583179dd` |
| 5 | `GET /v1/accounts/me` | 200 | 11 | `qa-21db2a34-6b18-4812-aa5f-c7c66f0a3df2` |
| 6 | `GET /v1/accounts/me` | 401 | 6 | `qa-aec5723c-a7f2-4112-82cc-fc87ecf96f4e` |
| 7 | `GET /v1/accounts/me` | 401 | 5 | `qa-089ea9bb-54a4-4df7-b8a9-e886e3b60dfd` |
| 8 | `POST /v1/auth/token` | 200 | 9 | `qa-64495598-04b7-43b1-a906-8aa85d25caab` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-f1a220ef-a291-4181-95b6-ab7a09c5e3fc` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-de420d1f-a843-456e-bc4b-b7897a368717` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ef0c47c5-b5b0-44d0-8cac-4d0fef9613a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ef0c47c5-b5b0-44d0-8cac-4d0fef9613a5
Content-Type: application/json

--- request body ---
{"handle":"qa-397fe3d21146","displayName":"QA 397fe3d21146","password":"****","region":"eu"}

--- response: 201 in 370 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-ef0c47c5-b5b0-44d0-8cac-4d0fef9613a5
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
Location: /v1/accounts/qa-397fe3d21146
X-Served-Region: eu
Content-Length: 181

{"id":"acc_cc87830a-85e4-4b8b-a038-119bcc71a850","handle":"qa-397fe3d21146","displayName":"QA 397fe3d21146","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.220696511Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-84bcb0aa-418b-426f-b1bf-9cde9f9c5af3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84bcb0aa-418b-426f-b1bf-9cde9f9c5af3
Content-Type: application/json

--- request body ---
{"handle":"qa-397fe3d21146","password":"****","ttlSeconds":1}

--- response: 200 in 60 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-84bcb0aa-418b-426f-b1bf-9cde9f9c5af3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_cc87830a-85e4-4b8b-a038-119bcc71a850"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-232dc70c-7048-44de-8f9c-bb371e40e80b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-232dc70c-7048-44de-8f9c-bb371e40e80b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Sun, 22 Nov 2026 09:54:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-232dc70c-7048-44de-8f9c-bb371e40e80b
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

{"id":"acc_cc87830a-85e4-4b8b-a038-119bcc71a850","handle":"qa-397fe3d21146","displayName":"QA 397fe3d21146","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.220696511Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-94f8d976-55d7-4bf5-b713-c797583179dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94f8d976-55d7-4bf5-b713-c797583179dd
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-94f8d976-55d7-4bf5-b713-c797583179dd
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

{"id":"acc_cc87830a-85e4-4b8b-a038-119bcc71a850","handle":"qa-397fe3d21146","displayName":"QA 397fe3d21146","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.220696511Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-21db2a34-6b18-4812-aa5f-c7c66f0a3df2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21db2a34-6b18-4812-aa5f-c7c66f0a3df2
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-21db2a34-6b18-4812-aa5f-c7c66f0a3df2
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

{"id":"acc_cc87830a-85e4-4b8b-a038-119bcc71a850","handle":"qa-397fe3d21146","displayName":"QA 397fe3d21146","region":"eu","role":"user","createdAt":"2026-11-22T09:54:55.220696511Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-aec5723c-a7f2-4112-82cc-fc87ecf96f4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aec5723c-a7f2-4112-82cc-fc87ecf96f4e
Content-Type: application/json

--- response: 401 in 6 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aec5723c-a7f2-4112-82cc-fc87ecf96f4e
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-aec5723c-a7f2-4112-82cc-fc87ecf96f4e"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-089ea9bb-54a4-4df7-b8a9-e886e3b60dfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-089ea9bb-54a4-4df7-b8a9-e886e3b60dfd
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-089ea9bb-54a4-4df7-b8a9-e886e3b60dfd
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-089ea9bb-54a4-4df7-b8a9-e886e3b60dfd"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-64495598-04b7-43b1-a906-8aa85d25caab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64495598-04b7-43b1-a906-8aa85d25caab
Content-Type: application/json

--- request body ---
{"handle":"qa-397fe3d21146","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-64495598-04b7-43b1-a906-8aa85d25caab
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_cc87830a-85e4-4b8b-a038-119bcc71a850"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1a220ef-a291-4181-95b6-ab7a09c5e3fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1a220ef-a291-4181-95b6-ab7a09c5e3fc
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1a220ef-a291-4181-95b6-ab7a09c5e3fc
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
correlation: qa-de420d1f-a843-456e-bc4b-b7897a368717

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de420d1f-a843-456e-bc4b-b7897a368717
Content-Type: application/json

--- request body ---
{"handle":"qa-397fe3d21146","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 22 Nov 2026 09:54:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de420d1f-a843-456e-bc4b-b7897a368717
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de420d1f-a843-456e-bc4b-b7897a368717"}
```
