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
| 1 | `POST /v1/accounts` | 201 | 455 | `qa-072b379c-7687-4b7d-9475-0c3a35b780c8` |
| 2 | `POST /v1/auth/token` | 200 | 67 | `qa-1d58477f-9167-4afb-aadc-00dabaa78cf1` |
| 3 | `GET /v1/accounts/me` | 200 | 27 | `qa-72e03aa8-2ac0-4d93-a269-04282c5e5907` |
| 4 | `GET /v1/accounts/me` | 200 | 6 | `qa-77a52e1a-1cbe-4106-b16f-03c30efbcf32` |
| 5 | `GET /v1/accounts/me` | 200 | 8 | `qa-425c9a9d-ca10-458e-ac5e-63d771a8275d` |
| 6 | `GET /v1/accounts/me` | 401 | 17 | `qa-34d29d6d-7f52-4e2a-b415-075b8be55583` |
| 7 | `GET /v1/accounts/me` | 401 | 11 | `qa-8ed3a575-7a16-4487-8372-990326c4ebc2` |
| 8 | `POST /v1/auth/token` | 200 | 17 | `qa-e1c324eb-ec90-429e-9a2c-e9237518ca27` |
| 9 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-960a0c74-58a8-4f73-b444-439071326f81` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-654ba516-b6a7-4cfa-92b0-eb91c2b7d70a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-072b379c-7687-4b7d-9475-0c3a35b780c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-072b379c-7687-4b7d-9475-0c3a35b780c8
Content-Type: application/json

--- request body ---
{"handle":"qa-ae010b055b77","displayName":"QA ae010b055b77","password":"****","region":"eu"}

--- response: 201 in 455 ms ---
Date: Wed, 28 Oct 2026 08:42:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-072b379c-7687-4b7d-9475-0c3a35b780c8
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
Location: /v1/accounts/qa-ae010b055b77
X-Served-Region: eu
Content-Length: 181

{"id":"acc_035639ad-889e-45a0-8d8f-7560fb3bab2c","handle":"qa-ae010b055b77","displayName":"QA ae010b055b77","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.815682294Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-1d58477f-9167-4afb-aadc-00dabaa78cf1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d58477f-9167-4afb-aadc-00dabaa78cf1
Content-Type: application/json

--- request body ---
{"handle":"qa-ae010b055b77","password":"****","ttlSeconds":1}

--- response: 200 in 67 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1d58477f-9167-4afb-aadc-00dabaa78cf1
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_035639ad-889e-45a0-8d8f-7560fb3bab2c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-72e03aa8-2ac0-4d93-a269-04282c5e5907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e03aa8-2ac0-4d93-a269-04282c5e5907
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-72e03aa8-2ac0-4d93-a269-04282c5e5907
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

{"id":"acc_035639ad-889e-45a0-8d8f-7560fb3bab2c","handle":"qa-ae010b055b77","displayName":"QA ae010b055b77","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.815682294Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-77a52e1a-1cbe-4106-b16f-03c30efbcf32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77a52e1a-1cbe-4106-b16f-03c30efbcf32
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-77a52e1a-1cbe-4106-b16f-03c30efbcf32
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

{"id":"acc_035639ad-889e-45a0-8d8f-7560fb3bab2c","handle":"qa-ae010b055b77","displayName":"QA ae010b055b77","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.815682294Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-425c9a9d-ca10-458e-ac5e-63d771a8275d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-425c9a9d-ca10-458e-ac5e-63d771a8275d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-425c9a9d-ca10-458e-ac5e-63d771a8275d
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

{"id":"acc_035639ad-889e-45a0-8d8f-7560fb3bab2c","handle":"qa-ae010b055b77","displayName":"QA ae010b055b77","region":"eu","role":"user","createdAt":"2026-10-28T08:42:57.815682294Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-34d29d6d-7f52-4e2a-b415-075b8be55583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34d29d6d-7f52-4e2a-b415-075b8be55583
Content-Type: application/json

--- response: 401 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-34d29d6d-7f52-4e2a-b415-075b8be55583
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-34d29d6d-7f52-4e2a-b415-075b8be55583"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-8ed3a575-7a16-4487-8372-990326c4ebc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ed3a575-7a16-4487-8372-990326c4ebc2
Content-Type: application/json

--- response: 401 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ed3a575-7a16-4487-8372-990326c4ebc2
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-8ed3a575-7a16-4487-8372-990326c4ebc2"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e1c324eb-ec90-429e-9a2c-e9237518ca27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1c324eb-ec90-429e-9a2c-e9237518ca27
Content-Type: application/json

--- request body ---
{"handle":"qa-ae010b055b77","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1c324eb-ec90-429e-9a2c-e9237518ca27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_035639ad-889e-45a0-8d8f-7560fb3bab2c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-960a0c74-58a8-4f73-b444-439071326f81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-960a0c74-58a8-4f73-b444-439071326f81
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-960a0c74-58a8-4f73-b444-439071326f81
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
correlation: qa-654ba516-b6a7-4cfa-92b0-eb91c2b7d70a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-654ba516-b6a7-4cfa-92b0-eb91c2b7d70a
Content-Type: application/json

--- request body ---
{"handle":"qa-ae010b055b77","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-654ba516-b6a7-4cfa-92b0-eb91c2b7d70a
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-654ba516-b6a7-4cfa-92b0-eb91c2b7d70a"}
```
