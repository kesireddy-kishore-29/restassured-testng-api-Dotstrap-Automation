# Transcript: A new display name is stored and returned

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#displayNameChangeIsPersisted` |
| Features | FEAT-ACCT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 260 | `qa-c6b591ca-6d67-4db7-aefe-b3e45981fb58` |
| 2 | `POST /v1/auth/token` | 200 | 35 | `qa-bd01018b-8d79-4435-a7cd-ca916f7fe033` |
| 3 | `PATCH /v1/accounts/me` | 200 | 25 | `qa-93b711ee-34d0-4ed3-ab7f-8fe46ffddaca` |
| 4 | `GET /v1/accounts/me` | 200 | 13 | `qa-5dfc9004-d005-402d-8799-1418d8b0188d` |
| 5 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3869baa5-a30d-4235-b1d4-e7a57cbbb5ef` |
| 6 | `POST /v1/auth/token` | 401 | 35 | `qa-3ad55bc4-a40d-414f-8d30-885f0d2c51bb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c6b591ca-6d67-4db7-aefe-b3e45981fb58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c6b591ca-6d67-4db7-aefe-b3e45981fb58
Content-Type: application/json

--- request body ---
{"handle":"qa-c6ead84ffbab","displayName":"QA c6ead84ffbab","password":"****","region":"eu"}

--- response: 201 in 260 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-c6b591ca-6d67-4db7-aefe-b3e45981fb58
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
Location: /v1/accounts/qa-c6ead84ffbab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_016cbeea-f059-42b4-aaee-6778b615e047","handle":"qa-c6ead84ffbab","displayName":"QA c6ead84ffbab","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.160041631Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-bd01018b-8d79-4435-a7cd-ca916f7fe033

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bd01018b-8d79-4435-a7cd-ca916f7fe033
Content-Type: application/json

--- request body ---
{"handle":"qa-c6ead84ffbab","password":"****"}

--- response: 200 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-bd01018b-8d79-4435-a7cd-ca916f7fe033
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_016cbeea-f059-42b4-aaee-6778b615e047"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-93b711ee-34d0-4ed3-ab7f-8fe46ffddaca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93b711ee-34d0-4ed3-ab7f-8fe46ffddaca
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-93b711ee-34d0-4ed3-ab7f-8fe46ffddaca
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
Content-Length: 179

{"id":"acc_016cbeea-f059-42b4-aaee-6778b615e047","handle":"qa-c6ead84ffbab","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.160041631Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-5dfc9004-d005-402d-8799-1418d8b0188d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5dfc9004-d005-402d-8799-1418d8b0188d
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/json
X-Correlation-Id: qa-5dfc9004-d005-402d-8799-1418d8b0188d
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
Content-Length: 179

{"id":"acc_016cbeea-f059-42b4-aaee-6778b615e047","handle":"qa-c6ead84ffbab","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-27T10:59:46.160041631Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3869baa5-a30d-4235-b1d4-e7a57cbbb5ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3869baa5-a30d-4235-b1d4-e7a57cbbb5ef
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3869baa5-a30d-4235-b1d4-e7a57cbbb5ef
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
correlation: qa-3ad55bc4-a40d-414f-8d30-885f0d2c51bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ad55bc4-a40d-414f-8d30-885f0d2c51bb
Content-Type: application/json

--- request body ---
{"handle":"qa-c6ead84ffbab","password":"****"}

--- response: 401 in 35 ms ---
Date: Fri, 27 Nov 2026 10:59:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3ad55bc4-a40d-414f-8d30-885f0d2c51bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3ad55bc4-a40d-414f-8d30-885f0d2c51bb"}
```
