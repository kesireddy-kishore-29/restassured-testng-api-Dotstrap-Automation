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
| 1 | `POST /v1/accounts` | 201 | 420 | `qa-12effc81-85d5-4707-b591-7d0d2787c286` |
| 2 | `POST /v1/auth/token` | 200 | 82 | `qa-e1616f58-e4c0-416d-a663-d14358daceb4` |
| 3 | `PATCH /v1/accounts/me` | 200 | 69 | `qa-ade2b259-399f-406e-b25a-bab977496f09` |
| 4 | `GET /v1/accounts/me` | 200 | 29 | `qa-0d9cc60e-97c6-4f8a-8e2b-7a72a0fae1f9` |
| 5 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-8b041067-c9ac-461d-b0f3-20182b8df014` |
| 6 | `POST /v1/auth/token` | 401 | 31 | `qa-7c021489-667e-4820-aeb1-90ca31e1091b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-12effc81-85d5-4707-b591-7d0d2787c286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12effc81-85d5-4707-b591-7d0d2787c286
Content-Type: application/json

--- request body ---
{"handle":"qa-6296cd17e551","displayName":"QA 6296cd17e551","password":"****","region":"eu"}

--- response: 201 in 420 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-12effc81-85d5-4707-b591-7d0d2787c286
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
Location: /v1/accounts/qa-6296cd17e551
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d911a1a0-2b51-4aa5-9bf2-0f2328a072df","handle":"qa-6296cd17e551","displayName":"QA 6296cd17e551","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.168008888Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-e1616f58-e4c0-416d-a663-d14358daceb4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1616f58-e4c0-416d-a663-d14358daceb4
Content-Type: application/json

--- request body ---
{"handle":"qa-6296cd17e551","password":"****"}

--- response: 200 in 82 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1616f58-e4c0-416d-a663-d14358daceb4
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d911a1a0-2b51-4aa5-9bf2-0f2328a072df"}
```

## 3. PATCH /v1/accounts/me

```text
#3 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-ade2b259-399f-406e-b25a-bab977496f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ade2b259-399f-406e-b25a-bab977496f09
Content-Type: application/json

--- request body ---
{"displayName":"Ava Lindqvist"}

--- response: 200 in 69 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-ade2b259-399f-406e-b25a-bab977496f09
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

{"id":"acc_d911a1a0-2b51-4aa5-9bf2-0f2328a072df","handle":"qa-6296cd17e551","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.168008888Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d9cc60e-97c6-4f8a-8e2b-7a72a0fae1f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d9cc60e-97c6-4f8a-8e2b-7a72a0fae1f9
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Sat, 07 Nov 2026 08:55:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d9cc60e-97c6-4f8a-8e2b-7a72a0fae1f9
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

{"id":"acc_d911a1a0-2b51-4aa5-9bf2-0f2328a072df","handle":"qa-6296cd17e551","displayName":"Ava Lindqvist","region":"eu","role":"user","createdAt":"2026-11-07T08:55:03.168008888Z"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8b041067-c9ac-461d-b0f3-20182b8df014

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b041067-c9ac-461d-b0f3-20182b8df014
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8b041067-c9ac-461d-b0f3-20182b8df014
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
correlation: qa-7c021489-667e-4820-aeb1-90ca31e1091b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c021489-667e-4820-aeb1-90ca31e1091b
Content-Type: application/json

--- request body ---
{"handle":"qa-6296cd17e551","password":"****"}

--- response: 401 in 31 ms ---
Date: Sat, 07 Nov 2026 08:55:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7c021489-667e-4820-aeb1-90ca31e1091b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7c021489-667e-4820-aeb1-90ca31e1091b"}
```
