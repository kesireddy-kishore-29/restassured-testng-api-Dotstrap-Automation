# Transcript: A handle that is already taken is a 409

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.ValidationTest#takenHandleIsA409` |
| Features | FEAT-ACCT-01, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 360 | `qa-68a6f43d-2b62-41cd-a64c-713eb5a0d468` |
| 2 | `POST /v1/accounts` | 409 | 17 | `qa-d112635f-346b-498f-b03f-bc849245bdb6` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-e813e0b4-3701-4c8c-a6b2-e70e86df42c7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7fbe0410-eeef-45d8-b565-f651c19d94dc` |
| 5 | `POST /v1/auth/token` | 401 | 15 | `qa-49bd475f-f96b-44e1-92fb-b79fb32a61d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-68a6f43d-2b62-41cd-a64c-713eb5a0d468

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68a6f43d-2b62-41cd-a64c-713eb5a0d468
Content-Type: application/json

--- request body ---
{"handle":"qa-0ede1a3063c3","displayName":"QA 0ede1a3063c3","password":"****","region":"eu"}

--- response: 201 in 360 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-68a6f43d-2b62-41cd-a64c-713eb5a0d468
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-0ede1a3063c3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_87902c70-d43d-48fe-9beb-d8a2629f9158","handle":"qa-0ede1a3063c3","displayName":"QA 0ede1a3063c3","region":"eu","role":"user","createdAt":"2026-10-28T08:42:58.435522639Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d112635f-346b-498f-b03f-bc849245bdb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d112635f-346b-498f-b03f-bc849245bdb6
Content-Type: application/json

--- request body ---
{"handle":"qa-0ede1a3063c3","displayName":"Copy","password":"****","region":"eu"}

--- response: 409 in 17 ms ---
Date: Wed, 28 Oct 2026 08:42:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d112635f-346b-498f-b03f-bc849245bdb6
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
Content-Length: 245

{"type":"https://reference-service.example/problems/handle-taken","title":"Handle already taken","status":409,"detail":"The handle 'qa-0ede1a3063c3' is in use.","instance":"/v1/accounts","correlationId":"qa-d112635f-346b-498f-b03f-bc849245bdb6"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-e813e0b4-3701-4c8c-a6b2-e70e86df42c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e813e0b4-3701-4c8c-a6b2-e70e86df42c7
Content-Type: application/json

--- request body ---
{"handle":"qa-0ede1a3063c3","password":"****"}

--- response: 200 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-e813e0b4-3701-4c8c-a6b2-e70e86df42c7
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_87902c70-d43d-48fe-9beb-d8a2629f9158"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7fbe0410-eeef-45d8-b565-f651c19d94dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7fbe0410-eeef-45d8-b565-f651c19d94dc
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7fbe0410-eeef-45d8-b565-f651c19d94dc
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-49bd475f-f96b-44e1-92fb-b79fb32a61d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-49bd475f-f96b-44e1-92fb-b79fb32a61d6
Content-Type: application/json

--- request body ---
{"handle":"qa-0ede1a3063c3","password":"****"}

--- response: 401 in 15 ms ---
Date: Wed, 28 Oct 2026 08:42:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-49bd475f-f96b-44e1-92fb-b79fb32a61d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-49bd475f-f96b-44e1-92fb-b79fb32a61d6"}
```
