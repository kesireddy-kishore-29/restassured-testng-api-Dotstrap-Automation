# Transcript: A new account can sign in and read itself back

| | |
|---|---|
| Test | `com.qaautomation.tests.smoke.HealthSmokeTest#newAccountCanSignInAndReadItself` |
| Features | FEAT-ACCT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 316 | `qa-75f5e028-36cd-45e5-a1d2-16d18dab1d2f` |
| 2 | `POST /v1/auth/token` | 200 | 44 | `qa-e74d25d8-264a-4814-84c2-e06d5c55724a` |
| 3 | `GET /v1/accounts/me` | 200 | 55 | `qa-def0b7cd-9035-4fd7-a323-bf8e54fb3212` |
| 4 | `GET /v1/accounts/me` | 200 | 17 | `qa-beaee225-6aad-457b-ab9e-8f3bdf374ec5` |
| 5 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-6d24e747-a5a6-4e4d-81b2-baeb9cdff7d4` |
| 6 | `POST /v1/auth/token` | 401 | 14 | `qa-7190ac58-c458-40db-989f-1c6b1d450bbe` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-75f5e028-36cd-45e5-a1d2-16d18dab1d2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75f5e028-36cd-45e5-a1d2-16d18dab1d2f
Content-Type: application/json

--- request body ---
{"handle":"qa-451e9da0929a","displayName":"QA 451e9da0929a","password":"****","region":"eu"}

--- response: 201 in 316 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-75f5e028-36cd-45e5-a1d2-16d18dab1d2f
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
Location: /v1/accounts/qa-451e9da0929a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f22783c2-91e1-4f52-9371-ce48b64e35e5","handle":"qa-451e9da0929a","displayName":"QA 451e9da0929a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.080619690Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e74d25d8-264a-4814-84c2-e06d5c55724a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e74d25d8-264a-4814-84c2-e06d5c55724a
Content-Type: application/json

--- request body ---
{"handle":"qa-451e9da0929a","password":"****"}

--- response: 200 in 44 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e74d25d8-264a-4814-84c2-e06d5c55724a
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f22783c2-91e1-4f52-9371-ce48b64e35e5"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-def0b7cd-9035-4fd7-a323-bf8e54fb3212

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-def0b7cd-9035-4fd7-a323-bf8e54fb3212
Content-Type: application/json

--- response: 200 in 55 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-def0b7cd-9035-4fd7-a323-bf8e54fb3212
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

{"id":"acc_f22783c2-91e1-4f52-9371-ce48b64e35e5","handle":"qa-451e9da0929a","displayName":"QA 451e9da0929a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.080619690Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-beaee225-6aad-457b-ab9e-8f3bdf374ec5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-beaee225-6aad-457b-ab9e-8f3bdf374ec5
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-beaee225-6aad-457b-ab9e-8f3bdf374ec5
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

{"id":"acc_f22783c2-91e1-4f52-9371-ce48b64e35e5","handle":"qa-451e9da0929a","displayName":"QA 451e9da0929a","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.080619690Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6d24e747-a5a6-4e4d-81b2-baeb9cdff7d4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d24e747-a5a6-4e4d-81b2-baeb9cdff7d4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6d24e747-a5a6-4e4d-81b2-baeb9cdff7d4
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
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-7190ac58-c458-40db-989f-1c6b1d450bbe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7190ac58-c458-40db-989f-1c6b1d450bbe
Content-Type: application/json

--- request body ---
{"handle":"qa-451e9da0929a","password":"****"}

--- response: 401 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7190ac58-c458-40db-989f-1c6b1d450bbe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7190ac58-c458-40db-989f-1c6b1d450bbe"}
```
