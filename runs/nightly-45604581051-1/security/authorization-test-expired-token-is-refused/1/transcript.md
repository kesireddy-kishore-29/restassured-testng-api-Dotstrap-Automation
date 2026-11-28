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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-2a4c58ec-8545-481c-bad5-1215a3ea4798` |
| 2 | `POST /v1/auth/token` | 200 | 32 | `qa-1d64005a-8a4d-4f0c-bb0f-f800b3e9cf8d` |
| 3 | `GET /v1/accounts/me` | 200 | 10 | `qa-ac64b86a-2506-4afa-8c82-03149a554b98` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-38ca0626-1cc9-4cdb-995e-baa7b9ee2bd3` |
| 5 | `GET /v1/accounts/me` | 200 | 22 | `qa-dc4d7848-7fe3-4b20-a378-19ff30a0beb9` |
| 6 | `GET /v1/accounts/me` | 401 | 5 | `qa-ab49cc2c-2585-47aa-b917-58c83c2a2f53` |
| 7 | `GET /v1/accounts/me` | 401 | 7 | `qa-2f581373-1bc0-4ae2-9c2b-395589b7eec8` |
| 8 | `POST /v1/auth/token` | 200 | 8 | `qa-900f87d0-bfe2-40dc-9f86-885ba0ff1cbe` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-fdd8f1cc-2069-44dd-a611-d960a3feb027` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-781e3058-e916-4de7-b6e0-c2b3a4606d49` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2a4c58ec-8545-481c-bad5-1215a3ea4798

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2a4c58ec-8545-481c-bad5-1215a3ea4798
Content-Type: application/json

--- request body ---
{"handle":"qa-8a5d60e1b303","displayName":"QA 8a5d60e1b303","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-2a4c58ec-8545-481c-bad5-1215a3ea4798
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
Location: /v1/accounts/qa-8a5d60e1b303
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6e842010-1dac-456d-bb8f-0b23d7c73b44","handle":"qa-8a5d60e1b303","displayName":"QA 8a5d60e1b303","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.507586837Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1d64005a-8a4d-4f0c-bb0f-f800b3e9cf8d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d64005a-8a4d-4f0c-bb0f-f800b3e9cf8d
Content-Type: application/json

--- request body ---
{"handle":"qa-8a5d60e1b303","password":"****","ttlSeconds":1}

--- response: 200 in 32 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d64005a-8a4d-4f0c-bb0f-f800b3e9cf8d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Content-Length: 151

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_6e842010-1dac-456d-bb8f-0b23d7c73b44"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-ac64b86a-2506-4afa-8c82-03149a554b98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac64b86a-2506-4afa-8c82-03149a554b98
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Wed, 25 Nov 2026 11:27:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac64b86a-2506-4afa-8c82-03149a554b98
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

{"id":"acc_6e842010-1dac-456d-bb8f-0b23d7c73b44","handle":"qa-8a5d60e1b303","displayName":"QA 8a5d60e1b303","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.507586837Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-38ca0626-1cc9-4cdb-995e-baa7b9ee2bd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38ca0626-1cc9-4cdb-995e-baa7b9ee2bd3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-38ca0626-1cc9-4cdb-995e-baa7b9ee2bd3
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

{"id":"acc_6e842010-1dac-456d-bb8f-0b23d7c73b44","handle":"qa-8a5d60e1b303","displayName":"QA 8a5d60e1b303","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.507586837Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc4d7848-7fe3-4b20-a378-19ff30a0beb9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc4d7848-7fe3-4b20-a378-19ff30a0beb9
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc4d7848-7fe3-4b20-a378-19ff30a0beb9
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

{"id":"acc_6e842010-1dac-456d-bb8f-0b23d7c73b44","handle":"qa-8a5d60e1b303","displayName":"QA 8a5d60e1b303","region":"eu","role":"user","createdAt":"2026-11-25T11:27:54.507586837Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab49cc2c-2585-47aa-b917-58c83c2a2f53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab49cc2c-2585-47aa-b917-58c83c2a2f53
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab49cc2c-2585-47aa-b917-58c83c2a2f53
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-ab49cc2c-2585-47aa-b917-58c83c2a2f53"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f581373-1bc0-4ae2-9c2b-395589b7eec8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f581373-1bc0-4ae2-9c2b-395589b7eec8
Content-Type: application/json

--- response: 401 in 7 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2f581373-1bc0-4ae2-9c2b-395589b7eec8
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-2f581373-1bc0-4ae2-9c2b-395589b7eec8"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-900f87d0-bfe2-40dc-9f86-885ba0ff1cbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-900f87d0-bfe2-40dc-9f86-885ba0ff1cbe
Content-Type: application/json

--- request body ---
{"handle":"qa-8a5d60e1b303","password":"****"}

--- response: 200 in 8 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-900f87d0-bfe2-40dc-9f86-885ba0ff1cbe
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6e842010-1dac-456d-bb8f-0b23d7c73b44"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-fdd8f1cc-2069-44dd-a611-d960a3feb027

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdd8f1cc-2069-44dd-a611-d960a3feb027
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-fdd8f1cc-2069-44dd-a611-d960a3feb027
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
correlation: qa-781e3058-e916-4de7-b6e0-c2b3a4606d49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-781e3058-e916-4de7-b6e0-c2b3a4606d49
Content-Type: application/json

--- request body ---
{"handle":"qa-8a5d60e1b303","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 25 Nov 2026 11:27:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-781e3058-e916-4de7-b6e0-c2b3a4606d49
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-781e3058-e916-4de7-b6e0-c2b3a4606d49"}
```
