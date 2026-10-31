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
| 1 | `POST /v1/accounts` | 201 | 398 | `qa-bb2df00f-ba86-4edc-b479-79986fd5c27b` |
| 2 | `POST /v1/auth/token` | 200 | 66 | `qa-d9276d42-31ce-4c3c-a58b-9e50bdb65c29` |
| 3 | `GET /v1/accounts/me` | 200 | 18 | `qa-fc42cad5-45f1-46bf-b758-1f667dcf47fa` |
| 4 | `GET /v1/accounts/me` | 200 | 16 | `qa-75888c81-8bf7-4377-bbcb-f6725f5936de` |
| 5 | `GET /v1/accounts/me` | 200 | 13 | `qa-62c25a25-7824-4687-873b-3f91c2e89ddc` |
| 6 | `GET /v1/accounts/me` | 401 | 15 | `qa-e0a22b61-6d85-405e-bba3-7194133a010a` |
| 7 | `GET /v1/accounts/me` | 401 | 12 | `qa-99eb27d6-ae69-4c51-a006-4e9f6d231b51` |
| 8 | `POST /v1/auth/token` | 200 | 19 | `qa-c3c1af31-c186-490a-9afd-b75267f358e9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-23fe9d1e-b8ac-4903-9f4b-d9c6c6a48602` |
| 10 | `POST /v1/auth/token` | 401 | 11 | `qa-71581e30-fda9-4a66-8533-01600d62c378` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bb2df00f-ba86-4edc-b479-79986fd5c27b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb2df00f-ba86-4edc-b479-79986fd5c27b
Content-Type: application/json

--- request body ---
{"handle":"qa-181440a6ad1a","displayName":"QA 181440a6ad1a","password":"****","region":"eu"}

--- response: 201 in 398 ms ---
Date: Fri, 30 Oct 2026 08:46:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb2df00f-ba86-4edc-b479-79986fd5c27b
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
Location: /v1/accounts/qa-181440a6ad1a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e9414c07-a497-49cc-ac14-09348b66e776","handle":"qa-181440a6ad1a","displayName":"QA 181440a6ad1a","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.673587457Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d9276d42-31ce-4c3c-a58b-9e50bdb65c29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9276d42-31ce-4c3c-a58b-9e50bdb65c29
Content-Type: application/json

--- request body ---
{"handle":"qa-181440a6ad1a","password":"****","ttlSeconds":1}

--- response: 200 in 66 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9276d42-31ce-4c3c-a58b-9e50bdb65c29
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_e9414c07-a497-49cc-ac14-09348b66e776"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-fc42cad5-45f1-46bf-b758-1f667dcf47fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc42cad5-45f1-46bf-b758-1f667dcf47fa
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc42cad5-45f1-46bf-b758-1f667dcf47fa
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

{"id":"acc_e9414c07-a497-49cc-ac14-09348b66e776","handle":"qa-181440a6ad1a","displayName":"QA 181440a6ad1a","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.673587457Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-75888c81-8bf7-4377-bbcb-f6725f5936de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75888c81-8bf7-4377-bbcb-f6725f5936de
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-75888c81-8bf7-4377-bbcb-f6725f5936de
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

{"id":"acc_e9414c07-a497-49cc-ac14-09348b66e776","handle":"qa-181440a6ad1a","displayName":"QA 181440a6ad1a","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.673587457Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-62c25a25-7824-4687-873b-3f91c2e89ddc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62c25a25-7824-4687-873b-3f91c2e89ddc
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 30 Oct 2026 08:46:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-62c25a25-7824-4687-873b-3f91c2e89ddc
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

{"id":"acc_e9414c07-a497-49cc-ac14-09348b66e776","handle":"qa-181440a6ad1a","displayName":"QA 181440a6ad1a","region":"eu","role":"user","createdAt":"2026-10-30T08:46:02.673587457Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-e0a22b61-6d85-405e-bba3-7194133a010a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e0a22b61-6d85-405e-bba3-7194133a010a
Content-Type: application/json

--- response: 401 in 15 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e0a22b61-6d85-405e-bba3-7194133a010a
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-e0a22b61-6d85-405e-bba3-7194133a010a"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-99eb27d6-ae69-4c51-a006-4e9f6d231b51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99eb27d6-ae69-4c51-a006-4e9f6d231b51
Content-Type: application/json

--- response: 401 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-99eb27d6-ae69-4c51-a006-4e9f6d231b51
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-99eb27d6-ae69-4c51-a006-4e9f6d231b51"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-c3c1af31-c186-490a-9afd-b75267f358e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3c1af31-c186-490a-9afd-b75267f358e9
Content-Type: application/json

--- request body ---
{"handle":"qa-181440a6ad1a","password":"****"}

--- response: 200 in 19 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3c1af31-c186-490a-9afd-b75267f358e9
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e9414c07-a497-49cc-ac14-09348b66e776"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23fe9d1e-b8ac-4903-9f4b-d9c6c6a48602

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23fe9d1e-b8ac-4903-9f4b-d9c6c6a48602
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23fe9d1e-b8ac-4903-9f4b-d9c6c6a48602
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
correlation: qa-71581e30-fda9-4a66-8533-01600d62c378

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-71581e30-fda9-4a66-8533-01600d62c378
Content-Type: application/json

--- request body ---
{"handle":"qa-181440a6ad1a","password":"****"}

--- response: 401 in 11 ms ---
Date: Fri, 30 Oct 2026 08:46:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-71581e30-fda9-4a66-8533-01600d62c378
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-71581e30-fda9-4a66-8533-01600d62c378"}
```
