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
| 1 | `POST /v1/accounts` | 201 | 414 | `qa-9b969eae-6c56-412d-bd84-258fc3854026` |
| 2 | `POST /v1/auth/token` | 200 | 127 | `qa-17d91d7e-50ed-4a3b-a0bf-3142f344d979` |
| 3 | `GET /v1/accounts/me` | 200 | 26 | `qa-c15892cc-c764-4076-b4c5-1532c4c39094` |
| 4 | `GET /v1/accounts/me` | 200 | 14 | `qa-a60ec205-9e76-4803-a26a-c8e145c42965` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-abfa7f51-8874-427c-9f56-7c4302b1db1e` |
| 6 | `GET /v1/accounts/me` | 401 | 13 | `qa-7bd8d493-f4a7-4cc1-8108-66b03064d1a1` |
| 7 | `GET /v1/accounts/me` | 401 | 10 | `qa-e31317da-f8cc-4777-bfdb-39679120d192` |
| 8 | `POST /v1/auth/token` | 200 | 18 | `qa-9ef1ae67-c3bc-43ad-bbdf-001c9db1c252` |
| 9 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-6127949d-8498-4c95-b8db-8e888cd2ad4c` |
| 10 | `POST /v1/auth/token` | 401 | 6 | `qa-6604b357-2c90-4f9f-bbe2-ebca07f77250` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9b969eae-6c56-412d-bd84-258fc3854026

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b969eae-6c56-412d-bd84-258fc3854026
Content-Type: application/json

--- request body ---
{"handle":"qa-88d770295072","displayName":"QA 88d770295072","password":"****","region":"eu"}

--- response: 201 in 414 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b969eae-6c56-412d-bd84-258fc3854026
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
Location: /v1/accounts/qa-88d770295072
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c1fef0e8-9450-4536-9169-a28e45189788","handle":"qa-88d770295072","displayName":"QA 88d770295072","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.196601126Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-17d91d7e-50ed-4a3b-a0bf-3142f344d979

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17d91d7e-50ed-4a3b-a0bf-3142f344d979
Content-Type: application/json

--- request body ---
{"handle":"qa-88d770295072","password":"****","ttlSeconds":1}

--- response: 200 in 127 ms ---
Date: Tue, 03 Nov 2026 09:41:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-17d91d7e-50ed-4a3b-a0bf-3142f344d979
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_c1fef0e8-9450-4536-9169-a28e45189788"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-c15892cc-c764-4076-b4c5-1532c4c39094

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c15892cc-c764-4076-b4c5-1532c4c39094
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-c15892cc-c764-4076-b4c5-1532c4c39094
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

{"id":"acc_c1fef0e8-9450-4536-9169-a28e45189788","handle":"qa-88d770295072","displayName":"QA 88d770295072","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.196601126Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-a60ec205-9e76-4803-a26a-c8e145c42965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a60ec205-9e76-4803-a26a-c8e145c42965
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-a60ec205-9e76-4803-a26a-c8e145c42965
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

{"id":"acc_c1fef0e8-9450-4536-9169-a28e45189788","handle":"qa-88d770295072","displayName":"QA 88d770295072","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.196601126Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-abfa7f51-8874-427c-9f56-7c4302b1db1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abfa7f51-8874-427c-9f56-7c4302b1db1e
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-abfa7f51-8874-427c-9f56-7c4302b1db1e
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

{"id":"acc_c1fef0e8-9450-4536-9169-a28e45189788","handle":"qa-88d770295072","displayName":"QA 88d770295072","region":"eu","role":"user","createdAt":"2026-11-03T09:41:41.196601126Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bd8d493-f4a7-4cc1-8108-66b03064d1a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bd8d493-f4a7-4cc1-8108-66b03064d1a1
Content-Type: application/json

--- response: 401 in 13 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bd8d493-f4a7-4cc1-8108-66b03064d1a1
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-7bd8d493-f4a7-4cc1-8108-66b03064d1a1"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-e31317da-f8cc-4777-bfdb-39679120d192

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e31317da-f8cc-4777-bfdb-39679120d192
Content-Type: application/json

--- response: 401 in 10 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e31317da-f8cc-4777-bfdb-39679120d192
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-e31317da-f8cc-4777-bfdb-39679120d192"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-9ef1ae67-c3bc-43ad-bbdf-001c9db1c252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ef1ae67-c3bc-43ad-bbdf-001c9db1c252
Content-Type: application/json

--- request body ---
{"handle":"qa-88d770295072","password":"****"}

--- response: 200 in 18 ms ---
Date: Tue, 03 Nov 2026 09:41:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ef1ae67-c3bc-43ad-bbdf-001c9db1c252
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c1fef0e8-9450-4536-9169-a28e45189788"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6127949d-8498-4c95-b8db-8e888cd2ad4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6127949d-8498-4c95-b8db-8e888cd2ad4c
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6127949d-8498-4c95-b8db-8e888cd2ad4c
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
correlation: qa-6604b357-2c90-4f9f-bbe2-ebca07f77250

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6604b357-2c90-4f9f-bbe2-ebca07f77250
Content-Type: application/json

--- request body ---
{"handle":"qa-88d770295072","password":"****"}

--- response: 401 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6604b357-2c90-4f9f-bbe2-ebca07f77250
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6604b357-2c90-4f9f-bbe2-ebca07f77250"}
```
