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
| 1 | `POST /v1/accounts` | 201 | 420 | `qa-c356c3d0-35a1-4cc2-8496-a5a9bfc571d4` |
| 2 | `POST /v1/auth/token` | 200 | 64 | `qa-ca208d90-0e12-4550-97ec-d208085f1f64` |
| 3 | `GET /v1/accounts/me` | 200 | 25 | `qa-34ead01e-e1a9-4f53-a168-99cb919a4924` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-efb79774-dbd2-40ef-a25a-f2ccf36c8bcb` |
| 5 | `GET /v1/accounts/me` | 200 | 10 | `qa-f811b4b5-f6a7-4355-b904-6597349de373` |
| 6 | `GET /v1/accounts/me` | 401 | 12 | `qa-04983530-063f-4d0d-8170-69d41933f0b3` |
| 7 | `GET /v1/accounts/me` | 401 | 8 | `qa-5e8d5fec-2d46-45f4-90c4-11da184c114f` |
| 8 | `POST /v1/auth/token` | 200 | 17 | `qa-15fcaafe-167c-4f79-a3fc-be6735ac51b5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-0ac77ef6-9c10-4ef0-a363-0032ba7be364` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-c67709ae-ef34-4236-a77c-35e52b71c29c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c356c3d0-35a1-4cc2-8496-a5a9bfc571d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c356c3d0-35a1-4cc2-8496-a5a9bfc571d4
Content-Type: application/json

--- request body ---
{"handle":"qa-9ce038aa4265","displayName":"QA 9ce038aa4265","password":"****","region":"eu"}

--- response: 201 in 420 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-c356c3d0-35a1-4cc2-8496-a5a9bfc571d4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-9ce038aa4265
X-Served-Region: eu
Content-Length: 181

{"id":"acc_47eee5fe-d1c6-4ec5-ae43-f2846b468bf1","handle":"qa-9ce038aa4265","displayName":"QA 9ce038aa4265","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.188615529Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-ca208d90-0e12-4550-97ec-d208085f1f64

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca208d90-0e12-4550-97ec-d208085f1f64
Content-Type: application/json

--- request body ---
{"handle":"qa-9ce038aa4265","password":"****","ttlSeconds":1}

--- response: 200 in 64 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-ca208d90-0e12-4550-97ec-d208085f1f64
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_47eee5fe-d1c6-4ec5-ae43-f2846b468bf1"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-34ead01e-e1a9-4f53-a168-99cb919a4924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34ead01e-e1a9-4f53-a168-99cb919a4924
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:19 GMT
Content-Type: application/json
X-Correlation-Id: qa-34ead01e-e1a9-4f53-a168-99cb919a4924
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

{"id":"acc_47eee5fe-d1c6-4ec5-ae43-f2846b468bf1","handle":"qa-9ce038aa4265","displayName":"QA 9ce038aa4265","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.188615529Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-efb79774-dbd2-40ef-a25a-f2ccf36c8bcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-efb79774-dbd2-40ef-a25a-f2ccf36c8bcb
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-efb79774-dbd2-40ef-a25a-f2ccf36c8bcb
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

{"id":"acc_47eee5fe-d1c6-4ec5-ae43-f2846b468bf1","handle":"qa-9ce038aa4265","displayName":"QA 9ce038aa4265","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.188615529Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-f811b4b5-f6a7-4355-b904-6597349de373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f811b4b5-f6a7-4355-b904-6597349de373
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-f811b4b5-f6a7-4355-b904-6597349de373
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

{"id":"acc_47eee5fe-d1c6-4ec5-ae43-f2846b468bf1","handle":"qa-9ce038aa4265","displayName":"QA 9ce038aa4265","region":"eu","role":"user","createdAt":"2026-11-14T09:05:19.188615529Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-04983530-063f-4d0d-8170-69d41933f0b3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04983530-063f-4d0d-8170-69d41933f0b3
Content-Type: application/json

--- response: 401 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04983530-063f-4d0d-8170-69d41933f0b3
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-04983530-063f-4d0d-8170-69d41933f0b3"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e8d5fec-2d46-45f4-90c4-11da184c114f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e8d5fec-2d46-45f4-90c4-11da184c114f
Content-Type: application/json

--- response: 401 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5e8d5fec-2d46-45f4-90c4-11da184c114f
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-5e8d5fec-2d46-45f4-90c4-11da184c114f"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-15fcaafe-167c-4f79-a3fc-be6735ac51b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15fcaafe-167c-4f79-a3fc-be6735ac51b5
Content-Type: application/json

--- request body ---
{"handle":"qa-9ce038aa4265","password":"****"}

--- response: 200 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/json
X-Correlation-Id: qa-15fcaafe-167c-4f79-a3fc-be6735ac51b5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_47eee5fe-d1c6-4ec5-ae43-f2846b468bf1"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0ac77ef6-9c10-4ef0-a363-0032ba7be364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ac77ef6-9c10-4ef0-a363-0032ba7be364
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0ac77ef6-9c10-4ef0-a363-0032ba7be364
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
correlation: qa-c67709ae-ef34-4236-a77c-35e52b71c29c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c67709ae-ef34-4236-a77c-35e52b71c29c
Content-Type: application/json

--- request body ---
{"handle":"qa-9ce038aa4265","password":"****"}

--- response: 401 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:20 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c67709ae-ef34-4236-a77c-35e52b71c29c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c67709ae-ef34-4236-a77c-35e52b71c29c"}
```
