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
| 1 | `POST /v1/accounts` | 201 | 419 | `qa-be9881fd-333d-434c-b81e-f2ae671d105d` |
| 2 | `POST /v1/auth/token` | 200 | 71 | `qa-ac13317c-9b97-445f-9b0d-f0b979f69869` |
| 3 | `GET /v1/accounts/me` | 200 | 22 | `qa-f4ff4b76-cddb-42f6-b585-2dde17434aa4` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-ba04299a-cdd8-4bcf-90c9-8541ce4da15c` |
| 5 | `GET /v1/accounts/me` | 200 | 14 | `qa-ae31ac96-e795-4d69-a16b-5826042459aa` |
| 6 | `GET /v1/accounts/me` | 401 | 15 | `qa-b7c54cba-f59c-496b-a307-d8fe49e33983` |
| 7 | `GET /v1/accounts/me` | 401 | 20 | `qa-db9a9604-e40b-4ea8-8842-c896c83344a1` |
| 8 | `POST /v1/auth/token` | 200 | 15 | `qa-05a4b0cc-6981-4780-9944-4b89741e3daf` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-2761d157-4d97-4f58-b13a-d5af6808f847` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-f80dd54a-ba16-4a1b-ac64-5ca4f1674cd3` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-be9881fd-333d-434c-b81e-f2ae671d105d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be9881fd-333d-434c-b81e-f2ae671d105d
Content-Type: application/json

--- request body ---
{"handle":"qa-317c30f0a1be","displayName":"QA 317c30f0a1be","password":"****","region":"eu"}

--- response: 201 in 419 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-be9881fd-333d-434c-b81e-f2ae671d105d
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
Location: /v1/accounts/qa-317c30f0a1be
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c6f7918e-0029-4432-b6fa-b88e5efed658","handle":"qa-317c30f0a1be","displayName":"QA 317c30f0a1be","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.317192424Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ac13317c-9b97-445f-9b0d-f0b979f69869

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac13317c-9b97-445f-9b0d-f0b979f69869
Content-Type: application/json

--- request body ---
{"handle":"qa-317c30f0a1be","password":"****","ttlSeconds":1}

--- response: 200 in 71 ms ---
Date: Thu, 19 Nov 2026 10:29:13 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac13317c-9b97-445f-9b0d-f0b979f69869
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_c6f7918e-0029-4432-b6fa-b88e5efed658"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-f4ff4b76-cddb-42f6-b585-2dde17434aa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f4ff4b76-cddb-42f6-b585-2dde17434aa4
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f4ff4b76-cddb-42f6-b585-2dde17434aa4
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

{"id":"acc_c6f7918e-0029-4432-b6fa-b88e5efed658","handle":"qa-317c30f0a1be","displayName":"QA 317c30f0a1be","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.317192424Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ba04299a-cdd8-4bcf-90c9-8541ce4da15c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba04299a-cdd8-4bcf-90c9-8541ce4da15c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba04299a-cdd8-4bcf-90c9-8541ce4da15c
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

{"id":"acc_c6f7918e-0029-4432-b6fa-b88e5efed658","handle":"qa-317c30f0a1be","displayName":"QA 317c30f0a1be","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.317192424Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-ae31ac96-e795-4d69-a16b-5826042459aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae31ac96-e795-4d69-a16b-5826042459aa
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae31ac96-e795-4d69-a16b-5826042459aa
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

{"id":"acc_c6f7918e-0029-4432-b6fa-b88e5efed658","handle":"qa-317c30f0a1be","displayName":"QA 317c30f0a1be","region":"eu","role":"user","createdAt":"2026-11-19T10:29:13.317192424Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7c54cba-f59c-496b-a307-d8fe49e33983

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7c54cba-f59c-496b-a307-d8fe49e33983
Content-Type: application/json

--- response: 401 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b7c54cba-f59c-496b-a307-d8fe49e33983
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-b7c54cba-f59c-496b-a307-d8fe49e33983"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-db9a9604-e40b-4ea8-8842-c896c83344a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db9a9604-e40b-4ea8-8842-c896c83344a1
Content-Type: application/json

--- response: 401 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db9a9604-e40b-4ea8-8842-c896c83344a1
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-db9a9604-e40b-4ea8-8842-c896c83344a1"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-05a4b0cc-6981-4780-9944-4b89741e3daf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-05a4b0cc-6981-4780-9944-4b89741e3daf
Content-Type: application/json

--- request body ---
{"handle":"qa-317c30f0a1be","password":"****"}

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-05a4b0cc-6981-4780-9944-4b89741e3daf
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c6f7918e-0029-4432-b6fa-b88e5efed658"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2761d157-4d97-4f58-b13a-d5af6808f847

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2761d157-4d97-4f58-b13a-d5af6808f847
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2761d157-4d97-4f58-b13a-d5af6808f847
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
correlation: qa-f80dd54a-ba16-4a1b-ac64-5ca4f1674cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f80dd54a-ba16-4a1b-ac64-5ca4f1674cd3
Content-Type: application/json

--- request body ---
{"handle":"qa-317c30f0a1be","password":"****"}

--- response: 401 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f80dd54a-ba16-4a1b-ac64-5ca4f1674cd3
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f80dd54a-ba16-4a1b-ac64-5ca4f1674cd3"}
```
