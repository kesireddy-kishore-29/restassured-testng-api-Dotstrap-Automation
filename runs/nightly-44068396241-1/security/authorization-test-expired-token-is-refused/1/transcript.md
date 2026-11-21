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
| 1 | `POST /v1/accounts` | 201 | 279 | `qa-e399c9c9-55e9-4319-bb01-5fc01123f2d7` |
| 2 | `POST /v1/auth/token` | 200 | 48 | `qa-35ab7cde-9123-4648-9a3b-229e2161824f` |
| 3 | `GET /v1/accounts/me` | 200 | 12 | `qa-4c34997f-1369-45e2-9b83-058ebd47f477` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-81a9c9e1-e378-4d73-a269-6611cd289265` |
| 5 | `GET /v1/accounts/me` | 200 | 6 | `qa-bfa2c6ef-72ae-4570-953c-fa97181a3e14` |
| 6 | `GET /v1/accounts/me` | 401 | 5 | `qa-94762737-a0a2-4ffb-92b4-b4beca540318` |
| 7 | `GET /v1/accounts/me` | 401 | 5 | `qa-a20de2d4-c6bb-4f6a-8581-ce83c2402648` |
| 8 | `POST /v1/auth/token` | 200 | 6 | `qa-b4ae1bab-df1d-4915-9a57-4fa1eb9032e5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-95721a2f-5b7f-4048-9220-719bbc71dfb4` |
| 10 | `POST /v1/auth/token` | 401 | 4 | `qa-435fe243-e5d3-4539-85cd-01d05167868d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e399c9c9-55e9-4319-bb01-5fc01123f2d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e399c9c9-55e9-4319-bb01-5fc01123f2d7
Content-Type: application/json

--- request body ---
{"handle":"qa-62b4d17e481a","displayName":"QA 62b4d17e481a","password":"****","region":"eu"}

--- response: 201 in 279 ms ---
Date: Tue, 17 Nov 2026 10:50:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e399c9c9-55e9-4319-bb01-5fc01123f2d7
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
Location: /v1/accounts/qa-62b4d17e481a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6f62d125-5aca-40e9-a5d4-21cd5e1368ae","handle":"qa-62b4d17e481a","displayName":"QA 62b4d17e481a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.644842258Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-35ab7cde-9123-4648-9a3b-229e2161824f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35ab7cde-9123-4648-9a3b-229e2161824f
Content-Type: application/json

--- request body ---
{"handle":"qa-62b4d17e481a","password":"****","ttlSeconds":1}

--- response: 200 in 48 ms ---
Date: Tue, 17 Nov 2026 10:50:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-35ab7cde-9123-4648-9a3b-229e2161824f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_6f62d125-5aca-40e9-a5d4-21cd5e1368ae"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c34997f-1369-45e2-9b83-058ebd47f477

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c34997f-1369-45e2-9b83-058ebd47f477
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c34997f-1369-45e2-9b83-058ebd47f477
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

{"id":"acc_6f62d125-5aca-40e9-a5d4-21cd5e1368ae","handle":"qa-62b4d17e481a","displayName":"QA 62b4d17e481a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.644842258Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-81a9c9e1-e378-4d73-a269-6611cd289265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81a9c9e1-e378-4d73-a269-6611cd289265
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-81a9c9e1-e378-4d73-a269-6611cd289265
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

{"id":"acc_6f62d125-5aca-40e9-a5d4-21cd5e1368ae","handle":"qa-62b4d17e481a","displayName":"QA 62b4d17e481a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.644842258Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-bfa2c6ef-72ae-4570-953c-fa97181a3e14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bfa2c6ef-72ae-4570-953c-fa97181a3e14
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-bfa2c6ef-72ae-4570-953c-fa97181a3e14
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

{"id":"acc_6f62d125-5aca-40e9-a5d4-21cd5e1368ae","handle":"qa-62b4d17e481a","displayName":"QA 62b4d17e481a","region":"eu","role":"user","createdAt":"2026-11-17T10:50:06.644842258Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-94762737-a0a2-4ffb-92b4-b4beca540318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94762737-a0a2-4ffb-92b4-b4beca540318
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94762737-a0a2-4ffb-92b4-b4beca540318
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-94762737-a0a2-4ffb-92b4-b4beca540318"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-a20de2d4-c6bb-4f6a-8581-ce83c2402648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a20de2d4-c6bb-4f6a-8581-ce83c2402648
Content-Type: application/json

--- response: 401 in 5 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a20de2d4-c6bb-4f6a-8581-ce83c2402648
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-a20de2d4-c6bb-4f6a-8581-ce83c2402648"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-b4ae1bab-df1d-4915-9a57-4fa1eb9032e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4ae1bab-df1d-4915-9a57-4fa1eb9032e5
Content-Type: application/json

--- request body ---
{"handle":"qa-62b4d17e481a","password":"****"}

--- response: 200 in 6 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4ae1bab-df1d-4915-9a57-4fa1eb9032e5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6f62d125-5aca-40e9-a5d4-21cd5e1368ae"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-95721a2f-5b7f-4048-9220-719bbc71dfb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95721a2f-5b7f-4048-9220-719bbc71dfb4
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-95721a2f-5b7f-4048-9220-719bbc71dfb4
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
correlation: qa-435fe243-e5d3-4539-85cd-01d05167868d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-435fe243-e5d3-4539-85cd-01d05167868d
Content-Type: application/json

--- request body ---
{"handle":"qa-62b4d17e481a","password":"****"}

--- response: 401 in 4 ms ---
Date: Tue, 17 Nov 2026 10:50:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-435fe243-e5d3-4539-85cd-01d05167868d
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-435fe243-e5d3-4539-85cd-01d05167868d"}
```
