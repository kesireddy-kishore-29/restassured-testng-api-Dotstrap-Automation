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
| 1 | `POST /v1/accounts` | 201 | 217 | `qa-d94f8d2b-5a0c-4543-be52-2965ec28d483` |
| 2 | `POST /v1/auth/token` | 200 | 33 | `qa-f6b8237c-d409-41bb-be60-5ef990870f05` |
| 3 | `GET /v1/accounts/me` | 200 | 13 | `qa-471c5ce0-20cc-432c-885d-6cc2517d7f82` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-eb282f77-0c30-46e8-8f96-078babe93f1a` |
| 5 | `GET /v1/accounts/me` | 200 | 5 | `qa-dc1c32b1-1a0d-47ef-8241-058a57311c07` |
| 6 | `GET /v1/accounts/me` | 401 | 4 | `qa-810f9445-552d-4fe5-96cf-0ad8bd964616` |
| 7 | `GET /v1/accounts/me` | 401 | 3 | `qa-c9023a6b-d95c-45b4-9bc9-92cc4e80085a` |
| 8 | `POST /v1/auth/token` | 200 | 7 | `qa-20b9dd85-19a0-4ff6-b80c-3a6151bdb95d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-c6d7b9d7-c158-4b7f-ac96-468954aa735c` |
| 10 | `POST /v1/auth/token` | 401 | 3 | `qa-3a17b1fc-3ffb-4e46-904a-1c439e5f081c` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d94f8d2b-5a0c-4543-be52-2965ec28d483

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d94f8d2b-5a0c-4543-be52-2965ec28d483
Content-Type: application/json

--- request body ---
{"handle":"qa-07b965bdc427","displayName":"QA 07b965bdc427","password":"****","region":"eu"}

--- response: 201 in 217 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-d94f8d2b-5a0c-4543-be52-2965ec28d483
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-07b965bdc427
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9dec6098-23a8-47c1-ae5e-8541842ba924","handle":"qa-07b965bdc427","displayName":"QA 07b965bdc427","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.280359883Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-f6b8237c-d409-41bb-be60-5ef990870f05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6b8237c-d409-41bb-be60-5ef990870f05
Content-Type: application/json

--- request body ---
{"handle":"qa-07b965bdc427","password":"****","ttlSeconds":1}

--- response: 200 in 33 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6b8237c-d409-41bb-be60-5ef990870f05
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":1,"accountId":"acc_9dec6098-23a8-47c1-ae5e-8541842ba924"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-471c5ce0-20cc-432c-885d-6cc2517d7f82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-471c5ce0-20cc-432c-885d-6cc2517d7f82
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Sun, 01 Nov 2026 09:23:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-471c5ce0-20cc-432c-885d-6cc2517d7f82
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

{"id":"acc_9dec6098-23a8-47c1-ae5e-8541842ba924","handle":"qa-07b965bdc427","displayName":"QA 07b965bdc427","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.280359883Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb282f77-0c30-46e8-8f96-078babe93f1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb282f77-0c30-46e8-8f96-078babe93f1a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb282f77-0c30-46e8-8f96-078babe93f1a
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

{"id":"acc_9dec6098-23a8-47c1-ae5e-8541842ba924","handle":"qa-07b965bdc427","displayName":"QA 07b965bdc427","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.280359883Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-dc1c32b1-1a0d-47ef-8241-058a57311c07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc1c32b1-1a0d-47ef-8241-058a57311c07
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc1c32b1-1a0d-47ef-8241-058a57311c07
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

{"id":"acc_9dec6098-23a8-47c1-ae5e-8541842ba924","handle":"qa-07b965bdc427","displayName":"QA 07b965bdc427","region":"eu","role":"user","createdAt":"2026-11-01T09:23:14.280359883Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-810f9445-552d-4fe5-96cf-0ad8bd964616

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-810f9445-552d-4fe5-96cf-0ad8bd964616
Content-Type: application/json

--- response: 401 in 4 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-810f9445-552d-4fe5-96cf-0ad8bd964616
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-810f9445-552d-4fe5-96cf-0ad8bd964616"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-c9023a6b-d95c-45b4-9bc9-92cc4e80085a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c9023a6b-d95c-45b4-9bc9-92cc4e80085a
Content-Type: application/json

--- response: 401 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c9023a6b-d95c-45b4-9bc9-92cc4e80085a
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

{"type":"https://reference-service.example/problems/token-expired","title":"Token expired","status":401,"detail":"Request a new token.","instance":"/v1/accounts/me","correlationId":"qa-c9023a6b-d95c-45b4-9bc9-92cc4e80085a"}
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-20b9dd85-19a0-4ff6-b80c-3a6151bdb95d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20b9dd85-19a0-4ff6-b80c-3a6151bdb95d
Content-Type: application/json

--- request body ---
{"handle":"qa-07b965bdc427","password":"****"}

--- response: 200 in 7 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/json
X-Correlation-Id: qa-20b9dd85-19a0-4ff6-b80c-3a6151bdb95d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9dec6098-23a8-47c1-ae5e-8541842ba924"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c6d7b9d7-c158-4b7f-ac96-468954aa735c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6d7b9d7-c158-4b7f-ac96-468954aa735c
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c6d7b9d7-c158-4b7f-ac96-468954aa735c
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
correlation: qa-3a17b1fc-3ffb-4e46-904a-1c439e5f081c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a17b1fc-3ffb-4e46-904a-1c439e5f081c
Content-Type: application/json

--- request body ---
{"handle":"qa-07b965bdc427","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 01 Nov 2026 09:23:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a17b1fc-3ffb-4e46-904a-1c439e5f081c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a17b1fc-3ffb-4e46-904a-1c439e5f081c"}
```
