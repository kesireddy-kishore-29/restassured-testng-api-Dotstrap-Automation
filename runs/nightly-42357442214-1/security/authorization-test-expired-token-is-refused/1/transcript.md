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
| 1 | `POST /v1/accounts` | 201 | 314 | `qa-cfe34942-1aa7-4830-ad79-4ab33944862b` |
| 2 | `POST /v1/auth/token` | 200 | 37 | `qa-072ed761-442c-4cea-a6b5-3b890dfd1e6f` |
| 3 | `GET /v1/accounts/me` | 200 | 8 | `qa-10f0f8c5-22d6-4d31-a7b8-54af145eeb28` |
| 4 | `GET /v1/accounts/me` | 200 | 9 | `qa-ad5ce846-2fba-44d7-819d-ad8774359e7d` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-32d3212f-43ed-45cc-adaf-d2493c3a8274` |
| 6 | `GET /v1/accounts/me` | 401 | 5 | `qa-4b0c0315-fca4-48f8-a716-ca8899e8197a` |
| 7 | `GET /v1/accounts/me` | 401 | 5 | `qa-3f1cc9c5-c7f1-46f3-8b8e-eb689247f550` |
| 8 | `POST /v1/auth/token` | 200 | 7 | `qa-d56e1323-f88d-41b4-af2b-7a28562c79c7` |
| 9 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-d0d58a06-b768-459d-9179-1dcb906456b5` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-421f9e83-3ab8-4c0f-bd72-5f4da496648c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-cfe34942-1aa7-4830-ad79-4ab33944862b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfe34942-1aa7-4830-ad79-4ab33944862b
Content-Type: application/json

--- request body ---
{"handle":"qa-08cf82f45bdf","displayName":"QA 08cf82f45bdf","password":"****","region":"eu"}

--- response: 201 in 314 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfe34942-1aa7-4830-ad79-4ab33944862b
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
Location: /v1/accounts/qa-08cf82f45bdf
X-Served-Region: eu
Content-Length: 181

{"id":"acc_671e19c4-e144-47f3-970f-8a61b46b3939","handle":"qa-08cf82f45bdf","displayName":"QA 08cf82f45bdf","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.116274324Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-072ed761-442c-4cea-a6b5-3b890dfd1e6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072ed761-442c-4cea-a6b5-3b890dfd1e6f
Content-Type: application/json

--- request body ---
{"handle":"qa-08cf82f45bdf","password":"****","ttlSeconds":1}

--- response: 200 in 37 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-072ed761-442c-4cea-a6b5-3b890dfd1e6f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_671e19c4-e144-47f3-970f-8a61b46b3939"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-10f0f8c5-22d6-4d31-a7b8-54af145eeb28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10f0f8c5-22d6-4d31-a7b8-54af145eeb28
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-10f0f8c5-22d6-4d31-a7b8-54af145eeb28
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

{"id":"acc_671e19c4-e144-47f3-970f-8a61b46b3939","handle":"qa-08cf82f45bdf","displayName":"QA 08cf82f45bdf","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.116274324Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad5ce846-2fba-44d7-819d-ad8774359e7d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad5ce846-2fba-44d7-819d-ad8774359e7d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 07 Nov 2026 08:54:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad5ce846-2fba-44d7-819d-ad8774359e7d
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

{"id":"acc_671e19c4-e144-47f3-970f-8a61b46b3939","handle":"qa-08cf82f45bdf","displayName":"QA 08cf82f45bdf","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.116274324Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-32d3212f-43ed-45cc-adaf-d2493c3a8274

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32d3212f-43ed-45cc-adaf-d2493c3a8274
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-32d3212f-43ed-45cc-adaf-d2493c3a8274
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

{"id":"acc_671e19c4-e144-47f3-970f-8a61b46b3939","handle":"qa-08cf82f45bdf","displayName":"QA 08cf82f45bdf","region":"eu","role":"user","createdAt":"2026-11-07T08:54:57.116274324Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b0c0315-fca4-48f8-a716-ca8899e8197a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b0c0315-fca4-48f8-a716-ca8899e8197a
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b0c0315-fca4-48f8-a716-ca8899e8197a
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-4b0c0315-fca4-48f8-a716-ca8899e8197a"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f1cc9c5-c7f1-46f3-8b8e-eb689247f550

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f1cc9c5-c7f1-46f3-8b8e-eb689247f550
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3f1cc9c5-c7f1-46f3-8b8e-eb689247f550
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-3f1cc9c5-c7f1-46f3-8b8e-eb689247f550"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-d56e1323-f88d-41b4-af2b-7a28562c79c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d56e1323-f88d-41b4-af2b-7a28562c79c7
Content-Type: application/json

--- request body ---
{"handle":"qa-08cf82f45bdf","password":"****"}

--- response: 200 in 7 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d56e1323-f88d-41b4-af2b-7a28562c79c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_671e19c4-e144-47f3-970f-8a61b46b3939"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d0d58a06-b768-459d-9179-1dcb906456b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0d58a06-b768-459d-9179-1dcb906456b5
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d0d58a06-b768-459d-9179-1dcb906456b5
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
correlation: qa-421f9e83-3ab8-4c0f-bd72-5f4da496648c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-421f9e83-3ab8-4c0f-bd72-5f4da496648c
Content-Type: application/json

--- request body ---
{"handle":"qa-08cf82f45bdf","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 07 Nov 2026 08:54:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-421f9e83-3ab8-4c0f-bd72-5f4da496648c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-421f9e83-3ab8-4c0f-bd72-5f4da496648c"}
```
